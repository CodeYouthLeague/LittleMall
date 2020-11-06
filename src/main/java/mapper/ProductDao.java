package mapper;

import entity.Product;

import java.util.List;

public interface ProductDao {
    /**
     * 插入商品
     * @param product 商品
     * @return 1 表示插入成功 0 表示插入失败
     */
    int insertProduct(Product product);

    /**
     * 查询所有商品
     * @return 所有商品
     */
    List<Product> selectProducts();

    /**
     * 删除商品
     * @param product 商品
     * @return 1 表示删除成功 0 表示删除失败
     */
    int deleteProduct(Product product);

    /**
     * 更新商品信息
     * @param product 商品
     * @return 1 表示更新成功 0 表示更新失败
     */
    int updateProduct(Product product);
}
