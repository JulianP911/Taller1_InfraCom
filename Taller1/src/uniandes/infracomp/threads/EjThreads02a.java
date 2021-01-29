package uniandes.infracomp.threads;

/**
 * Creación de threads con un valor inicial - como implementación de la interface Runnable
 * @author Julian Padilla Molina
 */
public class EjThreads02a implements Runnable
{
	private int n;
	
	public EjThreads02a(int n) 
	{
		System.out.println("Implementado la interfaz Runnable.");
		this.n = n;
	}
	
	public void run()
	{
		System.out.println("El valor inicial es: " + n);
	}

	public static void main(String[] args) 
	{
		Thread t = new Thread(new EjThreads02a(5));
		t.start();
	}
}
