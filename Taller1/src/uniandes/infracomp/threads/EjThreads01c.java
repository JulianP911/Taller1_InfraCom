package uniandes.infracomp.threads;

/**
 * Creación de threads con nombre – como extensión de la clase Thread
 * @author Julian Padilla Molina
 */
public class EjThreads01c extends Thread
{
	private final static int MAX = 3;
	private String name;
	
	public EjThreads01c(String name) 
	{
		System.out.println("Extendiendo la clase Thread.");
		this.name = name;
	}
	
	public void run()
	{
		System.out.println("El nombre es: " + name);
	}
	
	public static void main(String[] args) 
	{
		EjThreads01c[] t =new EjThreads01c[MAX];
		
		for (int i = 0; i < t.length; i++)
		{
			t[i] = new EjThreads01c("Thread"+i);
		}
		
		for (int i = 0; i < t.length; i++)
		{
			t[i].start();
		}
	}

}
