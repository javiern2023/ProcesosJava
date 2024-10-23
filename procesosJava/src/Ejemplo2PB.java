//package Multiproceso;

import java.io.*;

public class Ejemplo2PB {
	public static void main(String[] args) throws IOException {

		Process p = new ProcessBuilder("CMD", "/C", "DIR c:").start();
		try {
			InputStream is = p.getInputStream();
			//Muestra en pantalla caracter a caracter
			 int c;
			 while ((c = is.read()) != -1)
				System.out.print((char) c);
			 is.close();

		
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
}// Ejemplo2
