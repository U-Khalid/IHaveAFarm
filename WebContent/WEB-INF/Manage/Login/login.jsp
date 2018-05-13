<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/html5shiv.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/respond.min.js"></script>
<![endif]-->
<link href="${pageContext.request.contextPath }/Hui/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/Hui/static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/Hui/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/Hui/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>用户管理</title>
</head>
<body  onkeydown='if(event.keyCode==13){login()}'>
<div class="header"><em>我有一个农场</em></div>
<div class="loginWraper">
  <div id="loginform" class="loginBox">
    <form id="formlogin" class="form form-horizontal" action="${pageContext.request.contextPath }/basic/toLogin" method="post">
      
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <label for="online">
          		<span class="c-red " > ${Error} </span>
           </label>
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
        <div class="formControls col-xs-8">
          <input id="userAccount" name="account" type="text" placeholder="账户" class="input-text size-L" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')" maxlength="11">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
        <div class="formControls col-xs-8">
          <input id="userPassWord" name="password" type="password" placeholder="密码" class="input-text size-L" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')" maxlength="16">
        </div>
      </div>
     
      
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
           <input id="loginbtn"  type="button" class="btn btn-primary radius size-L " value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;" onclick="login()" >
          <input type="reset" class="btn btn-primary radius size-L " value="&nbsp;重&nbsp;&nbsp;&nbsp;&nbsp;置&nbsp;" style="margin-left: 22%;">
        </div>
      </div>
    </form>
  </div>
</div>
<div class="footer">Copyright IHaveAFarmx by H-ui.admin v3.0</div>
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" >
function onkeydown(){
	
	layer.alert("请先输入密码！");
}
function login(){
	var userAccount = $("#userAccount").val();
	var userPassWord = $("#userPassWord").val();
	
	if(userAccount==""){layer.alert("请先输入账户名！");return;}
	if(userPassWord==""){layer.alert("请先输入密码！");return;}
	$("#formlogin").submit();
	
	
}
</script> 

</body>
</html>