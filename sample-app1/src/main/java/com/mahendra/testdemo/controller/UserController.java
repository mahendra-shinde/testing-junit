package com.mahendra.testdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mahendra.testdemo.entity.Account;
import com.mahendra.testdemo.model.User;
import com.mahendra.testdemo.service.AccountService;

@Controller
public class UserController {

	private static final String NEWUSER_VIEW = "newuser";
	private static final String USER_VIEW = "user";

	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/user/save", method = RequestMethod.POST)
	public String saveuser(@Validated @ModelAttribute("account") Account acct, Model model) {
		accountService.save(acct);
		model.addAttribute("account", acct);
		return USER_VIEW;

	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		model.addAttribute("userName", user.getUserName());

		Account foundUser = accountService.findByUsername(user.getUserName());
		if (foundUser != null) {
			model.addAttribute("account", foundUser);
			return USER_VIEW;
		} else {
			return NEWUSER_VIEW;
		}
	}

}