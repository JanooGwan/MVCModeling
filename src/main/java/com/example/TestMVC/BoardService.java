package com.example.TestMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    BoardRepository boardRepository;

    public BoardDTO insertBoard(BoardDTO board) {
        return boardRepository.insertBoard(board);
    }

    public List<BoardDTO> getAllBoards() {
        return boardRepository.getAllBoards();
    }

    public BoardDTO getBoardById(int id) {
        return boardRepository.getBoardById(id);
    }


    public void deleteBoard(int id) {
        boardRepository.deleteBoard(id);
    }
}
