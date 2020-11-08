package service;

import entity.Cart;
import entity.User;
import mapper.CartDao;

import java.util.List;

public interface CartService {
    /**
     * 添加购物车商品
     * @param cart 购物车商品
     * @return 1 表示添加成功 0 表示添加失败
     */
    boolean addCart(Cart cart);

    /**
     * 查询购物车中的所有商品
     * @return 所有商品
     */
    List<Cart> selectCarts();

    /**
     * 删除商品
     * @param cart 商品
     * @return 1 表示删除成功 0 表示删除失败
     */
    boolean removeCart(Cart cart);

    /**
     * 更新商品数量信息
     * @param cart 商品
     * @return 1 表示更新成功 0表示更新失败
     */
    boolean updateCart(Cart cart);

    /**
     * 查询当前用户购物车中的所有商品
     * @param user 当前用户
     * @return 所有商品
     */
    List<Cart> selectCartById(User user);
}
