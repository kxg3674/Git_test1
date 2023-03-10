package com.human.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewController {

	
		@GetMapping("/")
		public String test1(Model model) {
			
			return "test1";
		}
	
}
