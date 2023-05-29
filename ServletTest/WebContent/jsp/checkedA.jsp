<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<p>氏名（必須）：<%=request.getParameter("name")%></p>
		<p>会社：<%=request.getParameter("company")%></p>
		<p>メールアドレス（必須）：<%=request.getParameter("mail")%></p>
		<p>お問い合わせ内容（必須）：<%=request.getParameter("inquiry")%></p>
		<p>メルマガ種類：
		
		<%String[] magagines = request.getParameterValues("magagines");
		if(magagines != null) {
			for(String magagine: magagines) { 
				%>
				「<%=magagine%>」
			<%} %>
		<%} %>
		
		<p>資料請求希望：</p>
		<p>この度は資料請求いただきありがとうございます。</p>
		<p>以下のリンクから資料ダウンロードが可能です。	</p>
		<a href="#">資料ダウンロード</a>
		
</body>
</html>