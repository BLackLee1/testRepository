package com.yueqian.cn.dao.impl;

import org.apache.ibatis.session.SqlSession;

import com.yueqian.cn.dao.IPersonDao;
import com.yueqian.cn.dao.entity.Person;
import com.yueqian.cn.util.MybatisUtil;

public class PersonDaoImpl implements IPersonDao{

	@Override
	public Person getById(int id) {
		Person person = null;
		try {
			SqlSession sqlSession = MybatisUtil.getSqlSession();
			person = sqlSession.selectOne("com.yueqian.cn.dao.IPersonDao.getById", id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MybatisUtil.colseSqlSession();
		}
		return person;
	}

}
