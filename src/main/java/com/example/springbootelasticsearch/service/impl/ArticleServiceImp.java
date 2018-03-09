package com.example.springbootelasticsearch.service.impl;

import com.example.springbootelasticsearch.entity.Article;
import com.example.springbootelasticsearch.repository.ArticleSearchRepository;
import com.example.springbootelasticsearch.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 实现类
 * <p>
 * Create by CK on 2018/3/9 15:46
 */
@Service
public class ArticleServiceImp implements ArticleService {

    @Autowired
    private ArticleSearchRepository articleSearchRepository;

    @Override
    public void save(Article article) {
        articleSearchRepository.save(article);
    }

    @Override
    public void search(String queryString) {

    }

}
