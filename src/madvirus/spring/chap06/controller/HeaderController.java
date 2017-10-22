package madvirus.spring.chap06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {

	@RequestMapping("/header/check.do")
	public String check(@RequestHeader("Accept-Language") String languageHeader) {
		// ����� Ŭ���̾�Ʈ�� ���� ���̿��� ��� ������ ������ �����ϴµ� �̿�ȴ�
		// Accept-Language: Ŭ���̾�Ʈ�� ���ϴ� �⺻ �� �ǹ��Ѵ�.
		System.out.println(languageHeader);
		return "header/pass";
	}
	
}
