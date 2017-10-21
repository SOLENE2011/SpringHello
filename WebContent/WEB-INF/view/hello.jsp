<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>인사</title>
</head>
<body>
	인사말: <strong>${greeting}</strong>
	<!-- 		
		mav.setViewName("hello"); //jsp파일 hello.jsp
		mav.addObject("greeting",getGreeting()); 
		(HelloController.java) 모델에 "greeting"이라는 이름으로 String 타입의 값을 추가
		jsp에서 사용함~!
	-->

</body>
</html>