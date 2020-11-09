package service;

import entity.Product;
import mapper.ProductDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;

    @Override
    public boolean addProduct(Product product) {
        return productDao.insertProduct(product) == 1;
    }

    @Override
    public List<Product> selectProducts() {
        return productDao.selectProducts();
    }

    @Override
    public boolean removeProduct(Product product) {
        return productDao.deleteProduct(product) == 1;
    }

    @Override
    public boolean updateProduct(Product product) {
        return productDao.updateProduct(product) == 1;
    }

    @Override
    public List<Product> selectByFid(int PRODUCT_FID) {
        return productDao.selectByFid(PRODUCT_FID);
    }

    @Override
    public List<Product> selectByCid(int PRODUCT_CID) {
        return productDao.selectByCid(PRODUCT_CID);
    }
}
