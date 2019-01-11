package com.yueqian.cn.dao.entity;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private String password;
	private String sex;
	private String address;
	private Date birthday;
	private Double money;
	private Integer score;

	public User() {
		super();
	}

	public User(Integer id, String name, String sex, String address, Date birthday, Double money, Integer score) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.birthday = birthday;
		this.money = money;
		this.score = score;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", address=" + address + ", birthday=" + birthday
				+ ", money=" + money + ", score=" + score + "]";
	}

}
