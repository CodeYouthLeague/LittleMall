package service;

import entity.Cart;
import entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Override
    public int addCart(Cart cart) {
        return 0;
    }

    @Override
    public List<Cart> selectCarts() {
        return null;
    }

    @Override
    public int removeCart(Cart cart) {
        return 0;
    }

    @Override
    public int updateCart(Cart cart) {
        return 0;
    }

    @Override
    public List<Cart> selectCartById(User user) {
        return null;
    }
}
