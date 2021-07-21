<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>投票界面</title>
<style type="text/css">
table th{
	border:1px black solid;
}
table tr td{
	border:1px #00BFFF solid;
	text-align:center;
}
#b:hover{
	background-color:#00BFFF;
}
button{background-color:#00BFFF; color:#FFF;width:191px;border-radious:10px;color:#FFF;}
</style>
</head>
<body style="background-image:url(./img/A.jpg);background-repeat:repeat-x">
<center>
<h1>欢迎来投票哦</h1>
<div style="margin:0 auto;width:960px;height:auto;border:5px #00BFFF solid; ">
	
	<table >  
		<tr><th width="191px">编号</th><th width="191px">课程</th><th width="191px">开始时间</th><th width="191px">终止时间</th><th width="191px">总票数</th></tr>
		<c:forEach items="${list}" var="topic"><br>
		<tr >
			<td>${topic.id}</td>
			<td id="b"><a href="VotePost?id=${topic.id}">${topic.title}</a></td>
			<td>${topic.startTime}</td>
			<td>${topic.endTime}</td>
			<td>${topic.count1+topic.count2+topic.count3+topic.count4 }</td>
		</tr>
		</c:forEach>
	</table><br><br>
	
	<a href="./index.jsp"><button>返回主页</button></a>

	<p style="color:#0000FF">小提示:请点击标题进行投票!</p>
	
</div>
</center>
</body>
</html>