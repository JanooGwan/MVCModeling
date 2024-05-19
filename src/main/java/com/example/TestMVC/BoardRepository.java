package com.example.TestMVC;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardRepository {
    static public ArrayList<BoardDTO> boards;

    static {
        boards= new ArrayList<BoardDTO>();
        boards.add(new BoardDTO(0, ""));
    }
    public BoardDTO insertBoard(BoardDTO board) {
        boards.add(board);
        return board;
    }

    public List<BoardDTO> getAllBoards() {
        return boards;
    }

    public BoardDTO getBoardById(int id) {
        return boards.stream()
                .filter(boardDTO -> boardDTO.getId() == id)
                .findAny()
                .orElse(new BoardDTO(0, ""));
    }


    public void deleteBoard(int id) {
        boards.removeIf(ArticleDTO -> ArticleDTO.getId()==id);
    }
}