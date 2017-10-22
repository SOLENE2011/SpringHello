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
	// Application Programming Interface 응용 프로그램 프로그래밍 인터페이스
	// 응용 프로그램에서 사용할 수 있도록 
	// 운영 체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻한다
	// Cookie는 서버에서 만드는 것이 아니라 사용자 컴퓨터에 만들어짐
	public String make(HttpServletResponse response) {
		response.addCookie(new Cookie("auth", "KH07"));
		return "cookie/made";
		
	}
	
	@RequestMapping("/cookie/view.do")
	public String view( @CookieValue(value = "auth", defaultValue = "0") String auth) {
		// @CookieValue 이용하면 쿠키 값을 파라미터로 전달받을 수 있다
		// @RequestParam이랑 비슷
		System.out.println("auth 쿠키: " + auth);
		return "cookie/view";
	}
	
}
