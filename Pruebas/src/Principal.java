
public class Principal {

	
	public static void main (String[] args) {
		int primerNumero = 28;
		System.out.println("la variable primerNumero " + primerNumero);
		primerNumero = 33;
		
		int segundoNumero = 25;
		int resultado;

		
		System.out.println("la variable primerNumero ahora vale " + primerNumero);

		resultado = primerNumero + segundoNumero;
		
		System.out.println("El resultado de la suma es: " + resultado);
		
		resultado = primerNumero * segundoNumero;
		
		System.out.println("El resultado de la multiplicación es: " +resultado);
		
		// Calculamos el resto de la división
		
		resultado = primerNumero / segundoNumero;
		
		System.out.println("El resultado de la división es: "+resultado);
		
		
		resultado = primerNumero % segundoNumero;
		System.out.println("El resultado del resto de la división es: " + resultado);
		
		System.out.println("El primer número antes de la operación unaria de incremento vale: "+primerNumero);
		
		++primerNumero;
		
		System.out.println("El primer número DESPUÉS de la operación unaria de incremento vale: "+ primerNumero);

		//La operación anterior es equivalente a hacer esto:
		
		System.out.println("El primer número antes de la operación unaria de incremento vale: "+ primerNumero);
		
		primerNumero = primerNumero +1;
		
		System.out.println("El primer número DESPUÉS de la operación unaria de incremento vale: "+ primerNumero);
		
		System.out.println("============PROBANDO LA SEGUNDA OPERACIÓN UNARIA==================");
		
		System.out.println("El valor de la variable primerNumero antes de la operación unaria es: "+primerNumero);
		
		System.out.println("Voy a ver lo que vale la variable usando la operación unaria: "+ ++primerNumero);


		System.out.println("El valor de la variable primerNumero ahora vale: "+ primerNumero);
		
		System.out.println("El resultado de comparar si PrimerNumero es igual que el segundoNumero es: " + (primerNumero == segundoNumero));
		
		System.out.println(primerNumero > segundoNumero);
		System.out.println(primerNumero < segundoNumero);
		
		//Operadores de asignación
		
		System.out.println("Antes de la asignación el primero número vale: "+ primerNumero);
		System.out.println("Antes de la asignación el primero número vale: "+ segundoNumero);

		primerNumero = segundoNumero;
		
		System.out.println("Ahora el primer Numero vale: " + primerNumero);
		
		//Sumar un valor a otro
		
		segundoNumero = primerNumero + segundoNumero;
		
		segundoNumero += primerNumero;
		
		System.out.println(segundoNumero);
		
		segundoNumero -= primerNumero; // Esto sería equivalente a segundoNumero = segundoNumero - primerNumero
		
		segundoNumero *= primerNumero; // Esto sería equivalente a segundoNumero = segundoNumero * primerNumero
		
		segundoNumero /= primerNumero; // Esto sería equivalente a segundoNumero = segundoNumero / primerNumero
		
		
		
	}
}
