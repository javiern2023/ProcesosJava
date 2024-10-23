//package Multiproceso;

public class Procesos2 {	
	public static void main(String[] args) {
		System.out.println("creando proceso.");
		try 
		{
			Process p1 = Runtime.getRuntime().exec("notepad.exe");
			Process p2 = Runtime.getRuntime().exec("cmd /c start C:\\Users\\yo\\Desktop\\Navazo\\algoritmos.xlsx");
			Process p3 = Runtime.getRuntime().exec("cmd /c dir C:");
	    }
		catch (Exception ex) 
		{
			System.out.println("se ha producido el fallo: " + ex.getMessage());
	    }
	}
} 
