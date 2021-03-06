package madvirus.spring.chap06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

	@RequestMapping("/search/internal.do")
	public ModelAndView searchInternal(@RequestParam("query") String query,
			@RequestParam(value = "p", defaultValue = "1") int pageNumber) {
		// defaultValue 속성을 이용해서 기본 값을 지정하면
		// 해당 요청 파라미터를 지정하지 않을 경우 defaultValue 속성에 지정한 문자열값으로 사용
		// jsp에서 query라는 이름으로 넘어오는 파라미터값을 query로 쓰는거와 달리
		// 아래 @RequestParam은 jsp에서 p라고 넘어오는 값을 pageNumber로 쓰고싶어서
		// 두개의 형식이 다른거임!!
		System.out.println("query=" + query + ",pageNumber=" + pageNumber);
		return new ModelAndView("search/internal");
	}

	@RequestMapping("/search/external.do")
	public ModelAndView searchExternal(@RequestParam(value = "query", required = false) String query,
			@RequestParam(value = "p", defaultValue = "1") int pageNumber) {
		// 필수가 아닌 파라미터인 경우 required 속성 값을 false로 줌 기본값이 true임~!
		System.out.println("query=" + query + ",pageNumber=" + pageNumber);
		return new ModelAndView("search/external");
	}

}
