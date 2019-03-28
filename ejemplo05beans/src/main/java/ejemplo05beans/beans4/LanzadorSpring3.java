package ejemplo05beans.beans4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorSpring3 {

	public static ApplicationContext context;
	
	static {
		context = new ClassPathXmlApplicationContext("beans3.xml");
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
