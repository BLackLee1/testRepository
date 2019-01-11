package com.yueqian.cn.dao;

import java.util.HashMap;
import java.util.List;

import com.yueqian.cn.dao.entity.User;
import com.yueqian.cn.util.Page;

public interface IUserDao {

	public User getUserById(int id);
	public List<User> getAll();
	public User getUserByNameAndPass(User user);
	public int save(User user);
	
	//·ÖÒ³
	public int getTotalCount();
	public List<User> getOnePageInfo(HashMap hashMap);
	public Page<User> getOnePage(int currentPage, int pageSize);
}
