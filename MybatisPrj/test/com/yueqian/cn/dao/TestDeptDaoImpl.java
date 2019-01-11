package com.yueqian.cn.dao;

import java.util.Set;

import com.yueqian.cn.dao.entity.Dept;
import com.yueqian.cn.dao.entity.Emp;
import com.yueqian.cn.dao.impl.DeptDaoImpl;

public class TestDeptDaoImpl {
	public static void main(String[] args) {
		IDeptDao deptDao = new DeptDaoImpl();
		Dept dept = deptDao.getById(2);
		System.out.println(dept);
		System.out.println("的员工有");
		Set<Emp> emps = dept.getEmps();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
	}
}
