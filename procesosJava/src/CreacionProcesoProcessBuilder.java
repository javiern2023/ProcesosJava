

import java.io.File;
import java.io.IOException;

public class CreacionProcesoProcessBuilder {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Crea el proceso
		new ProcessBuilder ("Notepad.exe");
		
		//Crea el proceso y lo ejecuta
		new ProcessBuilder ("Notepad.exe").start();
		
		//Admite parámetros
		new ProcessBuilder ("Notepad.exe","datos.txt").start();
		
		//El método start proporciona un proceso como retorno
		Process proceso = new ProcessBuilder("Notepad.exe","datos.txt").start();
		int codigoRetorno = proceso.waitFor();
		System.out.println("Fin de la ejecución: "+codigoRetorno);
		
		//El método start permite crear múltiples subprocesos
		ProcessBuilder pB = new ProcessBuilder("Notepad.exe");
		for(int i=0;i<10;i++) {
			pB.start();
		}
		
		//Crea el proceso y determina el directorio de trabajo
		ProcessBuilder pB1 = new ProcessBuilder("Notepad.exe","datos.txt");
		pB1.directory(new File("C:/Users/yo"));
		
		
	}

}
