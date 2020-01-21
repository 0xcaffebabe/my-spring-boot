package wang.ismy.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.ismy.spring.boot.service.HelloService;

/**
 * @author MY
 * @date 2020/1/21 16:04
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("index")
    public String index(){
        return helloService.run();
    }
}
