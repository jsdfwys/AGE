<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%response.setStatus(200);%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>500 - 系统内部错误</title>
</head>
 
<body>
<script language=javascript> 
$.cookie("tab_cookie", null, { path: '/' });

if (top.location !== self.location) {
top.location=self.location;
}
</script>  
<div><h1>系统发生内部错误.</h1></div>
<div><a href="<c:url value="/"/>">返回首页</a></div>
<div></div>
</body>
</html>
