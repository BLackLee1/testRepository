package com.yueqian.cn.dao.entity;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private Integer id;
	private String name;
	private Set<Teacher> teachers = new HashSet<Teacher>();

	public Student() {
		super();
	}

	public Student(Integer id, String name, Set<Teacher> teachers) {
		super();
		this.id = id;
		this.name = name;
		this.teachers = teachers;
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

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", teachers=" + teachers + "]";
	}

}
