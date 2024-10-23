package procesosJava;

import java.io.IOException;

public class procesosRuntime {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Arranque del proceso
		//Runtime.getRuntime().exec("Notepad.exe");
		
		//Arranque del proceso indicando el archivo que debe abrir, si no existe lo crea
		//Runtime.getRuntime().exec("Notepad.exe notas.txt");
		
		//Arranque del proceso usanto un array de objetos
		//String[] infoProceso = {"Notepad.exe","notas.txt"};
		//Runtime.getRuntime().exec(infoProceso);
		
		//Gestionar el proceso lanzado
		//String[] infoProceso = {"Notepad.exe","notas.txt"};
		//Process proceso = Runtime.getRuntime().exec(infoProceso);
		
		/* Si se necesita esperar a que el proceso ejecutado termine y conocer el estado
		 * en que ha finalizado dicha ejecución, se puede utilizar el método wairFor.*/
		  String [] infoProceso = {"Notepad.exe","notas.txt"};
		  Process proceso = Runtime.getRuntime().exec(infoProceso);
		  int codigoRetorno = proceso.waitFor();
		  System.out.println("Fin de la ejecución: "+codigoRetorno);
		 
		 
	}

}
