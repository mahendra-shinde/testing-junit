package com.mahendra.testdemo.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private static final String ERROR_VIEW = "error";

	private static final String HOME_VIEW = "home";

	@RequestMapping("/")
	public String welcome(Locale locale, Map<String, Object> model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.put("serverTime", formattedDate);
		return HOME_VIEW;
	}

	@ExceptionHandler(Exception.class)
	public String exceptionHandler(HttpServletRequest request, Exception ex, Model model) {
		model.addAttribute("content", request.getRequestURL());
		model.addAttribute(ERROR_VIEW, ex.getMessage());
		return ERROR_VIEW;
	}

}