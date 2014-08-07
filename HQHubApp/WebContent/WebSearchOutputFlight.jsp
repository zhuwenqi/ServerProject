<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.service.hqhub.model.form.FrmFlight" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
    
<%
//String s=(String)request.getAttribute("value");
ArrayList flights = (ArrayList)request.getAttribute("flightList");

%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>航班信息</title>
</head>
<body>
<table border="1">
<tr>
	<td>航班号</td>
	<td>日期</td>
	<td>起飞时间</td>
	<td>起飞地</td>
	<td>预计到达时间</td>
	<td>目的地</td>
	<td>航班状态</td>
</tr>
<%
Iterator it = flights.iterator();
while(it.hasNext())
{
	FrmFlight flight = (FrmFlight)it.next();
%>
<tr>
<td><%=flight.getFlightNo()%></td>
<td><%=flight.getFlightDate()%></td>
<td><%=flight.getStartTime()%></td>
<td><%=flight.getFlightFrom()%></td>
<td><%=flight.getArrTime()%></td>
<td><%=flight.getFlightTo()%></td>
<td><%=flight.getFlightStatus()%></td>
</tr>

<%
}
%>

</table>
</body>
</html>