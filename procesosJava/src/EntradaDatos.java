//package Multiproceso;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EntradaDatos {
    public static void main(String[] args) throws IOException {
       Process proceso = new ProcessBuilder("cmd","/c","date").start();   
       
       //Creo stream de entrada al proceso
       OutputStream os = proceso.getOutputStream();
       
       //Escribo en el stream el rgumento para el proceso, en bytes
       os.write("11-11-2021".getBytes());
       //Vuelco la informaci�n del stream en el proceso
       os.flush();

       //Leo el resultado del comando caracter a caracter
       InputStream is = proceso.getInputStream();
       int s;
       while((s = is.read()) !=-1)
       {
    	   System.out.print((char) s);
       }
       //Cierro los stream, entrada y salida
       is.close();
       os.close();
       
       int exito;
       
       try {
    	   //Compruebo si el comando se ha ejecutado con �xito o no
    	   exito = proceso.waitFor();
    	   System.out.println("Valor de salida: " + exito);
       }
       catch (InterruptedException e){
    	   System.out.println(" ��� ERROR !!! ");
    	   e.printStackTrace();
       }
	}
}
