<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>주문완료</title>
</head>
<body>
주문완료
<br/>
주문 아이템
<ul>
	<c:forEach var="item" items="${orderCommand.orderItems}">
	<li>${item.itemId} / ${item.number} / ${item.remark}</li>
	</c:forEach>
</ul>
 배송지: ${orderCommand.address}
</body>
</html>