package com.dragon.study.Impl;

import com.dragon.study.IStudent;

public class StudentImpl implements IStudent {


	@Override
	public void addStudent(String name) {
		// TODO Auto-generated method stub
		System.out.println(" »¶Ó­  " + name + "  Äã¼ÓÈëSpring¼ÒÍ¥! ");
	}

	@Override
	public void deleteStudent(String name) {
		// TODO Auto-generated method stub
		System.out.println("É¾³ı----"+"name");
	}

}
