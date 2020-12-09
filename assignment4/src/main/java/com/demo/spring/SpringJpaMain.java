package com.demo.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.dao.EmpDao;
import com.demo.jpa.entity.Emp;

public class SpringJpaMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfig.class);
		
		EmpDao test=ctx.getBean(EmpDao.class);

		test.save(new Emp(200,"xyz","Pune",50000));
		List<Emp> l= test.list();
		l.forEach(e->System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getSalary()));
		Emp emp = test.findById(200);
		System.out.println(emp.getEmpName() + " " + emp.getSalary());
	}

}
