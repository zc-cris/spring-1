package com.zc.cris.beans.annotation.generic.di;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao<User> extends BaseDao<User>{
	
}
