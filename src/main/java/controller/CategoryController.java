package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CategoryService;
import service.ProductService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    @Resource
    private ProductService productService;

    @RequestMapping("/selectProductList")
    private ModelAndView selectProductList(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        request.setAttribute("flist",categoryService.selectFatherCategory());
        request.setAttribute("clist",categoryService.selectSonCategory());

        String fid = request.getParameter("fid");
        String cid = request.getParameter("cid");

        if (fid != null) {
            modelAndView.addObject("list",productService.selectByFid(Integer.parseInt(fid)));
        }

        if (cid != null) {
            modelAndView.addObject("list",productService.selectByCid(Integer.parseInt(cid)));
        }
        modelAndView.setViewName("forward:/productlist.jsp");
        return modelAndView;
    }

    @RequestMapping("/indexSelect")
    private ModelAndView indexSelect(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("flist",categoryService.selectFatherCategory());
        modelAndView.addObject("clist",categoryService.selectSonCategory());
        modelAndView.setViewName("forward:/index.jsp");
        return modelAndView;
    }
}
