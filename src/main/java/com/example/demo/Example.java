package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Example {
   
	@GetMapping({"/", "/index"})
	public String index(Model model){
	    model.addAttribute("message", new String("HI"));
	    System.out.println(model);
	    return "index";
	}

}
