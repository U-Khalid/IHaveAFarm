<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/IHaveAFarm/Css/companyIntro.css">
<title>公司介绍</title>
</head>
<body>
<jsp:include page="../common/head.jsp"></jsp:include>
<div class="company_body">
	<div class="company_image_intro">
		<div class="sign">&nbsp;&nbsp;&nbsp;企业照片</div>
		
		<div class="basic_hr"></div>
		
		<div class="company_image">
		
		</div>
	</div>
	
	<div class="company_intro">
		<div class="sign">&nbsp;&nbsp;&nbsp;企业介绍</div>
		
		<div class="basic_hr"></div>
		
		<div class="company_intro_font">
			<span class="pre-font" style="text-indent:2em;font-size: 16px;color:#fb5638;">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;象山石浦创新禽业专业合作社
			</span>
			<span class="pre-font">
			地址设在浙江省第二大城市、江南水乡兼海港城市宁波,浙江 宁波 象山县石浦镇下洋墩村,联系人是许克文,于2011年3月22日在宁波工商局登记
			<br><br>
			注册挂牌成立,单位注册资本未提供象山石浦创新禽业专业合作社以诚信、实力和产品质量获得业界的高度认可。欢迎各界朋友莅临参观、指导和业务洽谈。
			</span>
			<br><br>
			<span class="pre-font">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;可经营项目：家禽饲养。  一般经营项目：家禽及禽蛋销售；有机肥料加工处理。
			</span>
			
			<br><br>
			<span class="pre-font"> 
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;以共赢、开创经营理念，以全新的管理模式和周到的服务，用心服务于客户，联系电话为65935148，您如果对我们的产品感兴趣或者有任何的疑问，您可以直接给我们留言或
			<br><br>
			直接与我们联络，我们将在收到您的信息后，会第一时间及时与您联络。我们始终坚持用户至上，坚持用自己的服务去打动客户。
			</span>
		</div>
	</div>
</div>

<jsp:include page="../common/end.jsp"></jsp:include>
<script type="text/javascript">
	$(".cp_head").removeClass("active");
	$("#head_company").addClass("active");
	$(".head_a").removeClass("active_font");
	$("#ca").addClass("active_font");
</script>
</body>
</html>