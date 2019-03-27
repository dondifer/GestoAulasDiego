package ejemplo05beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorSpring {
	public static void main(String[]args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
		MorcilladeLeon bean = (MorcilladeLeon) applicationContext.getBean("MorcilladeLeon");
		
		System.out.println(bean);
		
		bean.setColor("Esta que te mueres!!");
		bean.setSabor("Esta es de Villada");
		MorcilladeLeon otraMorcilla = (MorcilladeLeon) applicationContext.getBean("MorcilladeLeon");
		
		System.out.println(bean);
		System.out.println(otraMorcilla);

	}
}
