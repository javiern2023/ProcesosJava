//package Multiproceso;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejemplo2Runtime {

	public static void main(String[] args) {
		
		//Directorio de trabajo
		//File directorio = new File("/home/usuario/");
		//Directorio de trabajo
		File directorio = new File("C:\\Users\\yo");
		
		//Captura el curso de ejecuci�n de la aplicaci�n Java
		Runtime ejecutar = Runtime.getRuntime();
		
		//Comando a ejecutar
		String [] cmd = {"ls","-l"," /home/usuario"};
		
		try {
			//Ejecuta el comando y guarda el proceso en 'Salida' 
			Process Salida = ejecutar.exec(cmd,null,directorio);
			//Captura el resultado del comando y lo escribe por pantalla
			InputStream is = Salida.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader bf = new BufferedReader(isr);
			//BufferedReader bf = new BufferedReader(new InputStreamReader(Salida.getInputStream()));
			
			String linea;
			
			while( (linea=bf.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (Exception ex) {
			//ex.printStackTrace();
			System.out.println(ex.getMessage());
			System.out.println("Ha habido un error en la ejecución del comando");
		}
	}
}