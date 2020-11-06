package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CartService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/Cart")
public class CartController {
    @Resource
    private CartService cartService;
}
