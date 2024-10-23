//package Multiproceso;

import java.io.File;
import java.io.IOException;

public class EjemploPB3 {
	public static void main(String args[]) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("CMD");
		//Poner ruta correcta para la creación
		File fBat = new File("C:/Prueba/fichero.bat");//archivo por lotes. Automatización de tares
		File fOut = new File("C:/Prueba/salida.txt");
		File fErr = new File("C:/Prueba/error.txt");
		pb.redirectInput(fBat);
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		pb.start();
	}
}
