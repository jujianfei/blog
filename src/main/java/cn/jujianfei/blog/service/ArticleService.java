package cn.jujianfei.blog.service;

import cn.jujianfei.blog.entity.Article;
import cn.jujianfei.blog.vo.ArticleVo;

/**
 * @author JuJianFei
 * @date 2018/11/12 15:40
 */
public interface ArticleService {

    /**
     * 添加新文章
     * @param articleVo
     * @return
     */
    Boolean addArticle(ArticleVo articleVo);

}
