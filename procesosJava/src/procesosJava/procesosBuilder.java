package procesosJava;

import java.io.File;
import java.io.IOException;

public class procesosBuilder {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Creación de un proceso. No supone la ejecución del programa.
		//new ProcessBuilder ("Notepad.exe");
		
		//Ejecución del proceso
		//new ProcessBuilder ("Notepad.exe").start();
		
		//El constructor admite parámetros que serán entregados al proceso que se crea
		//new ProcessBuilder ("Notepad.exe","datos.txt").start();
		
		/*El método start proporciona un proceso como retorno, lo que posibilita la 
		 * sincronización y gestión de este. */
		/*Process proceso = new ProcessBuilder("Notepad.exe","datos.txt").start();
		int valorRetorno = proceso.waitFor();
		System.out.println("Valor retorno: "+valorRetorno);*/
		
		// El método start permite crear múltiples subprocesos
		/*ProcessBuilder pBuilder = new ProcessBuilder("Notepad.exe");
		for(int i=0;i<4;i++) {
			pBuilder.start();
		}*/
		
		//Crea un objeto ProcessBuilder y determina el directorio de trabajo del proceso
		ProcessBuilder pBuilder = new ProcessBuilder("Notepad.exe","datos.txt");
		pBuilder.directory(new File("C:\\Users\\yo"));
	}

}
