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
			
			System.out.println("Vamos a realizar una operaci�n matem�tica.");
			
			//Pedimos los n�meros y el tipo de operaci�n al usuario
			
			//Pedimos el primer n�mero
			System.out.println("Introduzca el primer n�mero: ");
			numero1 = teclado.nextFloat();
			teclado.nextLine();
			
			//Pedimos la operacion1
			System.out.println("Introduzca el operador: (+,-,*,/)");
			operacion1 = teclado.nextLine();
	
			do
			{
				//Realizamos la petici�n de operadores y n�meros hasta que el usuario
				//inserte por teclado el s�mbolo '='.
				
				//Pedimos otro n�mero
				System.out.println("Introduzca otro n�mero: ");
				numero2 = teclado.nextFloat();
				teclado.nextLine();

				//Pedimos la operacion2
				System.out.println("Introduce la siguiente operaci�n: (+,-,*,/), Introduzca '=' para mostrar el resultado.");
				operacion2 = teclado.nextLine();
			
					//Realizamos la operaci�n dependiendo del operacion1 que elijamos
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
							if (operacion1.equals("*")) //Cuando el operacion1 es una multiplicaci�n
							{
								resultado = numero1*numero2;
								//System.out.println("El resultado de la multiplicaci�n es: " + resultado);
							}
							else
							{
								if (operacion1.equals("/")) //Cuando el operacion1 es una divisi�n
								{
									//Realizamos la validaci�n del divisor que sea distinto a cero.
									if(numero2!=0) //comprobamos que el numero2 sea distinto a 0
									{
										resultado = numero1/numero2;
										//System.out.println("El resultado de la divisi�n es: " + resultado);
										//System.out.println("El m�dulo es: " + numero1%numero2);
										//El m�dulo  muestra el resto de la divisi�n
									}
									else
									{
										System.out.println("Error: no se puede dividir por 0");
										System.out.println("Error: no se puede dividir por " + numero2 + ", so burro");
									}
								}
								else
								{
									System.out.println("El operador que has introducido no es v�lido");
								}
							}
						}
					}
	
				//Reasignamos las variables para seguir operando con el siguiente operador
				numero1=resultado;
				operacion1=operacion2;
		
			}while (!operacion2.equals("="));
			
			//Mostramos por pantalla el resultado de la operaci�n
			System.out.println("El resultado de la operaci�n es: " + resultado);
			
			do
			{
				//Preguntamos al usuario si desea introducir mas c�lculos y en caso afirmativo volvemos a empezar. 
				System.out.println("\n\n�Desea realizar otra operaci�n? (S/N)");
				tecla=teclado.nextLine();
				if(tecla.equals("n") || tecla.equals("N"))
				{
					continuar=false;
				}
				else
				{
					if(!(tecla.equals("s") || tecla.equals("S")))
					{
						System.out.println("Lo siento, has introducido algo no v�lido, vuelva a intentarlo: ");
					}
				}
			}while(!(tecla.equals("n") || tecla.equals("N") || tecla.equals("s") || tecla.equals("S")));
		}while(continuar);
		
		//Cerramos el programa.
		System.out.println("FIN DE CALCULADORA");
	}
}
