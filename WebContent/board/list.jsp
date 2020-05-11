<%@page import="com.webjjang.board.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
// 이곳은 자바부분 입니다.
// DAO가 필요하다. 생성 - 호출
BoardDAO dao = new BoardDAO();
request.setAttribute("list", dao.list());
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 리스트</title>

<!-- Bootstrap + jQuery 라이브러리 등록 -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<!-- 내용 -->
	<h2>list.jsp 게시판 리스트</h2>

	<div class="container">


		<ul class="list-group">

			<c:forEach items="${list }" var="dto">
				<li class="list-group-item dateRow">
					<div>
						<span class="no"> ${dto.no } </span> . ${dto.title }
					</div>
					<div>
						${dto.writer } (${dto.writeDate }) <span class="badge pull-right">
							${dto.hit } </span>
					</div>

				</li>
			</c:forEach>
		</ul>

	</div>



</body>

</html>