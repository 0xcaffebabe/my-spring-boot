package wang.ismy.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MY
 * @date 2020/1/21 16:14
 */
@Controller
public class PageController {

    @RequestMapping("page")
    public String page(){
        return "index";
    }
}
