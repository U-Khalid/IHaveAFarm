<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/IHaveAFarm/Css/connect.css">
<title>我有一个农场</title>
</head>
<body>
<jsp:include page="../common/head.jsp"></jsp:include>

<div class="connect_body">
	
	<div class="connect_way">
		<div class="sign">
		&nbsp;&nbsp;&nbsp;联系方式
		</div>
		
		<div class="basic_hr">
		</div>
		
		<div class="connect_font">
			<div>
			<span class="pre-font">公司名称:&nbsp;&nbsp;&nbsp;&nbsp;象山石浦创新禽业专业合作社</span>
			<br><br>
			<span class="pre-font">公司地址:&nbsp;&nbsp;&nbsp;&nbsp;象山县石浦镇下洋墩村4号</span>
			<br><br>
			<span class="pre-font">所在地区:&nbsp;&nbsp;&nbsp;&nbsp;浙江/宁波</span>
			<br><br>
			<span class="pre-font">公司电话:&nbsp;&nbsp;&nbsp;&nbsp;15757469901</span>
			<br><br>
			<span class="pre-font">联&nbsp;系&nbsp;&nbsp;人:&nbsp;&nbsp;&nbsp;&nbsp;许迪一(先生)</span>
			</div>
			
			<div class="QR_Code">
			</div>
		</div>
	</div>
	
	<div class="connect_map">
		<div class="sign">
		&nbsp;&nbsp;&nbsp;公司地图
		</div>
		
		<div class="basic_hr">
		</div>
		
		<iframe class="map" src="${pageContext.request.contextPath }/basic/getMap"  frameborder="0"  width="1100px"  height="350px"></iframe>
	</div>
	

</div>
<jsp:include page="../common/end.jsp"></jsp:include>
<script type="text/javascript">
$(function(){
	$(".cp_head").removeClass("active");
	$(".head_a").removeClass("active_font");
	$("#head_connect").addClass("active");
	$("#coa").addClass("active_font");
});
</script>
</body>
</html>