package spitter.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spitter.service.SpitterService;


@Controller //声明为控制器
public class HomeController {
	
	public static final int DEFAULT_SPITTLES_PER_PAGE = 25;
	
	@Autowired
	private SpitterService spitterService;
	
	public HomeController(SpitterService spitterService){
		this.spitterService = spitterService;
	}
	
	@RequestMapping({"/", "/home"}) // 处理对首页的请求
	public String showHomePage(Map<String, Object> model){
		model.put("spittles", spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));
		
		return "home";
	}
}
