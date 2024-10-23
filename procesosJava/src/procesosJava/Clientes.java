package procesosJava;
import java.util.concurrent.Semaphore;

public class Clientes implements Runnable{

	//Declaramos las variables que vamos a usar
	private static Semaphore tienda = new Semaphore(10);
	private static Semaphore caja1 = new Semaphore(1);
	private static Semaphore caja2 = new Semaphore(1);
	private static Semaphore caja3 = new Semaphore(1);
	private static Semaphore caja4 = new Semaphore(1);
	protected int gastoCompraCliente = 0;
	protected static int recaudacionTotal = 0;
	protected int identificador = 0;
	protected static int numCliente = 20;
	private boolean atendido;
		
	public Clientes(int identificador) {	
		this.identificador = identificador;
		atendido = false;
	}
	
	public void run() {
		try {
			tienda.acquire(); //Cliente entra en la tienda
			System.out.println ("Cliente "+this.identificador + " entra en la tienda de deportes.");
				
			if(atendido == false) {
				//CAJA 1
				caja1.acquire(); //Cliente dentro de la tienda lo atienden en una caja			
				System.out.println ("El cliente "+this.identificador+" está siendo atendido en la caja 1.");
				gastoCompraCliente = (int) (Math.random()*10);
				recaudacionTotal += gastoCompraCliente;
				atendido = true;
					
				caja1.release(); //Cliente dentro de la tienda deja libre una caja
				System.out.println ("El cliente "+this.identificador+" termina en la caja 1.");}
				
				//CAJA 2
				
				else if(atendido == false) {
					caja2.acquire(); //Cliente dentro de la tienda lo atienden en una caja				
					System.out.println ("El cliente "+this.identificador+" está siendo atendido en la caja 2.");
					gastoCompraCliente = (int) (Math.random()*10);
					recaudacionTotal += gastoCompraCliente;
					atendido = true;
					//Thread.sleep((long)(Math.random()*2000)+100);//  *** Me distorsiona los datos no cumpliendo los semáforos.
				
					caja2.release(); //Cliente dentro de la tienda deja libre una caja
					System.out.println ("El cliente "+this.identificador+" termina en la caja 2.");}
				
				//CAJA 3
				else if(atendido == false) {
					caja3.acquire(); //Cliente dentro de la tienda lo atienden en una caja				
					System.out.println ("El cliente "+this.identificador+" está siendo atendido en la caja 3.");
					gastoCompraCliente = (int) (Math.random()*10);
					recaudacionTotal += gastoCompraCliente;
					atendido = true;
					//Thread.sleep((long)(Math.random()*2000)+100);//  *** Me distorsiona los datos no cumpliendo los semáforos.
				
					caja3.release(); //Cliente dentro de la tienda deja libre una caja
					System.out.println ("El cliente "+this.identificador+" termina en la caja 3.");}
				
				//CAJA 4
				else if(atendido == false) {
					caja4.acquire(); //Cliente dentro de la tienda lo atienden en una caja				
					System.out.println ("El cliente "+this.identificador+" está siendo atendido en la caja 4.");
					gastoCompraCliente = (int) (Math.random()*10);
					recaudacionTotal += gastoCompraCliente;
					atendido = true;
					//Thread.sleep((long)(Math.random()*2000)+100);//  *** Me distorsiona los datos no cumpliendo los semáforos.
				
					caja4.release(); //Cliente dentro de la tienda deja libre una caja			
					System.out.println ("El cliente "+this.identificador+" termina en la caja 4.");}
				
				tienda.release(); //Cliente atendido en una caja sale de la tienda puede entrar otro
				System.out.println ("Cliente "+this.identificador + " abandona la tienda de deportes y su gasto ha sido de "+gastoCompraCliente+" euros.");
				
			} catch (InterruptedException ex) {System.out.println(ex.getMessage());	
		}			
}	
	
public static void main(String []arg) throws InterruptedException {
			//Lanzamos la ejecución de todos los hilos en función de los identificadores de cliente y limitación de semaforos
	for (int i = 1; i <= numCliente ; i++) {
		Clientes cliente = new Clientes(i);
		Thread hilo = new Thread(cliente);
		hilo.start();		
	}
	System.out.println ("La recaudacion total de la tienda has sido: "+recaudacionTotal+" euros");
}

}
