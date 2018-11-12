package cn.jujianfei.blog.controller;

import cn.jujianfei.blog.service.ArticleService;
import cn.jujianfei.blog.vo.ArticleVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author JuJianFei
 * @date 2018/11/12 15:45
 */
@RestController
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @PostMapping("/addArticle")
    public void addArticle(ArticleVo articleVo){
        articleService.addArticle(articleVo);
    }

}
