<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>INSPINIA | 500 Error</title>

    <link href="/resources/bootstrap/inspina/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/bootstrap/inspina/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="/resources/bootstrap/inspina/css/animate.css" rel="stylesheet">
    <link href="/resources/bootstrap/inspina/css/style.css" rel="stylesheet">

  	<!-- Mainly scripts -->
  	<script src="/resources/bootstrap/inspina/js/jquery-3.1.1.min.js"></script>
    <script src="/resources/bootstrap/inspina/js/bootstrap.min.js"></script>
    
    <script type="text/javascript">
        function keydowncheck() {
            var result = true;
            var keycode = event.keyCode;
            if(123 == keycode) //F12 í¤ì½ë
            {
            result = false;
            }
            return result;
        }
    </script>
</head>


<body class="gray-bg" onkeydown="return keydowncheck();">



    <div class="middle-box text-center animated fadeInDown">
        <h1>500</h1>
        <h3 class="font-bold">ë´ë¶ìë² ìë¬</h3>

        <div class="error-desc">
        	ìë²ìì ì¤ë¥ê° ë°ìíììµëë¤.<br/>
        	ë¡ê·¸ì¸ì ë¤ì íìë ¤ë©´ ë²í¼ì í´ë¦­íì¸ì: <br/>
        	<a href="index.html" class="btn btn-primary m-t">ë¡ê·¸ì¸</a>
        </div>
    </div>

</body>

</html>
