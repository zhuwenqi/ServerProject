<%@ page contentType="text/html; charset=gb2312" %> 
<%@ page language="java" %> 
<%@ page import="oracle.jdbc.driver.OracleDriver.*" %>
<%@ page import="java.sql.*" %> 
<% 
//驱动程序名 
String driverName="oracle.jdbc.driver.OracleDriver"; 
//数据库用户名 
String userName="shuniu"; 
//密码 
String userPasswd="shu123"; 
//数据库名 
//String dbName="orapms"; 
//表名 
String tableName="f_1_dynflight"; 
//联结字符串
String dburl = "jdbc:oracle:thin:@10.125.20.10:1521:orapms";
//String url="jdbc:mysql:///"+dbName+"?user="+userName+"&password="+userPasswd; 
Class.forName("oracle.jdbc.driver.OracleDriver").newInstance(); 
Connection connection=DriverManager.getConnection(dburl,userName,userPasswd); 
Statement statement = connection.createStatement(); 
String sql="SELECT * FROM "+tableName+ " where rownum<=10 order by operation_date desc"; 
ResultSet rs = statement.executeQuery(sql); 
//获得数据结果集合 
ResultSetMetaData rmeta = rs.getMetaData(); 
//确定数据集的列数，亦字段数 
int numColumns=rmeta.getColumnCount(); 
// 输出每一个数据值 
out.print("id"); 
out.print("|"); 
out.print("date"); 
out.print("|"); 
out.print("fly_no");
out.print("<br>"); 
while(rs.next()) { 
out.print(rs.getString(1)+" "); 
out.print("|"); 
out.print(rs.getString(3)+" ");
out.print("|"); 
out.print(rs.getString(4)); 
out.print("<br>"); 
} 
out.print("<br>"); 
out.print("数据库操作成功，恭喜你"); 
rs.close(); 
statement.close(); 
connection.close(); 
%> 