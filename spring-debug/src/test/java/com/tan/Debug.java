package com.tan;


import com.tan.selftag.User;
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
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/tan/lifecycleTests.xml");
		LifecycleTestBean lifecycleTestBean = (LifecycleTestBean) ctx.getBean("bean1");

		User user = (User) ctx.getBean("myuser");

		System.out.println("sss"+user.getEmail());
	}
}
