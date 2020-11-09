package service;

import entity.User;
import mapper.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    /**
     * 引用类型自动注入@Autowired或者@Resource
     */
    @Resource
    private UserDao userDao;

    @Override
    public boolean addUser(User user) { return userDao.insertUser(user) == 1; }

    @Override
    public List<User> selectUsers() {
        return userDao.selectUsers();
    }

    @Override
    public boolean removeUser(User user) {
        return userDao.deleteUser(user) == 1;
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.updateUser(user) == 1;
    }

    @Override
    public User selectUserById(String USER_ID) {
        return userDao.selectUserById(USER_ID);
    }

    @Override
    public User selectUserByUserIdAndPassword(User user) {
        return userDao.selectUserByUserIdAndPassword(user);
    }
}
