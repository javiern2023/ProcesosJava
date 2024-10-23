//package Multiproceso;

import java.io.*;

public class Ejemplo2RT {
	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		
		//Ejecuta el comando y luego finaliza
		String comando = "CMD /C DIR";
		
		Process p = null;
		try {
			//Para leer la salida, lo que nos devuelve el m�todo exec()
			//del Runtime, tenemos que usar el objeto Process, que se 
			//obtiene con el siguiente comando
			p = r.exec(comando);
			
			//La clase Process proporciona el m�todo getInputStream para
			//leer el stream de salida del proceso, y as� leer lo que
			//el comando ejecuta y lo escriba en consola
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String linea;
			//Lee l�nea por l�nea con el m�todo readLine()
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
        // COMPROBACION DE ERROR - 0: bien - 1: mal
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
