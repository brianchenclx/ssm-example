package com.example.ssm.spring.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.ssm.spring.service.HelloWorld;

/**
 * @author chenlixin at 2017年1月4日 下午4:21:24
 */
public class MethodInjectTest {

	@Test
	public void helloWorld() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:/com.example.ssm/spring/biz-service-methodInject.xml");
		System.out.println("---singleton-sayHello---");
		HelloWorld bean = context.getBean("singleton-hello", HelloWorld.class);
		bean.sayHello();
		bean = context.getBean("singleton-hello", HelloWorld.class);
		bean.sayHello();

		System.out.println("---prototype-sayHello---");
		bean = context.getBean("prototype-hello", HelloWorld.class);
		bean.sayHello();
		bean = context.getBean("prototype-hello", HelloWorld.class);
		bean.sayHello();

		// System.out.println("---replacer method---");
		// Printer printer = context.getBean("printer", Printer.class);
		// printer.print("printer");
	}
}
