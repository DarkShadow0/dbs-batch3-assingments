package com.demo.spring;

import org.springframework.stereotype.Service;

@Service
public class ConcatString {


	public void joinString(String s1, String s2) {
		System.out.println("This is " + s1 + ". He is " + s2 + ".");
	}

}
