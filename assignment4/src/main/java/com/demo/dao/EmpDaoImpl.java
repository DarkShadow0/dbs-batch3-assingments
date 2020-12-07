package com.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.demo.jpa.entity.Emp;

@Service
public class EmpDaoImpl implements EmpDao {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public String save(Emp e) {
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		em.persist(e);
		tran.commit();
		return null;
	}

	@Override
	public List<Emp> list() {
		Query q=em.createQuery("select e from Emp e where e.salary between 60000 and 90000");
		List<Emp> empList=q.getResultList();
		return empList;
	}

	@Override
	public Emp findById(int id) {
		Emp e = em.find(Emp.class,id);
		return e;
	}

}
