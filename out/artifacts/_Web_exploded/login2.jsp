<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理</title>

<style>
button{background-color:#00BFFF;color:#FFF;width:140px;height:25px;margin-top:30px;}
</style>

<script type="text/javascript">
<c:if test="${result==-1}">
	alert("用户名输入有误！");
</c:if>
<c:if test="${result==-2}">
	alert("密码输入错误！");
</c:if>

</script>
</head>
<body style="background-image:url(./img/A.jpg);background-repeat:repeat-x">
<center>
	<div style="width:500px;height:400px;margin-top:130px;border:5px #00BFFF solid;">
		<div style="border-radius:20px"><img src="img/t3.png" width="500px" height="120px"></div>	
			<div style="width:145px;height:280px;float:left;"><img src="img/t1.jpg" style="border-radius:50%;margin-top:55px;" width=140px height=140px;></div>
			<div style="width:350px;height:280px; float:righ         t;">
				<form action="./LoginPost2" method="post" style="color:black" ><br><br>
				<div style="font-weight:bold;color:#00BFFF;font-size:24px;">欢迎登录!</div><br>
				用户名:<input type="text" name="username" style="width:150px;margin-right:50px;"><br><br><br>
				密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="password" name="password" style="width:150px;margin-right:50px;"><br><br><br>
					<input type="submit" value="确认登录" style="background-color:#00BFFF;color:white;width:140px;">
				</form>
				
				<a  href="register.jsp"><button>注册用户</button></a><br>	
    </div>
			
	</div>
	
   

</center>
</body>
</html>