package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class DaoOrdenador {

	public static void crearFicheroOrdenador(Ordenador o) {
		
		try (OutputStreamWriter  file = new OutputStreamWriter ((new FileOutputStream("ordenador.txt")),"UTF-8");
				BufferedWriter  obj = new BufferedWriter (file)) {
				obj.write(o.toString());
			System.out.println("Fichero creado");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("ERROR: fichero no creado");
			System.out.println(e.getMessage());
			return;
		}

		{

		}

	}
}
