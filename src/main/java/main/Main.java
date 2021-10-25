package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

public class Main {

	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Ordenador ordenador = context.getBean("ordenador", Ordenador.class);
		ordenador.calcularPrecioComponentes();
		System.out.println(ordenador);
		DaoOrdenador.crearFicheroOrdenador(ordenador);
		
	}

}
