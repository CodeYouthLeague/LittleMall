package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ProductService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/Product")
public class ProductController {
    @Resource
    private ProductService productService;
}
