package com.yueqian.cn.dao;

import java.util.List;

import com.yueqian.cn.dao.entity.User;
import com.yueqian.cn.dao.impl.UserDaoImpl;
import com.yueqian.cn.util.Page;

public class TestMybatiPage {
	public static void main(String[] args) {
		IUserDao userDao = new UserDaoImpl();
		Page<User> page = userDao.getOnePage(1, 3);
		System.out.println("��ǰҳ���ǣ���"+page.getCurrentPage()+"ҳ");
		System.out.println("�ܹ���"+page.getTotalPage()+"ҳ");
		System.out.println("�ܹ���"+page.getTotalCount()+"����¼");
		System.out.println("ÿҳ��ʾ"+page.getPageSize()+"����¼");
		System.out.println("ÿҳ����ϸ��Ϣ�ǣ�");
		List<User> users = page.getLists();
		for (User user : users) {
			System.out.println(user);
		}
	}
}
