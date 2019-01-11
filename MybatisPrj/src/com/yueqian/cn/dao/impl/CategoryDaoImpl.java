package com.yueqian.cn.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yueqian.cn.dao.ICategoryDao;
import com.yueqian.cn.dao.entity.Category;
import com.yueqian.cn.util.MybatisUtil;

public class CategoryDaoImpl implements ICategoryDao{

	@Override
	public Category getParentById(int id) {
		Category parent = null;
		try {
			SqlSession sqlSession = MybatisUtil.getSqlSession();
			parent = sqlSession.selectOne("com.yueqian.cn.dao.ICategoryDao.getParentById", id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MybatisUtil.colseSqlSession();
		}
		return parent;
	}

	@Override
	public List<Category> getChildrenById(int id) {
		List<Category> children = null;
		try {
			SqlSession sqlSession = MybatisUtil.getSqlSession();
			children = sqlSession.selectList("com.yueqian.cn.dao.ICategoryDao.getChildrenById", id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MybatisUtil.colseSqlSession();
		}
		return children;
	}

}
