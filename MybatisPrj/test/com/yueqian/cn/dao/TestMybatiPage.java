package com.yueqian.cn.dao;

import java.util.List;

import com.yueqian.cn.dao.entity.User;
import com.yueqian.cn.dao.impl.UserDaoImpl;
import com.yueqian.cn.util.Page;

public class TestMybatiPage {
	public static void main(String[] args) {
		IUserDao userDao = new UserDaoImpl();
		Page<User> page = userDao.getOnePage(1, 3);
		System.out.println("当前页码是：第"+page.getCurrentPage()+"页");
		System.out.println("总共有"+page.getTotalPage()+"页");
		System.out.println("总共有"+page.getTotalCount()+"条记录");
		System.out.println("每页显示"+page.getPageSize()+"条记录");
		System.out.println("每页的详细信息是：");
		List<User> users = page.getLists();
		for (User user : users) {
			System.out.println(user);
		}
	}
}
