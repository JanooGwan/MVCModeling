package com.example.TestMVC;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class ArticleDTO {
    private int id;
    private int writer_id;
    private int board_id;
    private String title;
    private String content;
    private int write_date;
    private int modify_date;
}
