package com.hch.test.baseTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * ����������
 */
public abstract class BaseTest {

	public ApplicationContext ac = null;

	public BaseTest() {
		ac = (ApplicationContext) new ClassPathXmlApplicationContext(
				new String[] { "spring/spring-context.xml", "spring/spring-mvc.xml" });
	}
}
