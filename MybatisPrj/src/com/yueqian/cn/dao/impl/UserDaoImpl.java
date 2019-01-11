package com.yueqian.cn.dao.impl;

import java.io.File;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yueqian.cn.dao.IUserDao;
import com.yueqian.cn.dao.entity.User;
import com.yueqian.cn.util.MybatisUtil;
import com.yueqian.cn.util.Page;

public class UserDaoImpl implements IUserDao {

	@Override
	public User getUserById(int id) {
		User user = null;
		Reader reader = null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();
			IUserDao userDao = sqlSession.getMapper(IUserDao.class);
			// user =
			// sqlSession.selectOne("com.yueqian.cn.dao.IUserDao.getUserById",
			// id);
			user = userDao.getUserById(id);
			System.out.println(user.getName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		
		SqlSession sqlSession2 = sf.openSession();
		IUserDao userDao = sqlSession2.getMapper(IUserDao.class);
		user = userDao.getUserById(id);
		System.out.println(user.getName());

		return user;
	}

	@Override
	public List<User> getAll() {
		List<User> users = null;
		Reader reader = null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();
			IUserDao userDao = sqlSession.getMapper(IUserDao.class);
			// users =
			// sqlSession.selectList("com.yueqian.cn.dao.IUserDao.getAll");
			users = userDao.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

		return users;
	}

	@Override
	public User getUserByNameAndPass(User user) {
		User resultUser = null;
		Reader reader = null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();
			IUserDao userDao = sqlSession.getMapper(IUserDao.class);
			// resultUser =
			// sqlSession.selectOne("com.yueqian.cn.dao.IUserDao.getUserByNameAndPass",user);
			resultUser = userDao.getUserByNameAndPass(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

		return resultUser;
	}

	@Override
	public int save(User user) {
		int rows = -1;
		User resultUser = null;
		Reader reader =null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession= null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();
			IUserDao userDao = sqlSession.getMapper(IUserDao.class);
			rows = userDao.save(user);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}finally {
		sqlSession.close();
		}
		return rows;
	}

	@Override
	public int getTotalCount() {
		int totalCount = -1;
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		IUserDao userDao = sqlSession.getMapper(IUserDao.class);
		totalCount = userDao.getTotalCount();
		return totalCount;
	}

	@Override
	public List<User> getOnePageInfo(HashMap hashMap) {
		List<User> users = null;
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		users = sqlSession.selectList("com.yueqian.cn.dao.IUserDao.getOnePageInfo", hashMap);
		return users;
	}

	@Override
	public Page<User> getOnePage(int currentPage, int pageSize) {
		int totalCount = this.getTotalCount();
		HashMap hashMap = new HashMap();
		hashMap.put("startRow", (currentPage-1)*pageSize);
		hashMap.put("endRow", pageSize);
		List<User> lists = this.getOnePageInfo(hashMap);
		return new Page<User>(currentPage, pageSize, totalCount, lists);
	}
}
