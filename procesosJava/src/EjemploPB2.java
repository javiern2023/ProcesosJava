//package Multiproceso;

import java.io.File;
import java.io.IOException;

public class EjemploPB2 {
	public static void main(String args[]) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
		File fOut = new File("C:\\Users\\yo\\Desktop\\Navazo\salida.txt");
		File fErr = new File("C:\\Users\\yo\\Desktop\\Navazo/error.txt");
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		pb.start();
	}
}