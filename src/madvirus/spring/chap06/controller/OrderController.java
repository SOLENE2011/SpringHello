package madvirus.spring.chap06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order/order.do")
public class OrderController {

	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "order/orderForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(OrderCommand orderCommand) {
		//public String submit(@ModelAttribute("command") NewArticleCommand command)
		//@ModelAttribute("command")를 사용해서 이름을 설정했을때는 jsp에서 "command"이름으로 썼지만
		//public String submit(OrderCommand orderCommand)
		//이렇게 이름을 설정하지 않았다면 OrderCommand를 앞글자를 소문자로해서 jsp에서 "orderCommand"로 사용합니다.
		return "order/orderCompletion";
	}
}
