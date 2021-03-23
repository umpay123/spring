package com.tan;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: tanlin
 * @Date: 2021/03/11/17:35
 * @Description:
 */
public class Debug {
	public static void main(String[] args) {
		System.out.println("aa");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycleTests.xml");


		System.out.println("sss");
	}
}
