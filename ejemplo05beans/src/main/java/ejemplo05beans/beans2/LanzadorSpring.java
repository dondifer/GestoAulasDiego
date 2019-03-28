package ejemplo05beans.beans2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorSpring {
	public static ApplicationContext context;
	
	
	static {
		context = new ClassPathXmlApplicationContext("beans2.xml");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Personilla eustakio = context.getBean("Eustakio",Personilla.class);
		System.out.println(eustakio);
		
		
		Personilla personillaUno = context.getBean("miPrototipoDePersonilla",Personilla.class);
		Personilla personillaDos = context.getBean("miPrototipoDePersonilla",Personilla.class);
		Personilla personillaTres = context.getBean("miPrototipoDePersonilla",Personilla.class);
		
		
		List<Personilla> listaPersonillas =  (context.getBean("listaPersonillas",List.class));
		
		
		
	}
}
