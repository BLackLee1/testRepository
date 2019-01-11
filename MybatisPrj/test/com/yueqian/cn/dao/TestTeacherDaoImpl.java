package com.yueqian.cn.dao;

import java.util.Set;

import com.yueqian.cn.dao.entity.Student;
import com.yueqian.cn.dao.entity.Teacher;
import com.yueqian.cn.dao.impl.TeacherDaoImpl;

public class TestTeacherDaoImpl {
	public static void main(String[] args) {
		ITeacherDao teacherDao = new TeacherDaoImpl();
		Teacher teacher = teacherDao.getById(1);
		System.out.println(teacher.getName()+"的学生有");
		Set<Student> students = teacher.getStudents();
		for (Student student : students) {
			System.out.println(student.getName());
		}
	}
}
