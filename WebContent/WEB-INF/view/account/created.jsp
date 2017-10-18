<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>계정 생성</title>
</head>
<body>
계정 생성됨
<ul>
	<li>아이디: ${command.id}</li>
	<li>이름: ${command.name}</li>
	<li>우편번호: ${command.address.zipcode}</li>
	<li>주소: ${command.address.address1} 
	${command.address.address2}</li>
</ul>
</body>
</html>