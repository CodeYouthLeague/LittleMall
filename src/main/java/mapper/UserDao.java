package mapper;

import entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 添加用户
     * @param user 新用户
     * @return 1 表示添加成功 0 表示添加失败
     */
    int insertUser(User user);

    /**
     * 查询所有用户
     * @return 所有用户
     */
    List<User> selectUser();
}
