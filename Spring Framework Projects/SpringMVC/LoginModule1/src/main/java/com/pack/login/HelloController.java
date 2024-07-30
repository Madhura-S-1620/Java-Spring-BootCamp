package com.pack.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloController {
 
	@RequestMapping("/welcome")
	public ModelAndView hello()
	{
		String msg= "<br><div style='text-align:center;'>"
				+"<h4>Hello in Spring MVC Controller</h4>This message is from HelloController.java</div><br><br>";
			return new ModelAndView("Welcome", "message",msg);	
	}
}
 