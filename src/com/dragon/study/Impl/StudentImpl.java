package com.dragon.study.Impl;

import com.dragon.study.IStudent;

public class StudentImpl implements IStudent {


	@Override
	public void addStudent(String name) {
		// TODO Auto-generated method stub
		System.out.println(" ��ӭ  " + name + "  �����Spring��ͥ! ");
	}

	@Override
	public void deleteStudent(String name) {
		// TODO Auto-generated method stub
		System.out.println("ɾ��----"+"name");
	}

}
