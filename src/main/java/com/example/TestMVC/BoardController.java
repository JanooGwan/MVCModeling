package com.example.TestMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/boards")
public class BoardController {
    @Autowired
    BoardService boardService;

    @PostMapping("")
    public BoardDTO insertBoard(@RequestBody BoardDTO board) {
        return boardService.insertBoard(board);
    }

    @GetMapping("")
    public List<BoardDTO> getAllBoards() {
        return boardService.getAllBoards();
    }

    @GetMapping("/{id}")
    public BoardDTO getBoardById(@PathVariable int id) {
        return boardService.getBoardById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable int id) {
        boardService.deleteBoard(id);
    }
}
