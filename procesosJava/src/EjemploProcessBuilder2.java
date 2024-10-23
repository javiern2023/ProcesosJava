//package Multiproceso;


import java.io.File;
import java.lang.ProcessBuilder.Redirect;

public class EjemploProcessBuilder2 {

	public static void main(String[] args) {

		File fichSalida = new File("/home/usuario/salida.txt");
		File fichError = new File("/home/usuario/error.txt");
		File fichGrep = new File("/home/usuario/grep.txt");

		// Comando a ejecutar
		// String cmd = "ls -la";
		String[] cmd = { "ls", "-lah" };// ,"/home/usuario",">","pepe.txt"};
		try {
			ProcessBuilder pb = new ProcessBuilder();
			pb.command(cmd);
			pb.directory(new File("/home/usuario/"));
			// Devuelve array con los elementos del comando
			System.out.println(pb.command());
			// Devuelve las variables de entorno de Linux
			System.out.println(pb.environment());

			// redirecciona la salida a un fichero nuevo (salida.txt)
			// pb.redirectOutput(Redirect.appendTo(fichSalida));
			// pb.redirectOutput(Redirect.INHERIT);
			pb.redirectOutput(fichSalida);
			// Redirecciona la salida del error
			pb.redirectError(fichError);

			// Muestra todos los ficheros y carpetas
			long proceso = pb.start().pid();// Ejecuta el comando
			System.out.println("PID Proceso 1: " + proceso);

			// Redirecciono la entrada del comando para que lea el
			// fichero generado en el anterior comando
			pb.redirectInput(fichSalida);
			pb.redirectOutput(fichGrep);
			String[] cmd2 = { "grep", "root" };

			// Muestra todos los ficheros y carpetas del usuario root
			pb.command(cmd2);
			proceso = pb.start().pid();// Ejecuta el comando
			System.out.println("PID Proceso 2: " + proceso);

			// System.out.println(pb);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}