package com.hurec.web;

import com.hurec.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rein.shin on 2017. 6. 8..
 */
@Controller
public class UserController {
	private List<User> users = new ArrayList<>();

	@PostMapping("/create")
	public String userCreate(User user) {
		System.out.println("user: " + user);
		users.add(user);
		return "redirect:list";
	}

	@GetMapping("/list")
	public String userList(Model model) {
		model.addAttribute("users", users);
		return "list";
	}

}
