<%@page contentType="text/html;utf-8" pageEncoding="utf-8"%>

<HTML>
<BODY>
	<%
    String Name=request.getParameter("userName");
    session.setAttribute("LogName", Name);
  %>
	你的名字"<%=Name%>"已经写入session
	<br>
	<a href='check_session.jsp'>check</a>
</BODY>
</HTML>