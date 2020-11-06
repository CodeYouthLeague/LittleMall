package service;

import entity.User;

import java.util.List;

public interface UserService {
    /**
     * 添加用户
     * @param user 用户
     * @return 1 表示添加成功 0 表示添加失败
     */
    int addUser(User user);

    /**
     * 查询所有用户
     * @return 返回查询结果
     */
    List<User> selectUsers();
}
