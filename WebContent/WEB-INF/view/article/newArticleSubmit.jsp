<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 쓰기</title>
</head>
<body>
게시글 등록됨
<br/>
<!-- 
뷰 Code에서는 컨트롤러의 @RequestMapping Annotation 메서드에서 전달받은 커맨드 객체에 접근할 수 있다
즉, 커맨드 객체는 자동으로 모델에 추가된다. (단, 첫 글자는 소문자이다.)
public String submit(@ModelAttribute NewArticleCommand command)
command가 아니라 NewArticleCommand
 -->
제목 : ${command.title}
내용 : ${command.content}
</body>
</html>

