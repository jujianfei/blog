package cn.jujianfei.blog.repository;

import cn.jujianfei.blog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author JuJianFei
 * @date 2018/11/12 15:37
 */
public interface ArticleRepository extends JpaRepository<Article,String> {

}
