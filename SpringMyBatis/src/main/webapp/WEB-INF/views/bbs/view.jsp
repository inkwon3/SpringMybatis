<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <div align="center">
	 	<h1>글 보기</h1>
		<table style="text-align: center;" border="1">
			<tbody>
				<tr>
					<td style="width: 20%">글 제목</td>
					<td colspan="2">${bbsVO.bbsTitle}</td>
				</tr>
				<tr>
					<td>작성자</td>
					<td colspan="2">${bbsVO.userID}</td>
				</tr>
				<tr>
					<td>작성일자</td>
					<td colspan="2">${bbsVO.bbsDate}</td>
				</tr>	
				<tr>
					<td>내용</td>
					<td colspan="2" style="min-height: 200px; text-align: left;">${bbsVO.bbsContent}</td>
				</tr>		
			</tbody>
		</table>
		
		<a href="list">목록</a>
		<a href="updateForm?bbsID=${bbsVO.bbsID}">수정</a>
		<a onclick="return confirm('정말로 삭제하시겠습니까?')" href="delete?bbsID=${bbsVO.bbsID}">삭제</a>
	</div>
	<footer>
		<h3 style="text-align: center;">copyright &copy; InKwon</h3>
	</footer>
</body>
</html>