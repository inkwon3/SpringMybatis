<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	 <!-- 게시판 목록 나오기 -->
	 	<div align="center">
	 		<h1>게시판 목록</h1>
			<table border="1" style= "text-align: center;">
				<thead>
					<tr>
						<th style= "text-align: center;">번호</th>
						<th style= "text-align: center;">제목</th>
						<th style= "text-align: center;">작성자</th>
						<th style= "text-align: center;">작성일</th>
					</tr>
				</thead>
					<tbody>
						<c:forEach var="bbs" items="${list }">
							<tr>
								<td>${bbs.bbsID}</td>
								<td><a href="view?bbsID=${bbs.bbsID}">${bbs.bbsTitle}</a></td>
								<td>${bbs.userID}</td>
								<td>${bbs.bbsDate}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			<a href="writeForm">글쓰기</a>
		</div>
	<footer>
	<h3 style="text-align: center;">copyright &copy; InKwon</h3>
	</footer>
</body>
</html>