package com.yueqian.cn.dao.impl;

import org.apache.ibatis.session.SqlSession;

import com.yueqian.cn.dao.IDeptDao;
import com.yueqian.cn.dao.entity.Dept;
import com.yueqian.cn.util.MybatisUtil;

public class DeptDaoImpl implements IDeptDao{

	@Override
	public Dept getById(int id) {
		Dept dept = null;
		try {
			SqlSession sqlSession = MybatisUtil.getSqlSession();
			dept = sqlSession.selectOne("com.yueqian.cn.dao.IDeptDao.getById", id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MybatisUtil.colseSqlSession();
		}
		return dept;
	}

}
