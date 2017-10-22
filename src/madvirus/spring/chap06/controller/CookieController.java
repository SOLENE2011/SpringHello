package madvirus.spring.chap06.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CookieController {

	@RequestMapping("cookie/make.do")
	// HttpServletRequest, HttpServletResponse, HttpSession
	// Application Programming Interface ���� ���α׷� ���α׷��� �������̽�
	// ���� ���α׷����� ����� �� �ֵ��� 
	// � ü���� ���α׷��� �� �����ϴ� ����� ������ �� �ְ� ���� �������̽��� ���Ѵ�
	// Cookie�� �������� ����� ���� �ƴ϶� ����� ��ǻ�Ϳ� �������
	public String make(HttpServletResponse response) {
		response.addCookie(new Cookie("auth", "KH07"));
		return "cookie/made";
		
	}
	
	@RequestMapping("/cookie/view.do")
	public String view( @CookieValue(value = "auth", defaultValue = "0") String auth) {
		// @CookieValue �̿��ϸ� ��Ű ���� �Ķ���ͷ� ���޹��� �� �ִ�
		// @RequestParam�̶� ���
		System.out.println("auth ��Ű: " + auth);
		return "cookie/view";
	}
	
}
