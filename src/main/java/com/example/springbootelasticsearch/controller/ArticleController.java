package com.example.springbootelasticsearch.controller;

import com.example.springbootelasticsearch.entity.Article;
import com.example.springbootelasticsearch.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * ArticleController
 * <p>
 * Create by CK on 2018/3/9 13:44
 */
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/add")
    public void testSaveIndex() {
        Article article = new Article();
        article.setId(1L);
        article.setTitle("this is title");
        article.setPostTime(new Date());
        article.setAbstracts("我是摘要");
        article.setContent("this is content ... ");
        article.setClickCount(100L);
        articleService.save(article);
    }

    public void testSearch() {
        String queryString = "spring boot"; // 搜索关键字
        articleService.search(queryString);
    }

}
