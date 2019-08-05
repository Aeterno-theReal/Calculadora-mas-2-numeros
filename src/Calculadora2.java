import java.util.Scanner;

public class Calculadora2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hacemos la prueba de entrada por teclado
		
		//Declaramos la variable para la entrada por teclado
		Scanner teclado= new Scanner(System.in);
		
		float numero1 = -1;
		float numero2 = -1;
		float resultado = -1;
		String operacion1 = "";
		String operacion2 = "";
		boolean continuar = true;
		String tecla = "";
		
		
		do
		{
			//Comenzamos el programa

			System.out.println("Programa \"Calculadora\"");
			
			System.out.println("Vamos a realizar una operación matemática.");
			
			//Pedimos los números y el tipo de operación al usuario
			
			//Pedimos el primer número
			System.out.println("Introduzca el primer número: ");
			numero1 = teclado.nextFloat();
			teclado.nextLine();
			
			//Pedimos la operacion1
			System.out.println("Introduzca el operador: (+,-,*,/)");
			operacion1 = teclado.nextLine();
	
			do
			{
				//Realizamos la petición de operadores y números hasta que el usuario
				//inserte por teclado el símbolo '='.
				
				//Pedimos otro número
				System.out.println("Introduzca otro número: ");
				numero2 = teclado.nextFloat();
				teclado.nextLine();

				//Pedimos la operacion2
				System.out.println("Introduce la siguiente operación: (+,-,*,/), Introduzca '=' para mostrar el resultado.");
				operacion2 = teclado.nextLine();
			
					//Realizamos la operación dependiendo del operacion1 que elijamos
					if(operacion1.equals("+")) //Cuando el operacion1 es una suma
					{
						resultado = numero1+numero2;
						//System.out.println("El resultado de la suma es: " + resultado);
					}
					else 
					{
						if (operacion1.equals("-")) //Cuando el operacion1 es una resta
						{
							resultado = numero1-numero2;
							//System.out.println("El resultado de la resta es: " + resultado);
						}
						else
						{
							if (operacion1.equals("*")) //Cuando el operacion1 es una multiplicación
							{
								resultado = numero1*numero2;
								//System.out.println("El resultado de la multiplicación es: " + resultado);
							}
							else
							{
								if (operacion1.equals("/")) //Cuando el operacion1 es una división
								{
									//Realizamos la validación del divisor que sea distinto a cero.
									if(numero2!=0) //comprobamos que el numero2 sea distinto a 0
									{
										resultado = numero1/numero2;
										//System.out.println("El resultado de la división es: " + resultado);
										//System.out.println("El módulo es: " + numero1%numero2);
										//El módulo  muestra el resto de la división
									}
									else
									{
										System.out.println("Error: no se puede dividir por 0");
										System.out.println("Error: no se puede dividir por " + numero2 + ", so burro");
									}
								}
								else
								{
									System.out.println("El operador que has introducido no es válido");
								}
							}
						}
					}
	
				//Reasignamos las variables para seguir operando con el siguiente operador
				numero1=resultado;
				operacion1=operacion2;
		
			}while (!operacion2.equals("="));
			
			//Mostramos por pantalla el resultado de la operación
			System.out.println("El resultado de la operación es: " + resultado);
			
			do
			{
				//Preguntamos al usuario si desea introducir mas cálculos y en caso afirmativo volvemos a empezar. 
				System.out.println("\n\n¿Desea realizar otra operación? (S/N)");
				tecla=teclado.nextLine();
				if(tecla.equals("n") || tecla.equals("N"))
				{
					continuar=false;
				}
				else
				{
					if(!(tecla.equals("s") || tecla.equals("S")))
					{
						System.out.println("Lo siento, has introducido algo no válido, vuelva a intentarlo: ");
					}
				}
			}while(!(tecla.equals("n") || tecla.equals("N") || tecla.equals("s") || tecla.equals("S")));
		}while(continuar);
		
		//Cerramos el programa.
		System.out.println("FIN DE CALCULADORA");
	}
}
