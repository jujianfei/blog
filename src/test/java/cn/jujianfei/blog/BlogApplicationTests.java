package cn.jujianfei.blog;

import cn.jujianfei.blog.service.ArticleService;
import cn.jujianfei.blog.vo.ArticleVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

    @Resource
    private ArticleService service;

    @Test
    public void contextLoads() {
        ArticleVo articleVo = new ArticleVo();
        articleVo.setTitle("测试文章标题");
        articleVo.setContent("测试文章内容");
        service.addArticle(articleVo);
    }

}
