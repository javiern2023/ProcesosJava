//package Multiproceso;

import java.io.IOException;

public class Ejemplo1PB {
   public static void main(String[] args) throws IOException  {	 
	   
	   ProcessBuilder pb = new ProcessBuilder("NOTEPAD");
	   //Con el comando CMD /C DIR no se obtiene ninguna salida,
	   //porque la salida del comando se redirige a nuestro programa
	   //Java, no a la pantalla
	   //ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR c:");
	   Process p = pb.start();

   }
}

