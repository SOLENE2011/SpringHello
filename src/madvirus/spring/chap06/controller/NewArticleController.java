package madvirus.spring.chap06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import madvirus.spring.chap06.service.ArticleService;
import madvirus.spring.chap06.service.NewArticleCommand;

@Controller
// 클라이언트의 요청을 처리하는 두 메서드가 동일한 URI를 처리할 경우
// @RequestMapping Annotation을 Class에 적용해서 
// 해당 Class가 처리할 기본 URI를 지정할 수 있다.
@RequestMapping("/article/newArticle.do")
public class NewArticleController {
	
	@Autowired
	// @Autowired: bean 자동으로 연결해주는 작업
	private ArticleService articleService;
	
	// 하나의 요청 URL에 대해 HTTP GET 요청과 POST 요청을 한 개의 컨트롤러에서 처리해 주어야 할 때
	@RequestMapping(method = RequestMethod.GET)
	// GET 요청이 들어오면 글쓰기 폼
	public String form() {
		return "article/newArticleForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	// POST 요청이 들어오면 글쓰기 폼 전송
	// 예을 들어, 다음과 같이 jsp 폼의 항목 이름과 Java빈 Class의 프로퍼티 이름이 일치할 경우
	// 폼에 입력한 값을 해당 Java빈 Class의 프로퍼티 값으로 설정해주는 기능을 제공하고 있다.
	//뷰 Code에서는 컨트롤러의 @RequestMapping Annotation 메서드에서 전달받은 커맨드 객체에 접근할 수 있다
	// 즉, 커맨드 객체는 자동으로 모델에 추가된다. (단, 첫 글자는 소문자이다.)
	// @ModelAttribute 뷰에서 사용할 모델
	public String submit(@ModelAttribute("command") NewArticleCommand command) {
		articleService.writeArticle(command);
		return "article/newArticleSubmit";
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	
	
	
	
}
