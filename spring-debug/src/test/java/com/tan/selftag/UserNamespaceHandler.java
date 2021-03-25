package com.tan.selftag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: tanlin
 * @Date: 2021/03/25/14:14
 * @Description:
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeandefinitionPaser());
	}
}
