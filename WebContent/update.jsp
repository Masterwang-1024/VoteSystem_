<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理</title>
<style type="text/css">
form input{
	margin-top:20px;
}
</style>
</head>
<body style="background-image:url(./img/A.jpg);background-repeat:repeat-x">
<div style="margin:0 auto;width:960px;height:1000px;border:3px #00BFFF solid; ">


<center>
当前管理员:${user.username}
<div style="border:3px #00BFFF solid;width:300px;height:400px;">
<form action="./UpdatePost" method="post" style="color:black;font-weight:bold;" >
<input type="hidden" name="id" value="${topic.id }"/><br>
	主&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;题:<input type="text" name="title" value="${topic.title }"><br>
	开始时间:<input type="text" name="startTime" value="${topic.startTime}"><br>
	终止时间:<input type="text" name="endTime" value="${topic.endTime }"><br>
	选&nbsp;&nbsp;项&nbsp;&nbsp;A&nbsp;&nbsp;:<input type="text" name="option1" value="${topic.option1}"><br>
	选&nbsp;&nbsp;项&nbsp;&nbsp;B&nbsp;&nbsp;:<input type="text" name="option2" value="${topic.option2}"><br>
	选&nbsp;&nbsp;项&nbsp;&nbsp;C&nbsp;&nbsp;:<input type="text" name="option3" value="${topic.option3 }"><br>
	选&nbsp;&nbsp;项&nbsp;&nbsp;D&nbsp;&nbsp;:<input type="text" name="option4" value="${topic.option4}"><br>
	<input type="submit"  value="确认修改" style="background-color:#00BFFF;color:#fff;margin-left:66px;width:155px;">	
</form>
</div>

</body>
</html>