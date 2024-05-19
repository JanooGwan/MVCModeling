package com.example.TestMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @PostMapping("")
    public ArticleDTO insertArticle(@RequestBody ArticleDTO article) {
        return articleService.insertArticle(article);
    }

    @GetMapping("")
    public List<ArticleDTO> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/{id}")
    public ArticleDTO getArticleById(@PathVariable int id) {
        return articleService.getArticleById(id);
    }

    @PutMapping("/{id}")
    public void updateArticleContent(@PathVariable int id, @RequestBody ArticleDTO article) {
        articleService.updateArticleContent(id, article);
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable int id) {
        articleService.deleteArticle(id);
    }
}
