package com.webjjang.board.dao;

import java.sql.*;
import java.util.*;
import com.webjjang.board.dto.*;
import com.webjjang.util.db.DBInfo;

public class BoardDAO {

    public List<BoardDTO> list() throws Exception { // 이 메소드 사용처에서 예외처리 필요하다
        // 반환객체
        List<BoardDTO> list = null;
        // need 객체 선언
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        // 확인용
        System.out.println("BoardDAO.list()");

        try {
            // 1+2
            con = DBInfo.getConnection();
            // 3. sql
            String sql = "select no, title, writer, writeDate, hit " + " from board order by no desc";
            // 4. 실행객체
            pstmt = con.prepareStatement(sql);
            // 5. 실행
            rs = pstmt.executeQuery();
            // 6. 표시 > list에 담기
            if (rs != null) {
                while (rs.next()) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    BoardDTO dto = new BoardDTO();
                    dto.setNo(rs.getInt("no"));
                    dto.setTitle(rs.getString("title"));
                    dto.setWriter(rs.getString("writer"));
                    dto.setWriteDate(rs.getString("writedate"));
                    dto.setHit(rs.getInt("hit"));
                    list.add(dto);
                }
            }

        } catch (Exception e) {
            e.getStackTrace();
            throw new Exception("게시판 리스트 처리하는 중 오류가 발생되었습니보벳따우");
        } finally {
            DBInfo.close(con, pstmt, rs);
        }

        return list;
    }

}