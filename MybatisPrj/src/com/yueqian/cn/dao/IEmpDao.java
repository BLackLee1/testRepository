package com.yueqian.cn.dao;

import java.util.List;

import com.yueqian.cn.dao.entity.Emp;

public interface IEmpDao {
	
	public Emp getById(int id);
	public List<Emp> getAll();
}
