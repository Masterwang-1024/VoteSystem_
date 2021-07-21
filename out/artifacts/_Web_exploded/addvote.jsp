<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理</title>
<style type="text/css">
form input{
	margin-top:20px;
}
button{background-color:#00BFFF;color:#fff;margin-left:70px;width:153px;}
</style>
</head>
<body style="background-image:url(./img/A.jpg);background-repeat:repeat-x">

	
<center>
<div style="width:300px;height:400px;">
<form action="./AddVotePost" method="post" style="color:blok;">
	主&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;题:<input type="text" name="title"><br>
	开始时间:<input type="date" name="startTime"><br>
	终止时间:<input type="date" name="endTime"><br>
	选&nbsp;&nbsp;项&nbsp;&nbsp;A&nbsp;&nbsp;:<input type="text" name="option1"><br>
	选&nbsp;&nbsp;项&nbsp;&nbsp;B&nbsp;&nbsp;:<input type="text" name="option2"><br>
	选&nbsp;&nbsp;项&nbsp;&nbsp;C&nbsp;&nbsp;:<input type="text" name="option3"><br>
	选&nbsp;&nbsp;项&nbsp;&nbsp;D&nbsp;&nbsp;:<input type="text" name="option4"><br>
	<input type="submit"  value="确认添加" style="background-color:#00BFFF;color:#fff;margin-left:70px;width:153px;">	
</form>
<br>
<a href="list.jsp"><button>取消添加</button></a>
</div>
</center>




</body>
</html>