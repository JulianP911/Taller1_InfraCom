package uniandes.infracomp.incrementoContador;

/**
 * Aplicacion multithread para incremento de un contador
 * @author Julian Padilla
 */
public class ContadorThreads extends Thread
{
	/**
	 * Variable de la clase. Todos los objetos de esta clase ven esta variable.
	 */
	private static int contador = 0;
	
	/**
	 * Este metodo se ejecuta al llamar el metodo start()
	 */
	public void run() 
	{
		for (int i = 0; i < 10000; i++) 
		{
			contador++;
		}
	}

	/**
	 * Metod principal de la clase
	 * @param args - Parametros
	 */
	public static void main(String[] args) 
	{
		// Se crea un array mil de threads
		ContadorThreads[] t = new ContadorThreads[1000];
		
		// Se crean e inician los mil threads del array
		for (int i = 0; i < t.length; i++) 
		{
			t[i] = new ContadorThreads();
			t[i].start();
		}
		
		System.out.println(contador);
	}

}
