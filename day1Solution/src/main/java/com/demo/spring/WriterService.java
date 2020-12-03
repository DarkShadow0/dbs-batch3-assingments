package com.demo.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.WriterDao;

//@Component
@Service

public class WriterService {

	@Autowired
	@Qualifier("plainWriterImpl")
	private WriterDao plainDao;
	
	@Autowired
	@Qualifier("decoratedWriterImpl")
	private WriterDao decoratedDao;
	
	public void write() {
		plainDao.print("PlainText Class...");
		decoratedDao.print("DecoratedText Class...");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("bean initialized...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("bean willbe destroyed now...");
	}
}
