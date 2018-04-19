package com.example.springbootes;


import com.ghang.springbootes.SpringbootEsApplication;
import com.ghang.springbootes.dao.ArticleSearchRepository;
import com.ghang.springbootes.domain.Article;
import com.ghang.springbootes.domain.Author;
import com.ghang.springbootes.domain.Tutorial;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by GaoHangHang 2018-04-18 16:52
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootEsApplication.class)
public class ElasticSearchTest {

    @Autowired
    private ArticleSearchRepository articleSearchRepository;
    @Test
    public void testSaveArticleIndex(){
        Author author=new Author();
        author.setId(1L);
        author.setName("tianshouzhi");
        author.setRemark("java developer");

        Tutorial tutorial=new Tutorial();
        tutorial.setId(1L);
        tutorial.setName("elastic search");

        Article article =new Article();
        article.setId(1L);
        article.setTitle("springboot integreate elasticsearch");
        article.setAbstracts("springboot integreate elasticsearch is very easy");
        article.setTutorial(tutorial);
        article.setAuthor(author);
        article.setContent("elasticsearch based on lucene,"
                + "spring-data-elastichsearch based on elaticsearch"
                + ",this tutorial tell you how to integrete springboot with spring-data-elasticsearch");
        article.setPostTime(new Date());
        article.setClickCount(1L);

        articleSearchRepository.save(article);
    }

}