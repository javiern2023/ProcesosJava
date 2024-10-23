//package Multiproceso;

public class Ejemplo1RT {
	public static void main(String[] args) {
		//Captura el curso de ejecucion de la aplicacion Java,
		//el entorno de ejecucion d la aplicacion
		Runtime r = Runtime.getRuntime();
		//Con el comando CMD /C DIR no se obtiene ninguna salida,
		//porque la salida del comando se redirige a nuestro programa
		//Java, no a la pantalla
		//String comando = "CMD /C DIR";
		String comando = "NOTEPAD";
		Process p;
		try {
			p = r.exec(comando);
		} catch (Exception e) {
			System.out.println("Error en: " + comando);
			e.printStackTrace();
		}
	}
}
