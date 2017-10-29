package madvirus.spring.chap06.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import madvirus.spring.chap06.service.SearchCommand;
import madvirus.spring.chap06.service.SearchResult;
import madvirus.spring.chap06.service.SearchService;
import madvirus.spring.chap06.service.SearchType;

@Controller
public class GameSearchController {

	@Autowired
	private SearchService searchService;
	// 자동으로 SearchService가 자동으로 세팅된거.
	// @Autowired에 설정된 Service 폴더 안에 자바파일들 역시 dispatcher에 설정해야함
	
	@ModelAttribute("searchTypeList")
	public List<SearchType> referenceSearchTypeList() {
		List<SearchType> options = new ArrayList<SearchType> ();
		options.add(new SearchType(1, "전체"));
		options.add(new SearchType(2, "아이템"));
		options.add(new SearchType(3, "캐릭터"));
		return options;
		// 메서드 위에 @ModelAttribute("searchTypeList")
		// ModelandView가 없어도
		// 메서드에서 처리한 결과가
		// 객체에 올라가서 jsp에서 사용한다.
	}
	
	@ModelAttribute("popularQueryList")
	public String[] getPopularQueryList() {
		return new String[] {"게임","창천2", "위메이드"};
	}
	
	@RequestMapping("/search/main.do")
	public String main() {
		return "search/main";
	}
	
	@RequestMapping("/search/game.do")
	public ModelAndView search(@ModelAttribute("command") 
	SearchCommand command) {
		// ModelAndView를 리턴할 경우 ModelAndView Class의 생성자나 
		// setViewName() 메서드를 이용해서 뷰 이름을 지정할 수 있다.
		// SearchCommand 	private String type; private String query; private int page;
		ModelAndView mav = new ModelAndView("search/game");
		System.out.println("검색어 = " + command.getQuery().toUpperCase());
		SearchResult result = searchService.search(command);
		mav.addObject("searchResult", result);
		return mav;
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String handleNullPointerException(NullPointerException ex) {
		return "error/nullException";
	}

	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}
	
	
	
}
