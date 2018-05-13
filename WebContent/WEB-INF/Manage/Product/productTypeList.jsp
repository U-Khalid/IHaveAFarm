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
<title>帐号列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 产品管理 <span class="c-gray en">&gt;</span> 产品类别<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<c:if test="${user.account == 'admin'}">
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
	
		 <span class="l">
			<a href="javascript:;" onclick="member_add('添加产品类型','${pageContext.request.contextPath }/product/toAddType ')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加产品类型</a>
		</span> 
	
	 </div>
	</c:if> 
	<div class="mt-20">
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="100">ID</th>
				<th width="100">产品类型名称</th>
				<th width="100">创建时间</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${types}" var="type">
				<tr class="text-c">
					<td><input type="checkbox" name="id" value="${type.id}"/></td>
					<td>${type.id }</td>
					<td>${type.productTypeName}</td>
					
					<td>${type.gmtCreate}</td>
					
					<td class="td-manage">
						<a title="修改" href="javascript:;" onclick="member_edit('修改','${pageContext.request.contextPath }/product/toEditType?id=${type.id}')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
						<c:if test="${user.account == 'admin' }">
						<a title="删除" href="javascript:;" onclick="member_del(this,'${type.id}')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
						</c:if>
					</td>
			</tr>
			
			</c:forEach>
			
		</tbody>
	</table>
	</div>
</div>
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
<script type="text/javascript">
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		]
	});
	
});

function shangyi(title,url,w,h){
	layer_show1(title,url,w,h);
}


function layer_show1(title,url,w,h){
	if (title == null || title == '') {
		title=false;
	};
	if (url == null || url == '') {
		url="404.html";
	};
	if (w == null || w == '') {
		w=800;
	};
	if (h == null || h == '') {
		h=($(window).height() - 50);
	};
	layer.open({
		type: 2,
		area: [w+'px', h +'px'],
		fix: false, //不固定
		maxmin: true,
		shade:0.4,
		title: title,
		content: url,
		end: function () {
            location.reload();
        }
	});
}
/*帐号-添加*/
function member_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url,
		end: function () {
            location.reload();
        }
	});
	layer.full(index);
}

/*帐号-编辑*/
function member_edit(title,url){
	 var index = layer.open({
			type: 2,
			title: title,
			content: url
		});
		layer.full(index);
}

/*帐号-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		 $.ajax({
            type:"POST",
            url:"<%=basePath%>/product/delType",
            data:{"id":id},
            datatype:"json",
            success:function(data){
                layer.msg('已删除!',{icon:1,time:1000});
                setTimeout("location.reload()",1000);//页面刷新
            },
            error:function(data){
            	layer.msg('删除失败!',{icon:1,time:1000});
            }
        });
	});
}



</script> 
</body>
</html>