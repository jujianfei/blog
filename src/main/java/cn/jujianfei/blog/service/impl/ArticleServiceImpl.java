package cn.jujianfei.blog.service.impl;

import cn.jujianfei.blog.entity.Article;
import cn.jujianfei.blog.repository.ArticleRepository;
import cn.jujianfei.blog.service.ArticleService;
import cn.jujianfei.blog.vo.ArticleVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author JuJianFei
 * @date 2018/11/12 15:41
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleRepository articleRepository;

    @Override
    public Boolean addArticle(ArticleVo articleVo) {
        Article article = new Article();
        article.setTitle(articleVo.getTitle());
        article.setContent(articleVo.getContent());
        article.setCreatedAt(System.currentTimeMillis());
        article.setUpdatedAt(System.currentTimeMillis());
        Article result = articleRepository.save(article);
        if(result != null){
            return true;
        }else {
            return false;
        }
    }

}
