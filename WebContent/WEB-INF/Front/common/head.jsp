<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/IHaveAFarm/Css/head.css">
<link rel="stylesheet" type="text/css" href="/IHaveAFarm/Css/common.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/jquery/1.9.1/jquery.min.js"></script> 
<title>head</title>
</head>
<body style="background-color:#E4E4E4;width:100%;">
<div class="head">
	<div class="head_logo"></div>
	<div class="head_nav">
		<ul class="dropdown">
			<li class="cp_head active" id="head_main">
				<a class="head_a active_font" id="ma" href="${pageContext.request.contextPath }/basic/toMain">网&nbsp;站&nbsp;首&nbsp;页</a>
			</li>
			
			<li class="cp_head " id="head_company">
				<a class="head_a" id="ca" href="${pageContext.request.contextPath }/basic/toCompanyIntro" >企&nbsp;业 &nbsp;简&nbsp; 介</a>
			</li>
			
			<li class="cp_head" id="head_product" >
				<a class="head_a" id="pa" href="${pageContext.request.contextPath }/basic/toAllProduct" >产&nbsp;品&nbsp;简&nbsp;介</a>
				<ul class="sub-menu" style="margin-left:-40px; display: none;">
					 <c:forEach items="${types}" var="type">
					<li style="border-bottom: 2px soild #000">
						<a href="${pageContext.request.contextPath }/basic/toProductIntro?id=${type.id}">${type.productTypeName }</a>
					</li>
					</c:forEach>
				</ul>
				
			</li>
			
			<li class="cp_head" id="head_shop">
				<a class="head_a" id="sa" href="${pageContext.request.contextPath }/basic/toShop">官&nbsp;方&nbsp;商&nbsp;城</a>
			</li>
			<li class="cp_head" id="head_connect">
				<a class="head_a" id="coa" href="${pageContext.request.contextPath }/basic/toConnect" >联&nbsp;系&nbsp;我&nbsp;们</a>
			</li>
		</ul>
	</div>
	
	<div class="bg_image1">
	
	</div>
</div>

<script type="text/javascript">
	$(document).ready(function() {
		
		$('ul li').hover(function() {
			$(this).find('.sub-menu').css('display', 'block');
		}, function() {
			$(this).find('.sub-menu').css('display', 'none');
		});
		
		
	});
	
</script>
</body>
</html>