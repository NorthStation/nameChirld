<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>取名管理系统</title>
<script language="javascript" src="../scripts/jquery.js"></script>
<style type="text/css">
<!--
* {
	margin: 0px;
	padding: 0px;
}

html,body {
	height: 100%;
	overflow: hidden;
}

html>body { /*-- for !IE6.0 --*/
	width: auto;
	height: auto;
	position: absolute;
	top: 0px;
	left: 0px;
	right: 0px;
	bottom: 0px;
}

body {
	border: 8px solid #ffffff;
	background-color: #ffffff;
	min-width: 230px;
}

#mainDiv {
	width: 100%;
	height: 100%;
	padding: 60px 0px 25px 0px;;
}

#centerDiv {
	width: 100%;
	height: 100%;
	background-color: #00CCFF;
	padding-left: 158px;
}

#mainDiv>#centerDiv { /*-- for !IE6.0 --*/
	width: auto;
	height: auto;
	position: absolute;
	top: 56px;
	left: 0px;
	right: 0px;
	bottom: 20px;
}

#left {
	width: 158px;
	height: 100%;
	background: url(../../images/slide.jpg) repeat-y;
	position: absolute;
	left: 0px;
}

#lhead {
	background: url(../../images/left-head.jpg) left top no-repeat;
	height: 25px;
	font-size: 14px;
	color: #FF9933;
	text-align: center;
	line-height: 25px;
}

#right {
	width: 100%;
	height: 100%;
	background: #ffffff;
	position: absolute;
	overflow-y: auto;
	border: 1px #003366 solid;
	padding: 20px 0 0 10px;
	font-size: 12px;
	font-family: "宋体";
}

#centerDiv>#right {
	width: auto;
	height: auto;
	position: absolute;
	top: 0px;
	right: 0px;
	left: 158px;
	bottom: 0px;
}

#topDiv {
	width: 100%;
	height: 56px;
	background: url(../../images/head-bg.jpg) repeat-x;
	position: absolute;
	top: 0px;
	overflow: hidden;
}

#topDiv ul {
	list-style: none;
	font-size: 12px;
	width: 100%;
	margin: 0;
	padding: 0;
}

#topDiv ul li {
	float: left;
	width: 15%
}

#topDiv ul li a {
	display: block;
	width: 100%;
	height: 25px;
	line-height: 25px;
	background: url(../../images/menu-bg.jpg) repeat-x;
	color: #FFFFFF;
	direction: none;
	text-align: center;
	border-bottom: 1px #000066 solid;
	border: 1px #06597D solid;
}

#tmenu {
	width: 100%;
	position: absolute;
	left: 12%;
	bottom: 0;
	padding-left: 15%;
	margin-left: -15%;
}

#current {
	background: #ccc;
	height: 23x;
	line-height: 25px;
	margin: -20px 0 0 -10;
	overflow: hidden;
}

#bottomDiv {
	width: 100%;
	height: 20px;
	background: url(../../images/bottom.jpg) repeat-x;
	position: absolute;
	bottom: 0px;
	bottom: -1px; /*-- for IE6.0 --*/
}

#left ul {
	list-style: none;
	font-size: 12px;
	margin: 50px 0 0 8px;
}

#left ul li a {
	display: block;
	width: 140px;
	height: 25px;
	line-height: 25px;
	background: url(../../images/menu-bg.jpg) repeat-x;
	color: #FFFFFF;
	direction: none;
	text-align: center;
	border-bottom: 1px #000066 solid;
	border: 1px #06597D solid;
}

#left ul li a:hover {
	background: url(../../images/menu-bg.jpg) 0px 25px;
	color: #99FFCC;
	direction: none;
	text-align: center;
	border-bottom: 1px #000066 solid;
}

#form {
	width: 80%;
	height: 99%;
	margin: 0 auto;
	_margin-left: 20%;
}

fieldset {
	width: 100%;
	margin: 20 auto;
	line-height: 35px;
	padding-left: 20PX;
}
table{
	width: 90%;
	border:solid 1px black;
	position:relative;
	top:8%;
	height:80%;
	
}
-->
</style>
</head>
<body>
	<div id="mainDiv">
		<div id="topDiv">
			<div id="tmenu">
				<ul>
					<li><a href="">首页</a></li>
					<li><a href="/nameChirld/manager/gainName_modifyNameChar">获取名字</a></li>
					<li><a href="/nameChirld/manager/addName_addNameChar">新增(名)字</a></li>
					<li><a href="/nameChirld/manager/modify_modifyNameChar">修改(名)字</a></li>
					<li><a href="/nameChirld/manager/modify_modifyNameChar">删除(名)字</a></li>
				</ul>
			</div>
		</div>
		<div id="centerDiv">

			<div id="left">
				<div id="lhead">名字管理菜单</div>
				<ul>
					<li><a href="name_by_last_name">获得指定姓氏下名字</a></li>
					<li><a href="admin-templates">获得指定性别下名字</a></li>
					<li><a href="admin-templates">获得指定笔画下名字</a></li>
					<li><a href="admin-templates">获得指定五行下名字</a></li>
					<li><a href="admin-templates">姓氏+性别</a></li>
					<li><a href="admin-templates">姓氏+性别+笔画</a></li>
					<li><a href="admin-templates">姓氏+性别+笔画+五行</a></li>
					<li><a href="admin-templates">声调（平仄）</a></li>
					<li><a href="admin-templates">姓氏+性别+新字</a></li>
					<li><a href="admin-templates">姓氏+..</a></li>
					<li><a href="admin-templates">姓氏+..</a></li>
					<li><a href="admin-templates">全条件</a></li>
				</ul>
			</div>
			<div id="right">
				<div id="current">&nbsp;&nbsp;&nbsp;&nbsp;当前位置:</div>
				<div id="form">
					<form action="/nameChirld/manager/addName_addNameChar" method="post">
						<center>
							<fieldset style="height: 70%;">
								<legend>请录入好字信息:</legend>
								<table border="solid" cellpadding="0px;" cellspacing="0px;">
									<tr> <td>字体结构</td> 	<td><input type="text" name="nameCharacterVO.structure" value=""/></td> 
										 <td>字体笔画</td> 	<td><input type="text" name="nameCharacterVO.charNum" value=""/></td> 
									</tr>
									<tr> <td>适合:姓/名</td> 
										 <td><%--<input type="radio" name="nameCharacterVO.suitToName" value="姓"/>姓
										 	 <input type="radio" name="nameCharacterVO.suitToName" value="名"/>名--%>
										 	 <select name="nameCharacterVO.suitToName" style="width: 153px;">
										 		<option value="">……</option>
										 		<option value="姓">姓</option>
										 		<option value="名">名</option>
										 	 </select>
										 </td> 
										 <td>适合：男/女</td><td>
										 	 <%--<input type="radio" name="nameCharacterVO.suitGender" value="男"/>男
										 	 <input type="radio" name="nameCharacterVO.suitGender" value="女"/>女--%>
										 	 <select name="nameCharacterVO.suitGender" style="width: 153px;">
										 		<option value="">……</option>
										 		<option value="男">男</option>
										 		<option value="女">女</option>
										 	 </select>
										 </td> 
									</tr>
									<tr> <td>发音:平/仄</td> 
										 <td>
											 <input type="radio" name="nameCharacterVO.pronunciation" value="平"/>平
										 	 <input type="radio" name="nameCharacterVO.pronunciation" value="仄"/>仄
										 </td> 
										 <td>文字含义</td> 	<td><input type="text" name="nameCharacterVO.literalness" value=""/></td> 
									</tr>
									<tr> <td>引用何处</td> 	<td><input type="text" name="nameCharacterVO.chaQuotation" value=""/></td> 
										 <td>取名解释</td> 	<td><input type="text" name="nameCharacterVO.charMeaning" value=""/></td> 
									</tr>
									<tr> <td>五行富何</td> 	
										 <td>
										 	<input type="checkbox" name="nameCharacterVO.richReligionary" value=""/>金¤
										 	<input type="checkbox" name="nameCharacterVO.richReligionary" value=""/>木¤
										 	<input type="checkbox" name="nameCharacterVO.richReligionary" value=""/>水¤
										 	<input type="checkbox" name="nameCharacterVO.richReligionary" value=""/>火¤
										 	<input type="checkbox" name="nameCharacterVO.richReligionary" value=""/>土¤
										 </td> 
										 <td>长辈已用</td>	<td>
										 	<%--<input type="text" name="nameCharacterVO.isUsedInElder" value=""/>--%>
										 	<select name="nameCharacterVO.isUsedInElder" style="width: 153px;">
										 		<option value="">……</option>
										 		<option value="是">是</option>
										 		<option value="否">否</option>
										 	</select>
										 </td> 
									</tr>
								</table>
							</fieldset>
						</center>
						<fieldset>
							<legend>提交表单/ 重新填写:</legend>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="submit" value="  Create Name Character  " id="submit" name="submit" />
							&nbsp;&nbsp;
							<input type="reset" value="    Reset The Form   " id="reset" name="reset" />
						</fieldset>
						
					</form>
				</div>
			</div>
		</div>
		<div id="bottomDiv"></div>
	</div>
	<script language="javascript">
		$("#test1").toggle(function() {
			$("#test").slideDown()
		}, function() {
			$("#test").slideUp()
		})
	</script>
</body>
</html>