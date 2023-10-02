
public class Principal {
	
	public static void main (String[] args) {
		//declaramos la variable edad
		
		int edad;
		
		//declaramos la variable edad de jubilación
		
		int edadJubilacion;
		
		//declaramos la variable que almacenará los años que restan para jubilarse
		
		int annosParaJubilarse;
		
		//inicializamos a mano las variables
		
		edad = 35;
		edadJubilacion = 67;
		
		annosParaJubilarse = edadJubilacion - edad;
		
		System.out.println("Los años que le quedan para jubilarse son: " + annosParaJubilarse);
		
		System.out.println("Los años que le quedan para jubilarse son: " + (edadJubilacion - edad));
	}

}
