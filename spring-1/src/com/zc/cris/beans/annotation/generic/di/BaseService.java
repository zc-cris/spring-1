package com.zc.cris.beans.annotation.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	
	@Autowired
	protected BaseDao<T> baseDao;
	
	public void say() {
		System.out.println("baseService.....");
		System.out.println(baseDao);
	}
}
