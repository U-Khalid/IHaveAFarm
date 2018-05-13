<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/IHaveAFarm/Css/shop.css">
<title>我有一个农场</title>
</head>
<body>
<jsp:include page="../common/head.jsp"></jsp:include>
<div class="shop_body">
	<div class="sign">
		&nbsp;&nbsp;&nbsp;官方商城
	</div>
		
	<div class="basic_hr">
	</div>
</div>

<jsp:include page="../common/end.jsp"></jsp:include>
<script type="text/javascript">
$(function(){
	$(".cp_head").removeClass("active");
	$(".head_a").removeClass("active_font");
	$("#head_shop").addClass("active");
	$("#sa").addClass("active_font");
});
</script>
</body>
</html>