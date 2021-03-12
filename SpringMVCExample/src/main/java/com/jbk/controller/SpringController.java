package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.entity.Employee;
import com.jbk.service.SpringService;



@Controller
public class SpringController {

	@Autowired
	SpringService mvcservice;
	
	@RequestMapping("/loginpage")
	public String openpage() {
		System.out.println("Git update trial");
		return "login";
		
	}
	
	@RequestMapping("/login")
	public ModelAndView checkLogin(@ModelAttribute Employee user) {
		
		ModelAndView mv = new ModelAndView();
		System.out.println("I am in CheckLogin Method...!!");
		System.out.println(555555);
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(111111);
		boolean result = mvcservice.checkLoginPage(user);
		if(result) {
			System.out.println("Login Success");
			mv.setViewName("redirect:/home");
		}else {
			System.out.println("Login Fail");
			mv.setViewName("login");
		}
		
	return mv;
	}
	
	@RequestMapping("/home")
	public ModelAndView openHomePage() {
		
		ModelAndView mv = new ModelAndView();
		List<Employee> listUser = mvcservice.getUser();
		
		if(!listUser.isEmpty()) {
			
			mv.addObject("list",listUser);
			mv.setViewName("home");
		}else {
			mv.addObject("msg", "Something Went Wrong , Data Not Found...!!!");
			mv.setViewName("login");
		}
		System.out.println("Created New Branch for adding employee");
		return mv;
	}
}
