package com.yueqian.cn.dao;

import java.util.Set;

import com.yueqian.cn.dao.entity.Student;
import com.yueqian.cn.dao.entity.Teacher;
import com.yueqian.cn.dao.impl.StudentDaoImpl;

public class TestStudentDaoImpl {
	public static void main(String[] args) {
		IStudentDao studentDao = new StudentDaoImpl();
		Student student = studentDao.getById(1);
		System.out.println(student.getName()+"的老师有");
		Set<Teacher> teachers = student.getTeachers();
		for (Teacher teacher : teachers) {
			System.out.println(teacher.getName());
		}
	}
}
