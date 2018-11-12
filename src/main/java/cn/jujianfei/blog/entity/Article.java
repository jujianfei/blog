package cn.jujianfei.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author JuJianFei
 * @date 2018/11/12 15:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GenericGenerator(name = "autoGenerator", strategy = "uuid")
    @GeneratedValue(generator = "autoGenerator")
    private String id;

    private String title;

    private String content;

    private Long createdAt;

    private Long updatedAt;

}
