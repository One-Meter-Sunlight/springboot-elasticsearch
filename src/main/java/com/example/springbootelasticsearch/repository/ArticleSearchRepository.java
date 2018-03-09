package com.example.springbootelasticsearch.repository;

import com.example.springbootelasticsearch.entity.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * ArticleSearchRepository
 * <p>
 * Create by CK on 2018/3/9 13:43
 */
@Repository
public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long> {
}
