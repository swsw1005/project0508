package com.webjjang.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {

    private int no;
    private String title, content, writer, writeDate;
    private int hit, reply_cnt;;
    private String pw;

    @Override
    public String toString() {

        String temp = "";
        temp += "BoardDTO [ no : ";
        temp += no;
        temp += ", title : ";
        temp += title;
        temp += ", writer : ";
        temp += writer;
        temp += ", writeDate : ";
        temp += writeDate;
        temp += ", hit : ";
        temp += hit;
        temp += " ] ";

        return temp;
    }

}