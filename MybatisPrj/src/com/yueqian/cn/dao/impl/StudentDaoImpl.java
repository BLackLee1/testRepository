package com.yueqian.cn.dao.impl;

import org.apache.ibatis.session.SqlSession;

import com.yueqian.cn.dao.IStudentDao;
import com.yueqian.cn.dao.entity.Student;
import com.yueqian.cn.util.MybatisUtil;

public class StudentDaoImpl implements IStudentDao{

	@Override
	public Student getById(int id) {
		Student student = null;
		try {
			SqlSession sqlSession = MybatisUtil.getSqlSession();
			student = sqlSession.selectOne("com.yueqian.cn.dao.IStudentDao.getById", id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MybatisUtil.colseSqlSession();
		}
		return student;
	}

}
