package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.provider.service.ProviderService;

@Controller
@RequestMapping("dubbo")
public class DubboController {
	@Autowired
	private ProviderService providerService;
	
	@RequestMapping("/sayhello")
	@ResponseBody
	public String hello(String name) {
		return providerService.sayHello(name);
	}
	
}
