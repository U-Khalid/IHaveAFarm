<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <base href="<%=basePath%>"> 
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<LINK rel="Bookmark" href="/favicon.ico" >
<LINK rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Hui/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Hui/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Hui/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Hui/static/h-ui.admin/skin/blue/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Hui/static/h-ui.admin/css/style.css" />

<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>修改帐号</title>
</head>
     <style type="text/css">
     	#tableID {	
        	margin-bottom:20px; 	
        	}
        table th {
        height:30px;
        text-align:center;
        }
        table td {
        height:20px;
        text-align:center;
        }
        #addID{
        margin-top:10px; 	
        }
		
    </style>


<body>
<article class="page-container">
	<form action="" method="post" class="form form-horizontal" id="form-member-add" enctype="multipart/form-data">
		<input type="hidden" id="posstr"  name="posstrn" value="">
		
		<div class="row cl" id="etime">
			<label class="form-label col-xs-4 col-sm-3">用户名：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  value="${account} " id="account" name="account" style="width:500px;">
			</div>
		</div>
		
		
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">新密码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="password" class="input-text" placeholder="请输入新密码(5-16位)" id="password" name="password" style="width:500px;">
			</div>
		</div>
		
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">确认密码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="password" class="input-text" placeholder="请确认密码(5-16位)" id="password2" name="password2" style="width:500px;">
			</div>
		</div>
		
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input class="btn btn-danger radius" type="button" value="&nbsp;&nbsp;确定修改&nbsp;&nbsp;" onclick="editUser()">
			</div>
		</div>

	</form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/static/h-ui.admin/js/H-ui.admin.js"></script>
<!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common.js"></script>
<script type="text/javascript">
 
function editUser(){
	if($("#password").val()==""){layer.alert("请输入密码"); return;} 
	if($("#password2").val()==""){layer.alert("请输入密码"); return;} 
	var s1 = $("#password").val();
	var s2 = $("#password2").val();
	if(s1 != s2){layer.alert("两次密码不一样，请重新输入！"); return;} 
	var formData = new FormData($("#form-member-add")[0]); 
	$.ajax({
	  url: "${pageContext.request.contextPath}/user/editUser",
	  type: "POST",
	  data: formData,
	  processData: false,  // 不处理数据
	  contentType: false ,  // 不设置内容类型
	  success: function(data) {
		  if(data==1){
			  layer.confirm("修改成功！",{btn:['返回帐号列表','继续修改']},function(index){
	       		 	layer_close();
           });
		  }else{
			  layer.alert("修改失败！");
		  }
	     }, 
	     error: function(data) {   
	    	 layer.alert("添加失败！");
	     } 
	});
}


     
</script>
</body>
</html>