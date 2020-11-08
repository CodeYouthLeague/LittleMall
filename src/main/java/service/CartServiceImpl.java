package service;

import entity.Cart;
import entity.User;
import mapper.CartDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Resource
    private CartDao cartDao;

    @Override
    public boolean addCart(Cart cart) {
        return cartDao.insertCart(cart) == 1;
    }

    @Override
    public List<Cart> selectCarts() {
        return cartDao.selectCarts();
    }

    @Override
    public boolean removeCart(Cart cart) {
        return cartDao.deleteCart(cart) == 1;
    }

    @Override
    public boolean updateCart(Cart cart) {
        return cartDao.updateCart(cart) == 1;
    }

    @Override
    public List<Cart> selectCartById(User user) {
        return cartDao.selectCartById(user);
    }
}
