package com.demo.dao;

import java.util.List;

import com.demo.jpa.entity.Emp;

public interface EmpDao {
	public String save(Emp e);
	public List<Emp> list();
	public Emp findById(int id);
}
