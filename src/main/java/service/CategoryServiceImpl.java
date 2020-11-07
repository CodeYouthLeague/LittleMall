package service;

import entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public int addCategory(Category category) {
        return 0;
    }

    @Override
    public List<Category> selectAllCategory() {
        return null;
    }

    @Override
    public int removeCategory(Category category) {
        return 0;
    }

    @Override
    public int updateCategory(Category category) {
        return 0;
    }
}
