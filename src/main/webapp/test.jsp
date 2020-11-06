<%--
  Created by IntelliJ IDEA.
  User: 84264
  Date: 2020/11/6
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/jquery.validate.min.js"></script>
    <script type="text/javascript" src="js/messages_zh.js"></script>
    <script>
        $().ready(function () {
            $("#regForm").validate({
                rules: {
                    username: {
                        required: true,
                        minlength: 5
                    },
                    name: "required",
                    passWord: {
                        required: true,
                        minlength: 6,
                        maxlength: 12
                    },
                    rePassWord: {
                        required: true,
                        minlength: 6,
                        maxlength: 12,
                        equalTo: "#passWord"
                    },
                    birthday: {
                        required: false,
                        data: true
                    },
                    email: {
                        required: true,
                        email: true
                    },
                    mobile: {
                        required: true,
                        digits: true,
                    },
                    address: {
                        required: true,
                        digits: true,
                    },
                },
                debug: true,
                onsubmit: true,
                onfocusout: true,
                onkeyup: true,
                onclick: true,
                focusCleanup: true,
                messages: {
                    userName: "用户名长度不能小于5",
                    name: "请输入您的姓名",
                    passWord: "请输入长度为6-12的密码",
                    rePassWord: "请确保两次密码一致",
                    birthday: "请输入有效的日期",
                    mobile: "请正确填写您的手机号码",
                    address: "请输入您的地址"
                }
            })
        });
    </script>
</head>

<body>
<form action="User/reg" id="regForm" method="post" onsubmit="return checkForm(this)"><h1><a href="index.html">
    <!--  img src="学习猿地"--></a></h1>
    <p><label for="username"></label><input type="text" id="username" name="username" placeholder="用户账号"></p>
    <p><label for="name"></label><input type="text" id="name" name="name" placeholder="用户姓名"><span></span></p>
    <p><label for="passWord"></label><input type="password" id="passWord" name="passWord" placeholder="密码"><span></span>
    </p>
    <p><label for="rePassWord"></label><input type="password" id="rePassWord" name="rePassWord"
                                              placeholder="确认密码"><span></span></p>
    <p>
        <label>
            <input style="width:15px; height:15px" type="radio" name="sex" value="T" checked="checked">
        </label>男
        <label>
            <input style="width:15px; height:15px" type="radio" name="sex" value="F" checked="checked">
        </label>女
    </p>
    <p>
        <label for="birthday"></label><input type="date" id="birthday" name="birthday" placeholder="生日"><span></span>
    </p>
    <p><label for="email"></label><input type="text" id="email" name="email" placeholder="邮箱" required><span></span></p>
    <p><label for="mobile"></label><input type="text" id="mobile" name="mobile" placeholder="电话号码"
                                          required><span></span></p>
    <p><input type="text" id="address" name="address" placeholder="地址"><span></span></p>
    <p><label>
        <input class="code" type="text" name="code" value="" onfocus="FocusItem(this)" onblur="CheckItem(this)"
               placeholder="验证码">
    </label>
        <img src="getcode" alt="看不清？换一张" onclick="change(this)"><span class="error"></span></p>
    <p><input type="submit" name="" value="注册"></p>
    <p>完成此注册，即表明您同意了我们的<a href="#">
        </使用条款和隐私策略/></a></p>
    <p class="txt"><a href="login.jsp"><span></span>已有账号登录</a></p>
    <!--<a href="#" class="off"><img src="img/temp/off.png"></a>--></form>
</body>
</html>
