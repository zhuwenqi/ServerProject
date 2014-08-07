<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Login</title>
    
 <meta http-equiv="pragma" content="no-cache">
 <meta http-equiv="cache-control" content="no-cache">
 <meta http-equiv="expires" content="0">    
 <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
 <meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
   
   <s:form action="/testSaveData" method="post">
    <s:label value="输入"></s:label>
    <s:textfield name="sid" label="id" />
    <s:textfield name="stime" label="时间" />
    <s:textfield name="sdata" label="数据" />
    <s:submit value="保存" />
   </s:form>
  
  </body>
</html>