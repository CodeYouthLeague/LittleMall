package service;

import entity.User;

import java.util.List;

public interface UserService {
    /**
     * 添加用户
     * @param user 新用户
     * @return 1 表示添加成功 0 表示添加失败
     */
    boolean addUser(User user);

    /**
     * 查询所有用户
     * @return 所有用户
     */
    List<User> selectUsers();

    /**
     * 删除不在线用户
     * @param user 用户
     * @return 1 表示删除成功 0 表示删除失败
     */
    boolean removeUser(User user);

    /**
     * 更新用户数据
     * @param user 用户
     * @return 1 表示更新成功 0 表示更新失败
     */
    boolean updateUser(User user);

    /**
     * 通过用户ID查询用户
     * @param USER_ID 用户ID
     * @return 查询结果
     */
    User selectUserById(String USER_ID);
}
