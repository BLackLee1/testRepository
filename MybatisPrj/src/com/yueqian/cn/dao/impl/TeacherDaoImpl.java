package com.yueqian.cn.dao.impl;

import org.apache.ibatis.session.SqlSession;

import com.yueqian.cn.dao.ITeacherDao;
import com.yueqian.cn.dao.entity.Teacher;
import com.yueqian.cn.util.MybatisUtil;

public class TeacherDaoImpl implements ITeacherDao{

	@Override
	public Teacher getById(int id) {
		Teacher teacher = null;
		try {
			SqlSession sqlSession = MybatisUtil.getSqlSession();
			teacher = sqlSession.selectOne("com.yueqian.cn.dao.ITeacherDao.getById", id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MybatisUtil.colseSqlSession();
		}
		return teacher;
	}

}
