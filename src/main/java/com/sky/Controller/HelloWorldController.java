package com.sky.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public ModelAndView helloworld() {
		
		String message="hello world,spring 3.0!";
		return new ModelAndView("hello","message",message);
		
	}
}
