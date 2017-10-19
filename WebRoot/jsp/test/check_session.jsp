<%@page contentType="text/html;utf-8" pageEncoding="utf-8"%>

<HTML>
<BODY>
	<%
		String yourName = (String) session.getAttribute("LogName");
		if (yourName == null) {
	%>您还未登录
	<%
		} else {
	%>
	"<%=yourName%>"已经登录
	<%
		}
	%>

	<%
		if (application.getAttribute("counter") == null)
			application.setAttribute("counter", "1");
		else {
			String strnum = null;
			strnum = application.getAttribute("counter").toString();
			int icount = 0;
			icount = Integer.valueOf(strnum).intValue();
			icount++;
			application.setAttribute("counter", Integer.toString(icount));
		}
	%>
	您是第<%=application.getAttribute("counter")%>位访问者！
</BODY>
</HTML>