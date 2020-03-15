<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>新闻系统用户登录</title>
<link href="${pageContext.servletContext.contextPath }/css/login.css" rel="stylesheet" rev="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jQuery1.7.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery1.42.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery.SuperSlide.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/Validform_v5.3.2_min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	var $tab_li = $('#tab ul li');
	$tab_li.hover(function(){
		$(this).addClass('selected').siblings().removeClass('selected');
		var index = $tab_li.index(this);
		$('div.tab_box > div').eq(index).show().siblings().hide();
	});	
});
</script>
<script type="text/javascript">
$(function(){
/*学生登录信息验证*/
$("#stu_username_hide").focus(function(){
 var username = $(this).val();
 if(username=='输入姓名'){
 $(this).val('');
 }
});
$("#stu_username_hide").focusout(function(){
 var username = $(this).val();
 if(username==''){
 $(this).val('输入姓名');
 }
});
$("#stu_password_hide").focus(function(){
 var username = $(this).val();
 if(username=='输入密码'){
 $(this).val('');
 }
});
$("#stu_password_hide").focusout(function(){
 var username = $(this).val();
 if(username==''){
 $(this).val('输入密码');
 }
});
$("#stu_code_hide").focus(function(){
 var username = $(this).val();
 if(username=='输入验证码'){
 $(this).val('');
 }
});
$("#stu_code_hide").focusout(function(){
 var username = $(this).val();
 if(username==''){
 $(this).val('输入验证码');
 }
});
$(".stu_login_error").Validform({
	tiptype:function(msg,o,cssctl){
		var objtip=$(".stu_error_box");
		cssctl(objtip,o.type);
		objtip.text(msg);
	},
	ajaxPost:true
});
/*管理员登录信息验证*/
$("#tea_username_hide").focus(function(){
 var username = $(this).val();
 if(username=='输入管理员号'){
 $(this).val('');
 }
});
$("#tea_username_hide").focusout(function(){
 var username = $(this).val();
 if(username==''){
 $(this).val('输入管理员号');
 }
});
$("#tea_password_hide").focus(function(){
 var username = $(this).val();
 if(username=='输入密码'){
 $(this).val('');
 }
});
$("#tea_password_hide").focusout(function(){
 var username = $(this).val();
 if(username==''){
 $(this).val('输入密码');
 }
});
$("#tea_code_hide").focus(function(){
 var username = $(this).val();
 if(username=='输入验证码'){
 $(this).val('');
 }
});
$("#tea_code_hide").focusout(function(){
 var username = $(this).val();
 if(username==''){
 $(this).val('输入验证码');
 }
});
$(".tea_login_error").Validform({
	tiptype:function(msg,o,cssctl){
		var objtip=$(".tea_error_box");
		cssctl(objtip,o.type);
		objtip.text(msg);
	},
	ajaxPost:true
});
 
 
$("#sec_username_hide").focusout(function(){
 var username = $(this).val();
 if(username==''){
 $(this).val('输入教务号');
 }
});
$("#sec_password_hide").focus(function(){
 var username = $(this).val();
 if(username=='输入密码'){
 $(this).val('');
 }
});
$("#sec_password_hide").focusout(function(){
 var username = $(this).val();
 if(username==''){
 $(this).val('输入密码');
 }
});
$("#sec_code_hide").focus(function(){
 var username = $(this).val();
 if(username=='输入验证码'){
 $(this).val('');
 }
});
$("#sec_code_hide").focusout(function(){
 var username = $(this).val();
 if(username==''){
 $(this).val('输入验证码');
 }
});
$(".sec_login_error").Validform({
	tiptype:function(msg,o,cssctl){
		var objtip=$(".sec_error_box");
		cssctl(objtip,o.type);
		objtip.text(msg);
	},
	ajaxPost:true
});
});
</script>
<script type="text/javascript">
$(function(){
	$(".screenbg ul li").each(function(){
		$(this).css("opacity","0");
	});
	$(".screenbg ul li:first").css("opacity","1");
	var index = 0;
	var t;
	var li = $(".screenbg ul li");	
	var number = li.size();
	function change(index){
		li.css("visibility","visible");
		li.eq(index).siblings().animate({opacity:0},3000);
		li.eq(index).animate({opacity:1},3000);
	}
	function show(){
		index = index + 1;
		if(index<=number-1){
			change(index);
		}else{
			index = 0;
			change(index);
		}
	}
	t = setInterval(show,8000);
	//根据窗口宽度生成图片宽度
	var width = $(window).width();
	$(".screenbg ul img").css("width",width+"px");
	//根据学生登录来后端校验
//	$("#studl").click(function(){

	    $("#formstu").submit(function(e){
		 $.ajax({
				url: "${pageContext.servletContext.contextPath }/change/useinfocheck?state="+1,
				type: "post",
				data:$('#formstu').serialize() ,
				success: function(result){	
					if(result=="100"){
						$(location).attr("href","../custmain")						
					}
					else if(result=="200"){
					     alert("用户名或密码错误，请重新输入")	
					}else{
						alert("用户名不存在，请联系管理员")
					}
				},
				error:function(result){
					alert("falth")
				}
			});
	})
 
});
</script>
</head>

<body>
<div id="tab">

  <div class="tab_box"> 
    <!-- 学生登录开始 -->
    <div>
      <div class="stu_error_box"></div>
      <form id="formstu" method="post" class="stu_login_error">
        <div id="username">
          <label>姓&nbsp;&nbsp;&nbsp;名：</label>
          <input type="text" id="custName" name="custName" placeholder="输入姓名" nullmsg="姓名不能为空！"/>
          <!--ajaxurl="demo/valid.jsp"--> 
        </div>
        <div id="password">
          <label>密&nbsp;&nbsp;&nbsp;码：</label>
          <input type="password" id="custPassworld" name="custPassworld" placeholder="输入密码" nullmsg="密码不能为空！"/>
        </div>
        
        <div id="login">
          <button type="submit" id="studl">登录</button>
        </div>
      </form>
    </div>
   <!-- 学生登录结束-->
   <!-- 管理员登录开始-->
    <div class="hide">
     <div class="tea_error_box"></div>
      <form id="formteach" method="post" >
        <div id="username">
          <label>管理员号：</label>
          <input type="text" id="tea_username_hide" name="username" value="输入管理员号" />
          <!--ajaxurl="demo/valid.jsp"--> 
        </div>
        <div id="password">
          <label>密&nbsp;&nbsp;&nbsp;码：</label>
          <input type="password" id="tea_password_hide" name="password" value="输入密码" nullmsg="密码不能为空！"   />
        </div>
        
        <div id="login">
          <button type="submit">登录</button>
        </div>
      </form>
    </div>

  
 
</div>
<div class="screenbg">
 
</div>
</body>
</html>
