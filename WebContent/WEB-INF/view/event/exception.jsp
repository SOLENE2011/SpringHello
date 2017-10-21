<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>예외 발생</title>
</head>
<body>
요청을 처리하는 도중에 예외가 발생하였습니다:
${exception.message}
<%
	Throwable e = (Throwable) request.getAttribute("exception");
	e.printStackTrace();
%>
</body>
</html>