package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/freemarker")
public class HelloWorldFreemakerController {
	
	@RequestMapping("/say")
	public ModelAndView say() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello EveryBody");
		mav.setViewName("helloWorld");
		return mav;
	}

}
