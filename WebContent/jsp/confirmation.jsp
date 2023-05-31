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
		<p>メルマガ種類：<br>
		
		<%String[] magagines = request.getParameterValues("magagines");
		if(magagines != null) {
			for(String magagine: magagines) { 
				%>
				「<%=magagine%>」
			<%} %>
		<%} %>
		
		<p>資料請求希望：</p>
		<%String info = request.getParameter("info");
		if(info.equals("Yes")){ %>
			<%request.getRequestDispatcher("checkedA.jsp").forward(request,response);
			%>
		<%}else{ %>
			<%=info %>
			
		<%} %>

			

</body>
</html>
