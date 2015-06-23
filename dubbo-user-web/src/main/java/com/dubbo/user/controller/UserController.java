package com.dubbo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubbo.user.model.User;
import com.dubbo.user.service.TestRegistryService;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	TestRegistryService testService;

	@RequestMapping("index")
	public String index() {
		System.out.println("dubbo index");
		return "index";
	}

	@RequestMapping("/hello")
	@ResponseBody
	public String sayHi() {

		return testService.siHello("nihao");
	}

	@RequestMapping("/addUser")
	@ResponseBody
	public Object addUser() {
		User u = new User();
		u.setAge(17);
		u.setId("1");
		u.setName("孜然麻辣熊");
		u.setSex("1");
		testService.addUser(u);
		return u;
	}
}
