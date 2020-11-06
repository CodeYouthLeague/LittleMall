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
    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public List<User> selectUsers() {
        return userDao.selectUsers();
    }

    @Override
    public int removeUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public User selectUserById(String USER_ID) {
        return null;
    }
}
