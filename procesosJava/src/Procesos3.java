//package Multiproceso; 

public class Procesos3 {	
	public static void main(String[] args) {		

   System.out.println("creando proceso.");
   try 
   {
      //creaci�n y ejecuci�n de un proceso:
	  Process miProceso = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\EXCEL.EXE").start();
	  Thread.sleep(10000);//durmiendo el proceso			
	  //destrucci�n del proceso hijo:			
	  System.out.println("destruyendo proceso.");
	  miProceso.destroy();
	}
    catch (Exception ex) 
    {
    	System.out.println("se ha producido alg�n fallo: " + ex.getMessage());			
	} 
}
}
