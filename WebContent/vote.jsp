<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>前台投票</title>

<style type="text/css">
form input{
margin-top:20px;
}
button{background-color:#00BFFF;color:#FFF;width:100px;height:25px;margin-top:30px;}
</style>

</head>
<body  style="background-image:url(./img/A.jpg);background-repeat:repeat-x">
<%
     String path = request.getContextPath();
     String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
     pageContext.setAttribute("basePath", basePath);//只有这样才能被EL${pageScope.basePath }解析。
//否则只能用JSTL<%=basepath>
%>

	<div style="margin:0 auto;width:960px;height:1000px;border:5px #00BFFF solid; ">
		<div><img src="<%=basePath%>img/j9.png" width="960px"></div>
		
		<div><img src="<%=basePath%>img/t3.png" width="950px"></div><br>
		<center>
		<div>
			<form action="./IndexPost" method="post" style="color:black;font-weight:bold;">
			总票数:${topic.count1+topic.count2+topic.count3+topic.count4 }
			<input type="hidden" name="id" value="${topic.id}"/><br><br>
			主&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;题:<input type="text" name="title" value="${topic.title}" /><br>
			开始时间:<input type="text" name="startTime" value="${topic.startTime }"/><br>
			终止时间:<input type="text" name="endStartTime"  value="${topic.endTime }" /><br>
			<br><br>
			请选择你想投的选项:<br>	
			<input type="radio" name="option" value="1">${topic.option1 } 票数${topic.count1 }<br>
			<input type="radio" name="option" value="2">${topic.option2 } 票数${topic.count2 }<br>
			<input type="radio" name="option" value="3">${topic.option3} 票数${topic.count3}<br>
			<input type="radio" name="option" value="4">${topic.option4 } 票数${topic.count4 }<br>
			<input type="submit"  value="确认投票" style="background-color:#00BFFF;color:#fff;width:100px;">
			</form>
			<a href="list.jsp"><button >返回主页</button></a>	
		</div>
		</center>
	<center>
	<div style="margin-top:160px;color:#00BFFF">	
   		 <div ><img src="img/C.jpg" style="border-radius:50%;"width=500px ></div>
				<p><br>
    	 		 <br><br>	
    	 		 <br></p>
	</div>
</center>
</div>
</body>
</html>