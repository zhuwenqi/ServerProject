<%@ page contentType="text/html; charset=gb2312" %> 
<%@ page language="java" %> 
<%@ page import="oracle.jdbc.driver.OracleDriver.*" %>
<%@ page import="java.sql.*" %> 
<% 
//���������� 
String driverName="oracle.jdbc.driver.OracleDriver"; 
//���ݿ��û��� 
String userName="shuniu"; 
//���� 
String userPasswd="shu123"; 
//���ݿ��� 
//String dbName="orapms"; 
//���� 
String tableName="f_1_dynflight"; 
//�����ַ���
String dburl = "jdbc:oracle:thin:@10.125.20.10:1521:orapms";
//String url="jdbc:mysql:///"+dbName+"?user="+userName+"&password="+userPasswd; 
Class.forName("oracle.jdbc.driver.OracleDriver").newInstance(); 
Connection connection=DriverManager.getConnection(dburl,userName,userPasswd); 
Statement statement = connection.createStatement(); 
String sql="SELECT * FROM "+tableName+ " where rownum<=10 order by operation_date desc"; 
ResultSet rs = statement.executeQuery(sql); 
//������ݽ������ 
ResultSetMetaData rmeta = rs.getMetaData(); 
//ȷ�����ݼ������������ֶ��� 
int numColumns=rmeta.getColumnCount(); 
// ���ÿһ������ֵ 
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
out.print("���ݿ�����ɹ�����ϲ��"); 
rs.close(); 
statement.close(); 
connection.close(); 
%> 