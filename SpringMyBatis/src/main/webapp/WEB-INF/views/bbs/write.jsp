<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="padding-top: 20px;" align="center">
		<h1>글 작성</h1>
		<form method = "post" action="write">
			<table style="text-align: center; width: 400px;" border="1">
				<thead>
					<tr>
						<th colspan="2" style= "text-align: center;">게시판 글쓰기</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td><input type="text" placeholder="작성자ID" name="userID" maxlength="20" style="width: 400px;"></td>
					</tr>
					<tr>
						<td><input type="text" placeholder="글 제목" name="bbsTitle" maxlength="50" style="width: 400px;"></td>
					</tr>
					<tr>
						<td><textarea placeholder="글 내용" name="bbsContent" maxlength="2048" style="height: 350px; width: 400px;"></textarea></td>
					</tr>
				</tbody>
			</table>
			<p><input type="submit" value="글쓰기"></p>				
		</form>
	</div>
	<footer>
		<h3 style="text-align: center;">copyright &copy; InKwon</h3>
	</footer>
</body>
</html>