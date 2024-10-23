//package Multiproceso;

import java.io.IOException;

public class EjemploRuntime {
	public static void main(String[] args) throws IOException {

		String comando = "cmd.exe /c dir";

		Runtime comandos = Runtime.getRuntime();

		
		  System.out.println((comandos.totalMemory()) / 1024 / 1024 + " MB");
		  System.out.println(comandos.availableProcessors() + " Procesadores");
		  System.out.println((comandos.freeMemory()) / 1024 / 1024 + " MB");
		  System.out.println((comandos.maxMemory()) / 1024 / 1024 + " MB");
		 

		comandos.exec(comando);
	}
}
