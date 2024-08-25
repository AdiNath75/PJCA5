package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {	
		Resource r = new ClassPathResource("sample.xml");
		
		BeanFactory fact  = new XmlBeanFactory(r);
		
		Object o = fact.getBean("t");
		Object o1 = fact.getBean("t");
		Object o2 = fact.getBean("t");
		 
		System.out.println(o1==o2);
		System.out.println(o2==o);
		Test t = (Test)o;
		t.hello();
	}

}
