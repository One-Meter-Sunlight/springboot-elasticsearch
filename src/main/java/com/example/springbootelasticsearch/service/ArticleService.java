package com.example.springbootelasticsearch.service;

import com.example.springbootelasticsearch.entity.Article;

/**
 * 接口
 * <p>
 * Create by CK on 2018/3/9 15:45
 */
public interface ArticleService {

    void save(Article article);

    void search(String queryString);
}
