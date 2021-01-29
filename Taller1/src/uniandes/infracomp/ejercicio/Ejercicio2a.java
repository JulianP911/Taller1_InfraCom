package uniandes.infracomp.ejercicio;

import java.util.Scanner;

public class Ejercicio2a implements Runnable
{
	private int dormirThread;
	private int limiteSuperior;
	private int operacion;
	
	public Ejercicio2a (int pOperacion, int pDormirThread, int pLimiteSuperior)
	{
		this.operacion = pOperacion;
		this.dormirThread = pDormirThread;
		this.limiteSuperior = pLimiteSuperior;
	}

	@Override
	public void run() 
	{
		try 
		{
			if(operacion == 1)
			{
				for(int i = 1; i <= limiteSuperior; i++)
				{
					if( i % 2 == 0)
					{
						System.out.println("El numero " + i + " es par.");
						Thread.sleep(dormirThread);
					}
				}
			}
			else if(operacion == 2)
			{
				for(int i = 1; i <= limiteSuperior; i++)
				{
					if( i % 2 == 1)
					{
						System.out.println("El numero " + i + " es impar.");
						Thread.sleep(dormirThread);
					}
				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Programa iniciado - Manejo de Threads\n");
		System.out.println("Ingrese el limite superior para hallar los numeros pares y impares:");
		int limiteSuperiorE = reader.nextInt();
		System.out.println("Ingrese el tiempo de dormir el Thread:");
		int dormirThreadE = reader.nextInt();
		System.out.println("La ejecución del programa es la siguiente:");
		reader.close();
		
		Thread thread1 = new Thread(new Ejercicio2a(1, dormirThreadE, limiteSuperiorE));
		Thread thread2 = new Thread(new Ejercicio2a(2, dormirThreadE, limiteSuperiorE));
		
		thread1.start();
		thread2.start();
	}
}
