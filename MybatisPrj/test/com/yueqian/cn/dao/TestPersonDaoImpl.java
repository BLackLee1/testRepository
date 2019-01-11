package com.yueqian.cn.dao;

import com.yueqian.cn.dao.entity.Person;
import com.yueqian.cn.dao.impl.PersonDaoImpl;

public class TestPersonDaoImpl {
	public static void main(String[] args) {
		IPersonDao personDao = new PersonDaoImpl();
		Person person = personDao.getById(1);
		System.out.println(person.getName()+"的身份证号是"+person.getCard().getNum());
	}
}
