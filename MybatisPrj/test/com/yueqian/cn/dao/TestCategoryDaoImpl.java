package com.yueqian.cn.dao;

import java.util.List;

import com.yueqian.cn.dao.entity.Category;
import com.yueqian.cn.dao.impl.CategoryDaoImpl;

public class TestCategoryDaoImpl {
	public static void main(String[] args) {
		ICategoryDao categoryDao = new CategoryDaoImpl();
		Category parent = categoryDao.getParentById(6);
		System.out.println(parent.getName()+"����Ŀ¼��");
		List<Category> children = categoryDao.getChildrenById(6);
		for (Category category : children) {
			System.out.println(category.getName());
		}
		
		/*ICategoryDao categoryDao = new CategoryDaoImpl();
		List<Category> children = categoryDao.getChildrenById(6);
		for (Category category : children) {
			System.out.println(category.getName());
		}
		System.out.println("�ĸ�Ŀ¼��");
		Category parent = categoryDao.getParentById(6);
		System.out.println(parent.getName());*/
		
		//��ѯ���׵����к��ӣ�
		
		
		
		
	}
}
