package com.example.TestMVC;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepository {
    static public ArrayList<ArticleDTO> articles;

    static {
        articles= new ArrayList<ArticleDTO>();
        articles.add(new ArticleDTO(1, 1, 1, "안녕하세요", "만나서 반갑습니다", 20200101, 20210101));
    }
    public ArticleDTO insertArticle(ArticleDTO article) {
        articles.add(article);
        return article;
    }

    public List<ArticleDTO> getAllArticles() {
        return articles;
    }

    public ArticleDTO getArticleById(int id) {
        return articles.stream()
                .filter(articleDTO -> articleDTO.getId() == id)
                .findAny()
                .orElse(new ArticleDTO(0, 0, 0, "", "", 0, 0);
    }

    public void updateArticleContent(int id, ArticleDTO article) {
        articles.stream()
                .filter(articleDTO -> articleDTO.getId() == id)
                .findAny()
                .orElse(new ArticleDTO(0, 0, 0, "", "", 0, 0))
                .setContent(article.getContent());
    }

    public void deleteArticle(int id) {
        articles.removeIf(ArticleDTO -> ArticleDTO.getId() == id);
    }
}