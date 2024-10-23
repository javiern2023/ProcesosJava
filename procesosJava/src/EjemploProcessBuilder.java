//package Multiproceso;

import java.io.File;

public class EjemploProcessBuilder{

	public static void main(String[] args) {
		File directorio = new File("C:\\Users\\yo\\salida.txt");
		//Comando a ejecutar
		String cmd = "dir";
		//String [] cmd = { "CMD /C","DIR"};//, "C:\\Prueba"};
		try {
			ProcessBuilder pb = new ProcessBuilder();
			pb.command(cmd);
			//pb.directory();
			//pb.directory(new File("C:\\Users\\yo\\salida.txt"));
			//Devuelve array con los elementos del comando
			System.out.println(pb.command());
			//Devuelve las variables de entorno de Windows
			System.out.println(pb.environment());
			
			//redirecciona la salida a un fichero nuevo (salida.txt)
			pb.redirectOutput(directorio);
			//Redirecciona la salida del error
			pb.redirectError(directorio);
		
			pb.start();//Ejecuta el comando

			//System.out.println(pb);
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}	
}