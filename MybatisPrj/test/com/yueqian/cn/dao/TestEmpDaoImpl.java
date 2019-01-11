package com.yueqian.cn.dao;

import java.util.List;

import com.yueqian.cn.dao.entity.Emp;
import com.yueqian.cn.dao.impl.EmpDaoImpl;

public class TestEmpDaoImpl {
	public static void main(String[] args) {
		/*IEmpDao empDao = new EmpDaoImpl();
		Emp emp = empDao.getById(1);
		System.out.println(emp);
		System.out.println("所在的部门是");
		System.out.println(emp.getDept());*/
		
		IEmpDao empDao = new EmpDaoImpl();
		List<Emp> emps = empDao.getAll();
		for (Emp emp : emps) {
			System.out.println(emp.getName()+"的部门是"+emp.getDept().getName());
		}
	}
}
