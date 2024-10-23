//package Multiproceso;

public class Procesos {	
	public static void main(String[] args) {
		System.out.println("creando proceso.");
		try 
		{
			Process p1=new ProcessBuilder("notepad.exe").start();
	        String[] comando={"cmd","/c","start","C:\\Users\\yo\\salida.txt"};
	        Process p2 = new ProcessBuilder(comando).start();
	        String[] comando2 = {"cmd", "/c", "dir C:"};
	        Process p3 = new ProcessBuilder(comando2).start();
	    }
		catch (Exception ex) 
		{
	       System.out.println("se ha producido alg�n fallo: " + ex.getMessage());
	    }
	}
} 
