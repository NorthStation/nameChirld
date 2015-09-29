<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%-- <base href="<%=basePath%>" /> --%>

<title>我的验证码测试页面</title>
<script type="text/javascript" src="scripts/jQuery/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="scripts/jQuery/jquery-form.js"></script>
<script type="text/javascript" src="scripts/layer/layer.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		debugger;
		CODE.initCode();
		//验证输入
		function checkInput() {
			debugger;
			if ($('#userName').val() == '') {
				//alert('用户名不能为空！');
				layer.alert('用户名不能为空！');
				return false;
			}
			if ($('#password').val() == '') {
				//alert('密码不能为空！');
				layer.alert('密码不能为空！', {
				    icon: 5,
				    skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，可以去API页查看
				});
				return false;
			}
			if ($('#code').val() == '') {
				//alert('验证码不能为空！');
				/* layer.alert('墨绿风格，点击确认看深蓝', {
				    skin: 'layui-layer-molv' //样式类名
				}, function(){
				    layer.alert('偶吧深蓝style', {
				        skin: 'layui-layer-lan',
				        shift: 4 //动画类型
				    });
				}); */
				layer.confirm('验证码不能为空？', {
				    btn: ['YES','NO'], //按钮
				    shade: false //不显示遮罩
				}, function(){
				    layer.msg('的确不能为空', {icon: 1});
				}, function(){
				    layer.msg('回答错误', {shift: 6});
				});
				return false;
			}
			return true;
		}

		//点击按钮
		$('#btn').click(function() {
			debugger;
			if (checkInput() == true) {
				$('#login_request').ajaxSubmit({
					url : 'login!testLogin',
					cache : false,
					type : 'POST',
					success : function(data) {
						if (data == 0) {
							alert('验证码错误！');
							//改变验证码
							CODE.initCode();
						} else if (data == 1) {
							alert('登录成功！');
							//提交到登录成功页面
							$('#login_request')[0].submit();
						} else if (data == 2) {
							alert('用户名或密码错误！');
							//改变验证码
							CODE.initCode();
						}
					},
					error : function(e) {
						alert('出错了！');
					}
				});
			}
		});
	});
	var CODE = {
		//初始化化验证码
		initCode : function() {
			debugger;
			$("#code_img").attr("src", "verification.do?rmd=" + new Date().getTime())//如果需要点击图片改变图片的内容，则必须添加时间搓
			.click(function() {
				$(this).attr("src", "verification.do?rmd=" + new Date().getTime());
			});
		}
	};
</script>
</head>

<body>
	<form action="login!success" id="login_request" method="post">
		UserName:<input type="text" id="userName" name="userName" /><br />
		Password:<input type="password" id="password" name="password" /><br>
		Verification_Code:<input type="text" id="code" name="code" /><img
			id="code_img" style="position:relative;top:8px;height:25px"><br>
		<input type="button" id="btn" value="登录" />
	</form>
</body>
</html>