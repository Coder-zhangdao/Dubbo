package com.provider.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderApp {
	public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "dubbo-provider.xml" });
        ac.start();
        System.in.read();
    }
}
