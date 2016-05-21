package com.dragon.study.Impl;

import com.dragon.study.IBook;

public class BookImpl implements IBook {

	@Override
	public void addBook(String name) {
		// TODO Auto-generated method stub
		System.out.println("addBook----" + name);
	}

	@Override
	public void deleteBook(String name) {
		// TODO Auto-generated method stub
		System.out.println("deleteBook----" + name);
	}
}
