package sai;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource rs=new ClassPathResource("demo.xml");
		BeanFactory bn=new XmlBeanFactory(rs);
		customer c=(customer)bn.getBean("cst");
		c.disp();
	}

}
