<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>PLAYGROUND | Login</title>

    <link href="/resources/bootstrap/inspina/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/bootstrap/inspina/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="/resources/bootstrap/inspina/css/animate.css" rel="stylesheet">
    <link href="/resources/bootstrap/inspina/css/style.css" rel="stylesheet">

  	<!-- Mainly scripts -->
  	<script src="/resources/bootstrap/inspina/js/jquery-3.1.1.min.js"></script>
    <script src="/resources/bootstrap/inspina/js/bootstrap.min.js"></script>
    
    <script>
		$(document).ready(function() {
			$("#btnLogin").click(function() {
				$("#loginForm").attr("action", "/loginProcess").submit();
			});
		});
	</script>

</head>

<body class="gray-bg">

	<div>
    	<center><h1 class="logo-name" style="left:-50px;">PLAYGROUND</h1></center>
    </div>

    <div class="middle-box text-center loginscreen animated fadeInDown">
        <div>
            <h3>Welcome to PLAYGROUND</h3>
            <p>PLAYGROUND에 오신것을 환영합니다
                <!--Continually expanded and constantly improved Inspinia Admin Them (IN+)-->
            </p>
            <p>로그인하세요</p>
            <form id="loginForm" class="form-signin" onsubmit="return false;" method="post">
    			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                <div class="form-group">
                    <input type="text" name="id" id="userId"  class="form-control" placeholder="user id input" required="">
                </div>
                <div class="form-group">
                    <input type="password" name="password" id="password" class="form-control" placeholder="Password" required="">
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b" id="btnLogin">ë¡ê·¸ì¸</button>

                <a href="#"><small>가입전이신가요?</small></a>
                <p class="text-muted text-center"><small>가입하시겠습니까?</small></p>
                <a class="btn btn-sm btn-white btn-block" href="register.html">가입신청</a>
            </form>
        </div>
    </div>

</body>

</html>
