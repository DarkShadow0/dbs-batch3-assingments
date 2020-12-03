package com.demo.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.demo.spring.dao.WriterDao;
import com.demo.spring.dao.impl.DecoratedWriter;
import com.demo.spring.dao.impl.PlainTextWriter;

//@Component
@Configuration
@ComponentScan(basePackages = "com.demo.spring")
@PropertySource("messages.properties")
public class AppConfig {

	@Bean()
	public WriterDao plainWriterImpl() {
		return new PlainTextWriter();
	}
	
	@Bean()
	public WriterDao decoratedWriterImpl() {
		return new DecoratedWriter();
	}
	
}
