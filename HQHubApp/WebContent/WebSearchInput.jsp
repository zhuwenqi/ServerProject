<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<tr>
   		<s:form action="/searchByFid" method="post">
    	<s:label value="航班"></s:label>
   		<s:textfield name="fid" label="航班号" />
    	<s:textfield name="fdate" label="日期（YYYY/MM/DD）" />
    	<s:submit value="查询航班" />
   		</s:form>
   </tr>
</body>
</html>