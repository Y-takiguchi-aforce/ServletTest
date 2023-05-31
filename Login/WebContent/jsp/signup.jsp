<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="signup" method="post">
	<p>ID（10文字以内）<input type="text" name="id" value="${param.id }" required ></p>
	<p>パスワード（15文字以内）<input type="password" name="pw" required></p>
	<p>ユーザー名（10文字以内）<input type="text" name="user" required></p>
	<p><input type="submit" value="登録"></p>

</form>



</body>
</html>