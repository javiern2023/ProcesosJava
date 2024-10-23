import java.io.IOException;

public class CreacionProcesoRuntime {
	public static void main(String[] args) throws IOException, InterruptedException {
		//Arranca un proceso
		Runtime.getRuntime().exec("Notepad.exe");
		
		//Arranca el proceso y asigna nombre al fichero
		//Se pueden pasar parámetros
		Runtime.getRuntime().exec("Notepad.exe notas.txt");
		
		//Se le puede pasar array de objetos String
		String [] infoProceso = {"Notepad.exe" , "notas.txt"};
		Runtime.getRuntime().exec(infoProceso);
		
		//Podemos gestionar el proceso lanzado y conocer estado finalización
		String [] infoProceso1 = {"Notepad.exe" , "notas.txt"};
		Process proceso = Runtime.getRuntime().exec(infoProceso1);
		int codigoRetorno = proceso.waitFor();
		System.out.println("Fin de la ejecución: "+codigoRetorno);
	
		
	}
	
}
