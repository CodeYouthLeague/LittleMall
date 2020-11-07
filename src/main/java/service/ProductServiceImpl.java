package service;

import entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public int addProduct(Product product) {
        return 0;
    }

    @Override
    public List<Product> selectProducts() {
        return null;
    }

    @Override
    public int removeProduct(Product product) {
        return 0;
    }

    @Override
    public int updateProduct(Product product) {
        return 0;
    }
}
