package com.example.TestMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;

    public ArticleDTO insertArticle(ArticleDTO article) {
        return articleRepository.insertArticle(article);
    }

    public List<ArticleDTO> getAllArticles() {
        return articleRepository.getAllArticles();
    }

    public ArticleDTO getArticleById(int id) {
        return articleRepository.getArticleById(id);
    }

    public void updateArticleContent(int id, ArticleDTO article) {
        articleRepository.updateArticleContent(id, article);
    }

    public void deleteArticle(int id) {
        articleRepository.deleteArticle(id);
    }
}
