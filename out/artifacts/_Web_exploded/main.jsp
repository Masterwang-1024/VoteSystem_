<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主界面</title>
<style type="text/css">
table th{
	border:1px black solid;
	width:105px;
}
table tr td{
	border:2px #00BFFF solid;
	text-align:center;
	width:105px;
}
button{background-color:#00BFFF;width:105px;border-radious:10px;color:#FFF;}
</style>
</head>
<body style="background-image:url(./img/A.jpg);background-repeat:repeat-x">
<div style="margin:0 auto;width:960px;height:auto;border:5px #00BFFF solid; ">

<center style="color:#000FFF;font-weight:bold;">
当前管理员:${user.username}已登录
</center>
<div style="align:center;">

<table >
	<tr><th>编号</th><th>标题</th><th>选项A</th><th>选项B</th><th>选项C</th><th>选项D</th><th>开始时间</th><th>终止时间</th><th>总票数</th><th style="width:180px;">操作</th></tr>
	<c:forEach items="${list}" var="topic">
		<tr>
			<td>${topic.id}</td>
			<td><!--  <a href="VoteServlet?id=${topic.id }">${topic.title }</a>-->${topic.title }</td>
			<td>${topic.option1 }</td>
			<td>${topic.option2}</td>
			<td>${topic.option3 }</td>
			<td>${topic.option4}</td>
			<td>${topic.startTime}</td>
			<td>${topic.endTime}</td>
			<td>${topic.count1+topic.count2+topic.count3+topic.count4 }</td>
			<td>
			<a href="./QueryPost?id=${topic.id}"><button>修改</button></a>
			<a href="./DeletePost?id=${topic.id}"><button>删除</button></a>
	
			</td>
			
		</tr>
	</c:forEach>
</table>
<br>
<center>
<a href="./addvote.jsp"><button>发起投票</button></a>
<a href="./index.jsp"><button>退出登录</button></a>
</center>

</div>
</div>
</body>
</html>
