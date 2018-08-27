package com.provider.service.impl;

import org.springframework.stereotype.Service;

import com.provider.service.ProviderService;

@Service(value="providerService")
public class ProviderServiceImpl implements ProviderService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "hello dubbo,hello " + name;
	}

}
