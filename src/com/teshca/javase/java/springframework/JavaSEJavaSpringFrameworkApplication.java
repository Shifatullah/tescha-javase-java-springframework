package com.teshca.javase.java.springframework;

import com.teshca.javase.java.springframework.ioc.IoCShowCase;

public class JavaSEJavaSpringFrameworkApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IoCShowCase showcase = new IoCShowCase();
		showcase.loadContainer();		
	}

}
