package com.yueqian.cn.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yueqian.cn.dao.IEmpDao;
import com.yueqian.cn.dao.entity.Emp;
import com.yueqian.cn.util.MybatisUtil;

public class EmpDaoImpl implements IEmpDao{

	@Override
	public Emp getById(int id) {
		Emp emp = null;
		try {
			SqlSession sqlSession = MybatisUtil.getSqlSession();
			emp = sqlSession.selectOne("com.yueqian.cn.dao.IEmpDao.getById", id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MybatisUtil.colseSqlSession();
		}
		return emp;
	}

	@Override
	public List<Emp> getAll() {
		List<Emp> emps = null;
		try {
			SqlSession sqlSession = MybatisUtil.getSqlSession();
			emps = sqlSession.selectList("com.yueqian.cn.dao.IEmpDao.getAll");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MybatisUtil.colseSqlSession();
		}
		return emps;
	}

}
