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
        int num = userDao.insertUser(user);
        return num;
    }

    @Override
    public List<User> selectUsers() {
        return userDao.selectUsers();
    }
}
