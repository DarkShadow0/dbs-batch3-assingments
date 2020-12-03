package com.demo.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.demo.spring.dao.WriterDao;

@Repository
public class DecoratedWriter implements WriterDao {

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}
	
}
