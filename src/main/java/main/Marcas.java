package main;

public class Marcas {
	public static String marcasAleatorias() {
		String[] marcas = new String[] {"INTEL","AMD","MSI","NVIDIA","ACER","ASUS","GIGABYTE","CORSAIR","HP","ALIENWARE","RAZER","LOGITECH"};
		System.out.println((int)(Math.random() * (marcas.length - 1)));
		return marcas[(int) ((Math.random() * (marcas.length - 1)))]; 
	}
}
