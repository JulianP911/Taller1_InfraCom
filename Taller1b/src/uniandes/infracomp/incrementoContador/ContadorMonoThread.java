package uniandes.infracomp.incrementoContador;

/**
 * Aplicación monothread para el incremento de un contador
 * @author Julian Padilla
 */
public class ContadorMonoThread 
{
	/**
	 * Contador
	 */
	private int contador = 0;
	
	/**
	 * Incrementar contador 1000 veces
	 */
	public void incrementar() 
	{
		for (int i = 0; i < 10000; i++) 
		{
			contador++;
		}
	}
	
	/**
	 * Dar Contador
	 * @return contador
	 */
	public int getContador()
	{
		return contador;
	}
	
	/**
	 * Metodo principal de la clase
	 * @param args - Parametros
	 */
	public static void main(String[] args) 
	{
		ContadorMonoThread c = new ContadorMonoThread();
		
		for (int i = 0; i < 1000; i++) 
		{
			c.incrementar();
		}

		System.out.println(c.getContador());
	}

}
