<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户注册</title>
<script type="text/javascript"> 


function register(){
	alert("恭喜你注册成功！");
}
function zhuce(form){
	if(form.username.value==""){
		alert("用户名不能为空");
		form.uername.focus();
		return false;
	}
	if(form.password.value==""){
		alert("密码不能为空");
		form.password.focus();
		return false;
	}
}
</script> 
<style>
button{background-color:#00BFFF;color:#FFF;width:140px;height:25px;margin-top:30px;}
</style>
</head>
<body style="background-image:url(./img/A.jpg);background-repeat:repeat-x">



<center>
	    <div style="width:500px;height:400px;margin-top:130px;border:5px #00BFFF solid;">
		<div style="border-radius:20px"><img src="img/t3.png" width="500px" height="120px"></div>	
			<div style="width:145px;height:280px;float:left;"><img src="img/H.jpg" 
			style="border-radius:50%;margin-top:55px;" width=140px height=140px;></div>
			<div style="width:350px;height:280px; float:right;">
			
<div>
<h3 style="color:#00BFFF">用户注册</h3>
    <form action="./RegisterPost" method="post" onSubmit="return zhuce(this)" >  
       	用户名:<input type="text" name="username" style="width:150px;margin-right:50px;"><br><br><br>
		密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="password" name="password" style="width:150px;margin-right:50px;"><br><br>
		<button type="submit" onclick="return register();">立即注册</button>
    </form>
     <a href="./login.jsp"><button>后台管理</button></a>
    </div></div></div>
 </center>
</body>  

</html>