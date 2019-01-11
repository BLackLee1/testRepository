package com.yueqian.cn.dao.impl;

import org.apache.ibatis.session.SqlSession;

import com.yueqian.cn.dao.ICardDao;
import com.yueqian.cn.dao.entity.Card;
import com.yueqian.cn.util.MybatisUtil;

public class CardDaoImpl implements ICardDao{

	@Override
	public Card getById(int id) {
		Card card = null;
		try {
			SqlSession sqlSession = MybatisUtil.getSqlSession();
			card = sqlSession.selectOne("com.yueqian.cn.dao.ICardDao.getById", id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MybatisUtil.colseSqlSession();
		}
		return card;
	}

}
