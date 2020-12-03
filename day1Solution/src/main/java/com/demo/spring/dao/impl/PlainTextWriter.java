package com.demo.spring.dao.impl;

import com.demo.spring.dao.WriterDao;

public class PlainTextWriter implements WriterDao {

	@Override
	public void print(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

}
