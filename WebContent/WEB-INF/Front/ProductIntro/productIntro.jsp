<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/IHaveAFarm/Css/product.css">
<link rel="stylesheet" type="text/css" href="/IHaveAFarm/Css/main.css">
<title>产品简介</title>
</head>
<body>
<jsp:include page="../common/head.jsp"></jsp:include>
<div class="allProductBody">
	<div class="sign">
		&nbsp;&nbsp;&nbsp;${type.productTypeName} 
	</div>
		
	<div class="basic_hr">
	</div>
	
	<div class="image_box">
	
		<c:forEach items="${pros}" var="pro">
			<div class="image_label">
				<div class="in_image">
					<a href="${pageContext.request.contextPath }/basic/getProductDetailById?id=${pro.id}"><img alt="${pro.productName}" src="${pro.productImage}" class="img"></a>
				</div>
				<div class="in_font">
					<p class="pre-font" >${pro.productName}</p>
				</div>
			</div>
		</c:forEach>	
			
			
			
		</div>
</div>

<jsp:include page="../common/end.jsp"></jsp:include>

<script type="text/javascript">
$(function(){
	$(".cp_head").removeClass("active");
	$(".head_a").removeClass("active_font");
	$("#head_product").addClass("active");
	$("#pa").addClass("active_font");
});
</script>
</body>
</html>