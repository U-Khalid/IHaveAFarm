<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Hui/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Hui/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Hui/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Hui/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Hui/static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>新增文章</title>
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal" id="form-member-add" style="padding:0% 15%">
	
	<table class="table ">

				<tr class="text-c">
					<td rowspan="3" width="150">


						<div class="formControls">
							<div id="localImag">
							
								<img id="preview" width="150" height="180"/>
							</div>

						</div>

					</td>
					<td width="100"><label class="form-label"><span class="c-red">*</span>产品名称：</label>
					</td>
					<td colspan="2">
					<input type="text" name="productName" id="productName" class="input-text"/>
				
					</td>

				</tr>

				<tr class="text-c">


					<td ><label class="form-label"><span class="c-red">*</span>产品类型：</label>
					</td>
					<td colspan="2"> <span class="select-box">
				<select class="select" size="1" name="productTypeId" id="productTypeId" onchange="getcolumn()">
				<option value="" selected="selected">请选择产品类型</option>
					<c:forEach items="${types}" var="type" >
					<option value="${type.id}">${type.productTypeName}</option>
					</c:forEach> 
				</select>
				</span></td>
				</tr>
				
				
				<tr class="text-c">
					<!-- <td>产品图片&nbsp;&nbsp;&nbsp;&nbsp;<span class="btn-upload">
							<a class="btn btn-primary radius"> 图片选择 
						<input id="articlepic" class="input-file"  type="file" name="file" accept="image/*" onchange="javascript:setImagePreview()">						</a>
					</span></td> -->
					<td>产品图片&nbsp;&nbsp;&nbsp;&nbsp;<span class="btn-upload">
							<a class="btn btn-primary radius"> 图片选择 <input type="file"
								name="file" class="input-file" id="image"
								onchange="javascript:setImagePreview();" />
						</a>
					</span></td>
					
					<td ><label class="form-label">
					</td>
					<td colspan="2">			

					</td>
				</tr>


				<tr>
					<td colspan="4" class="text-l"><span class="c-red">*</span><label>产品价格：</label></td>

				</tr>
				
				<tr>
					<td colspan="4">
						<div  class="formControls">
							<input type="text" class="input-text"  style="width:300px;" placeholder="请输入产品价格(例：5.6)" id="productMoney" name="productMoney">
							
						</div>


					</td>

				</tr> 
			
				<tr>
					<td colspan="4" class="text-l"><span class="c-red">*</span><label>产品介绍：</label></td>

				</tr>
				<tr>
					<td colspan="4">
						<div  class="formControls">
							<textarea id="productIntro" name="productIntro" cols="" rows="" class="textarea"  placeholder="说点什么..." datatype="*0-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,200)"></textarea>
				<p class="textarea-numberbar"><em class="textarea-length">0</em>/200</p>
						</div>


					</td>

				</tr> 
			
				<tr class="text-r">
					<td colspan="4">
									<button onClick="addProduct()" class="btn btn-primary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 提交</button>

					</td>

				</tr>
			</table>
	
	</form>
</article>


<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/static/h-ui.admin/js/H-ui.admin.js"></script>
<!--/_footer /作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/jquery.validation/1.14.0/messages_zh.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/webuploader/0.1.5/webuploader.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/ueditor/1.4.3/ueditor.config.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/ueditor/1.4.3/ueditor.all.min.js"> </script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/Hui/lib/ueditor/1.4.3/editorcontroller.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common.js"></script>

<script type="text/javascript">
function addProduct(){
	if($("#productName").val()==""){layer.alert("请输入产品名称！"); return;} 
	if($("#productTypeId").val()==""){layer.alert("请选择产品类型！"); return;} 
	if($("#productIntro").val()==""){layer.alert("请输入产品介绍！"); return;} 
	if($("#productMoney").val()==""){layer.alert("请输入产品价格！"); return;} 
	var formData = new FormData($("#form-member-add")[0]); 
	$.ajax({
	  url: "${pageContext.request.contextPath}/product/addProduct",
	  type: "POST",
	  data: formData,
	  processData: false,  // 不处理数据
	  contentType: false ,  // 不设置内容类型
	  success: function(data) {
		  if(data==1){
			  layer.confirm("添加产品成功！",{btn:['返回产品列表','继续添加']},function(index){
	       		 	layer_close();
           });
		  }else{
			  layer.alert("添加失败！");
		  }
	     }, 
	     error: function(data) {   
	    	 layer.alert("添加失败！");
	     } 
	});
}

//图片预览
function setImagePreview(avalue) {
	$("#suoluetu").show();
    //input
        var docObj = document.getElementById("image");
//img
        var imgObjPreview = document.getElementById("preview");
        //div
        var divs = document.getElementById("localImag");
        if (docObj.files && docObj.files[0]) {
            //火狐下，直接设img属性
            imgObjPreview.style.display = 'block';
            imgObjPreview.style.width = '100px';
            imgObjPreview.style.height = '100px';
            //imgObjPreview.src = docObj.files[0].getAsDataURL();
            //火狐7以上版本不能用上面的getAsDataURL()方式获取，需要一下方式
           imgObjPreview.src = window.URL.createObjectURL(docObj.files[0]);
        } else {
            //IE下，使用滤镜
            docObj.select();
            var imgSrc = document.selection.createRange().text;
            var localImagId = document.getElementById("localImag");
            //必须设置初始大小
            localImagId.style.width = "100px";
            localImagId.style.height = "100px";
            //图片异常的捕捉，防止用户修改后缀来伪造图片
            try {
                localImagId.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
                localImagId.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = imgSrc;
            } catch(e) {
                alert("您上传的图片格式不正确，请重新选择!");
                return false;
            }
            imgObjPreview.style.display = 'none';
            document.selection.empty();
        }
        return true;
    }
</script>

</body>
</html>