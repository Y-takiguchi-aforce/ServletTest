<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>

<form action="login" method="post" >
	<p>ID（10文字以内）<input type="text" name="id" value="${param.id }" required ></p>
	<p>パスワード（15文字以内）<input type="password" name="pw" required></p>
	<p><input type="submit" value="ログイン"></p>
	<a href="signup.jsp">会員登録が済んでいない人はこちら</a>
</form>

</body>
</html>