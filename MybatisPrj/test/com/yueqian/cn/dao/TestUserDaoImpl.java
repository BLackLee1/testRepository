package com.yueqian.cn.dao;

import java.util.Date;
import java.util.List;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVisitor;

import com.yueqian.cn.dao.entity.User;
import com.yueqian.cn.dao.impl.UserDaoImpl;

public class TestUserDaoImpl {
	public static void main(String[] args) {
		IUserDao userDao = new UserDaoImpl();
		User user = userDao.getUserById(1);
		System.out.println(user);
		
		/*IUserDao userDao = new UserDaoImpl();
		List<User> users = userDao.getAll();
		for (User user : users) {
			System.out.println(user);
		}*/
		
		/*IUserDao userDao = new UserDaoImpl();
		User user = new User();
		user.setName("qq");
		user.setPassword("1111");
		User resultUser = null;
		resultUser = userDao.getUserByNameAndPass(user);
		System.out.println(resultUser);*/
		
		/*IUserDao userDao = new UserDaoImpl();
		int rows = -1;
		User user = new User(11, "Âí»¯ÌÚ", "ÄÐ", "ÉîÛÚ", new Date(), 54616D, 545);
		rows = userDao.save(user);
		System.out.println(rows);*/
	}
}
