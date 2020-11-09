package service;

import entity.Category;
import mapper.CategoryDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryDao categoryDao;

    @Override
    public boolean addCategory(Category category) {
        return categoryDao.insertCategory(category) == 1;
    }

    @Override
    public List<Category> selectAllCategory() {
        return categoryDao.selectAllCategory();
    }

    @Override
    public boolean removeCategory(Category category) {
        return categoryDao.deleteCategory(category) == 1;
    }

    @Override
    public boolean updateCategory(Category category) {
        return categoryDao.updateCategory(category) == 1;
    }

    @Override
    public List<Category> selectFatherCategory() { return categoryDao.selectFatherCategory(); }

    @Override
    public List<Category> selectSonCategory() { return categoryDao.selectSonCategory(); }
}
