package com.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.spring.model.Account;

@Controller
@SessionAttributes("createAccountObj")
public class DemoController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getQuote(Model model) {

		model.addAttribute("myQuote", "THis is MyQuote Friend");
		return "quote";
	}

	@RequestMapping(value = "/createAccount")
	public String createAccount(@Valid @ModelAttribute("createAccountObj") Account account, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Form has Error");
			return "createAccount";
		}
		System.out.println(account.toString());
		return "created";
	}

	/*
	 * @ModelAttribute() public void setUser(@RequestParam("uname") String userName,
	 * Model model) { model.addAttribute("user", userName); String role =
	 * "Undefined"; if(userName.equals("Sam"))role="Managing Director";
	 * if(userName.equals("Raj"))role="Cheefe Executive Officer";
	 * model.addAttribute("role", role); }
	 */
	@RequestMapping(value = "/handleFile", method = RequestMethod.GET)
	public String handleFile(@RequestParam("file") MultipartFile file) {
		 System.out.println(file);
		return "handleFile";
	}
}
