package madvirus.spring.chap06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {

	@RequestMapping("/header/check.do")
	public String check(@RequestHeader("Accept-Language") String languageHeader) {
		// 헤더는 클라이언트와 서버 사이에서 모든 종류의 정보를 전송하는데 이용된다
		// Accept-Language: 클라이언트가 원하는 기본 언어를 의미한다.
		System.out.println(languageHeader);
		return "header/pass";
	}
	
}
