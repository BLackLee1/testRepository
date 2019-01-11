package com.yueqian.cn.dao;

import java.util.List;

import com.yueqian.cn.dao.entity.Category;

public interface ICategoryDao {

	public Category getParentById(int id);
	public List<Category> getChildrenById(int id);
}
