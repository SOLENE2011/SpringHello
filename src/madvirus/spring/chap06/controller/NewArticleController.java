package madvirus.spring.chap06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import madvirus.spring.chap06.service.ArticleService;
import madvirus.spring.chap06.service.NewArticleCommand;

@Controller
// Ŭ���̾�Ʈ�� ��û�� ó���ϴ� �� �޼��尡 ������ URI�� ó���� ���
// @RequestMapping Annotation�� Class�� �����ؼ� 
// �ش� Class�� ó���� �⺻ URI�� ������ �� �ִ�.
@RequestMapping("/article/newArticle.do")
public class NewArticleController {
	
	@Autowired
	// @Autowired: bean �ڵ����� �������ִ� �۾�
	private ArticleService articleService;
	
	// �ϳ��� ��û URL�� ���� HTTP GET ��û�� POST ��û�� �� ���� ��Ʈ�ѷ����� ó���� �־�� �� ��
	@RequestMapping(method = RequestMethod.GET)
	// GET ��û�� ������ �۾��� ��
	public String form() {
		return "article/newArticleForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	// POST ��û�� ������ �۾��� �� ����
	// ���� ���, ������ ���� jsp ���� �׸� �̸��� Java�� Class�� ������Ƽ �̸��� ��ġ�� ���
	// ���� �Է��� ���� �ش� Java�� Class�� ������Ƽ ������ �������ִ� ����� �����ϰ� �ִ�.
	//�� Code������ ��Ʈ�ѷ��� @RequestMapping Annotation �޼��忡�� ���޹��� Ŀ�ǵ� ��ü�� ������ �� �ִ�
	// ��, Ŀ�ǵ� ��ü�� �ڵ����� �𵨿� �߰��ȴ�. (��, ù ���ڴ� �ҹ����̴�.)
	// @ModelAttribute �信�� ����� ��
	public String submit(@ModelAttribute("command") NewArticleCommand command) {
		articleService.writeArticle(command);
		return "article/newArticleSubmit";
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	
	
	
	
}
