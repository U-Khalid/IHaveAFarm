<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/IHaveAFarm/Css/product.css">
<title></title>
</head>
<body>
<jsp:include page="../common/head.jsp"></jsp:include>
<div class="detailBody">
	<div class="detailName">
		<span style="margin-left: 45%;">${pro.productName}</span>
	</div>
	
	<!-- <div class="basic_hr">
	</div> -->
	
	<div class="sign">
		&nbsp;&nbsp;&nbsp;产品图片
	</div>
		
	<div class="basic_hr">
	</div>
	
	<div class="detailImage">
		<img style="width:900px;height:400px;" src="${pro.productImage }">
	</div>
	
	<div class="sign" style="margin-top:30px;">
		&nbsp;&nbsp;&nbsp;产品介绍
	</div>
		
	<div class="basic_hr">
	</div>
	
	<div class="detailIntro">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${pro.productIntro}
		
		<br><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;产品价格： ${pro.productMoney }元
	</div>

</div>
<jsp:include page="../common/end.jsp"></jsp:include>
</body>
</html>