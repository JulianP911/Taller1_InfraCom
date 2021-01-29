package uniandes.infracomp.threads;

/**
 * Creación de threads como implementacion de la interface Runnable
 * @author Julian Padilla Molina
 */
public class EjThreads02 implements Runnable
{
	public void run()
	{
		System.out.println("Implementando la interfaz Runnable.");
	}

	public static void main(String[] args) 
	{
		Thread t = new Thread(new EjThreads02());
		t.start();
	}
}
