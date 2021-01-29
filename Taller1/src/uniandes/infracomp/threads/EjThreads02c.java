package uniandes.infracomp.threads;

/**
 * Creación de threads con nombre usando ciclos - como implementación de la interface Runnable
 * @author Julian Padilla Molina
 */
public class EjThreads02c implements Runnable
{
	private final static int MAX =3;
	private String name;
	
	public EjThreads02c(String name) 
	{
		System.out.println("Implementado la interfaz Runnable.");
		this.name = name;
	}
	
	public void run()
	{
		System.out.println("El nombre es: " + name);
	}

	public static void main(String[] args) 
	{
        Thread[] t =new Thread[MAX];
		
		for (int i = 0; i < t.length; i++)
		{
			t[i] = new Thread(new EjThreads02c("Thread"+i));
		}
		
		for (int i = 0; i < t.length; i++)
		{
			t[i].start();
		}
	}
}
