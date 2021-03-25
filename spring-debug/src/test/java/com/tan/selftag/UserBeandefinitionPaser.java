package com.tan.selftag;




import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;
import org.springframework.util.StringUtils;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: tanlin
 * @Date: 2021/03/25/14:01
 * @Description:
 */
public class UserBeandefinitionPaser extends AbstractSingleBeanDefinitionParser {
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String userName = element.getAttribute("username");
		String email = element.getAttribute("email");
		String id = element.getAttribute("id");
		if (StringUtils.hasText(userName)){
			builder.addPropertyValue("userName",userName);
		}
		if (StringUtils.hasText(email)){
			builder.addPropertyValue("email",email);
		}
		if (StringUtils.hasText(id)){
			builder.addPropertyValue("id",id);
		}
	}
}
