package com.teshca.javase.java.springframework.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCShowCase {

	public void loadContainer() throws BeansException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		System.out.println(context != null);
		MyXMLBasedSpringBean1 xmlBean1 = (MyXMLBasedSpringBean1)context.getBean("xmlbean1");
		System.out.println(xmlBean1 != null);
	}
}
