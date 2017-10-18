package madvirus.spring.chap06.controller;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
// Ŭ���̾�Ʈ�� ��û�� ó���� ��, 
// �� ����� DispatcherServlet�� �˷� �ش�.
// Struts�� Action�� ������ ������ �����Ѵ�. 

//���� ���� �� Ŭ������ Controller��
public class HelloController {

	// ���� �޼��忡 Request ������ ��~!
	@RequestMapping("hello.do")
	// Ŭ���̾�Ʈ�� ��û URL�� � ��Ʈ�ѷ��� ó���� ���� �����Ѵ�.
	public ModelAndView hello() {
		// ModelAndView : ��Ʈ�ѷ��� ó���� ��� ���� �� �� ���ÿ� �ʿ��� ������ ��´�. 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello"); //jsp���� hello.jst
		mav.addObject("greeting",getGreeting());
		//jsp���� �λ縻: <strong>${greeting}</strong> �̷��� ����
		return mav;
	}

	private String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour >= 6 && hour <=10) {
			return "���� ��ħ�Դϴ�.";
		} else if(hour >=12 && hour <= 15) {
			return "���� �Ļ�� �ϼ̳���?";
			
		} else if (hour >=18 && hour<= 22) {
			return "���� �� �Ǽ���";
		}
		return "�ȳ��ϼ���";
	}
	
	
}
