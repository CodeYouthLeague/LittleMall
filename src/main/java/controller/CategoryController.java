package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CategoryService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/Category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;
}
