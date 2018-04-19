package com.ghang.springbootes.dao;

import com.ghang.springbootes.domain.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by GaoHangHang 2018-04-18 16:46
 **/
//泛型的参数分别是实体类型和主键类型
public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long> {
}
