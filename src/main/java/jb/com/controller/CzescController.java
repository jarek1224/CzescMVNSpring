package jb.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/czesc")
public class CzescController {

	@RequestMapping(value= "/index", method = RequestMethod.GET)
	public String index(ModelMap model){
		model.addAttribute("message", "Czesc w Spring WEB MVC!");
		return "czesc";
	}
}
