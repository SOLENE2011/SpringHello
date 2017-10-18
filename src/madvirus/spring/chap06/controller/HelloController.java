package madvirus.spring.chap06.controller;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
// 클라이언트의 요청을 처리한 뒤, 
// 그 결과를 DispatcherServlet에 알려 준다.
// Struts의 Action과 동일한 역할을 수행한다. 

//내가 만든 이 클래스는 Controller다
public class HelloController {

	// 실행 메서드에 Request 걸으면 됨~!
	@RequestMapping("hello.do")
	// 클라이언트의 요청 URL을 어떤 컨트롤러가 처리할 지를 결정한다.
	public ModelAndView hello() {
		// ModelAndView : 컨트롤러가 처리한 결과 정보 및 뷰 선택에 필요한 정보를 담는다. 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello"); //jsp파일 hello.jst
		mav.addObject("greeting",getGreeting());
		//jsp에서 인사말: <strong>${greeting}</strong> 이렇게 쓰임
		return mav;
	}

	private String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour >= 6 && hour <=10) {
			return "좋은 아침입니다.";
		} else if(hour >=12 && hour <= 15) {
			return "점심 식사는 하셨나요?";
			
		} else if (hour >=18 && hour<= 22) {
			return "좋은 밤 되세요";
		}
		return "안녕하세요";
	}
	
	
}
