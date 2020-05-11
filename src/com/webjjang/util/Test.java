package com.webjjang.util;

import com.webjjang.board.dao.BoardDAO;

public class Test {

    public static void main(String[] args) throws Exception {
        BoardDAO dao = new BoardDAO();

        for (int i = 0; i < dao.list().size(); i++) {
            System.out.println(dao.list().get(i).toString());
        }
    }

}