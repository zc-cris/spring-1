package com.zc.cris.dataSourceProperties;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class testBeansProperties {

	/*
	 * 窝草！c3p0的 jar 包不要用最新版，用c3p0-0.9.2.1.jar搭配mchange-commons-java-0.2.3.4.jar集合，否则会报找不到 class 的错误
	 */
	@Test
	void testProperties() throws SQLException {
		
		ApplicationContext application = new ClassPathXmlApplicationContext("beans-properties.xml");
		
		System.out.println(application);
		DataSource bean = (DataSource) application.getBean("dataSource");
		System.out.println(bean.getConnection());
		
		
		
		
	}

}
