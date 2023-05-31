<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

<form action="contact" method="post">
	<p>氏名（必須）<input type="text" name="name" required="必須"></p>
	<p>会社<input type="text" name="company" ></p>
	<p>メールアドレス（必須）<input type="text" name="mail" required="必須" ></p>
	<p>お問い合わせ内容（必須）
		<textarea rows="4" cols="20" name="inquiry" required="必須"></textarea></p>
	<p>メルマガ種類
		<input type="checkbox" name="magagines" value="総合案内">総合案内
		<input type="checkbox" name="magagines" value="セミナー案内">セミナー案内
		<input type="checkbox" name="magagines" value="求人採用情報">求人採用情報</p>
	<p>資料請求希望
		<input type="radio" name="info" value="Yes" checked>Yes
		<input type="radio" name="info" value="No">No</p>
	<p><input type="submit" value="送信"></p>
	
</form>

</body>
</html>