/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CategoryService;
import service.PersonService;
import service.PostService;

/**
 *
 * @author AhmedEldeeb
 */
@Controller
public class MainPageController {

    private CategoryService categoryService;
    private PostService postService;

    @Autowired(required = true)
    @Qualifier(value = "CategoryService")
    public void setPersonService(CategoryService ps) {
        this.categoryService = ps;
    }
    @Autowired(required = true)
    @Qualifier(value = "PostService")
    public void setPostService(PostService ps) {
        this.postService = ps;
    }

    @RequestMapping("/")
    public String ListData(Model model) {
        model.addAttribute("categories", this.categoryService.ListCategory());
       // model.addAttribute("FCPosts", this.postService.listPostsByCategory(1));
        model.addAttribute("FCPosts", this.postService.listPosts());

        return "index";
    }
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public  String  ajaxTest(Model model) {
        //@ResponseBody
        

        return "test";
    }
}
