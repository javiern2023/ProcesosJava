//package Multiproceso;

import java.io.*;
import java.util.*;

public class EjemploPB1 {
	public static void main(String args[]) {
		ProcessBuilder test = new ProcessBuilder();
		
		//Captura las variables de entorno de Windows
		//y las escribe por consola
		Map entorno = test.environment();
		System.out.println("Variables de entorno:");
		System.out.println(entorno);
		
		//Creamos un nuevo proceso
		test = new ProcessBuilder("java", "Unsaludo", "\"Hola Mundo!!\"");
		
		//Devuelve el nombre del proceso y sus argumentos
		List l = test.command();
		Iterator iter = l.iterator();
		System.out.println("Argumentos del comando:");
		while (iter.hasNext())
			System.out.println(iter.next());
		
		//Ejecutamos el comando DIR
		test = test.command("CMD", "/C", "DIR");
		try {
			Process p = test.start();
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String linea;
			while ((linea = br.readLine()) != null) // lee la salida st�ndar
				System.out.println(linea);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
