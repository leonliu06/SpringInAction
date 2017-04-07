package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //声明为控制器
@RequestMapping(value = {"/", "/homepage"})
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET) // 处理对首页的请求
	public String home(){
		return "home";
	}
}
