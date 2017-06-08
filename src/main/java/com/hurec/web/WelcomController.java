package com.hurec.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by rein.shin on 2017. 6. 8..
 */
@Controller
public class WelcomController {
	@GetMapping("/helloWorld")
	public String welcomeIn(String name, int age, Model model) {
		System.out.println("name: " + name);
		System.out.println("age: " + age);

		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "welcome";
	}
}
