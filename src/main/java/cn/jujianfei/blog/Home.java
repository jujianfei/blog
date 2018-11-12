package cn.jujianfei.blog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JuJianFei
 * @date 2018/11/6
 */
@RestController
public class Home {

    @GetMapping("/")
    public String index(){
        return "Hello Friend, I am jujianfei.";
    }

}
