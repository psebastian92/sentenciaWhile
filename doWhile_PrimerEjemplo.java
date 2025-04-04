package sentencia_while;

import java.util.Scanner;

/*
 * UN EJEMPLO SIMPLE PARA INGRESAR UN NOMBRE, Y PERMITIRLE AL USUARIO
 * MODIFICARLO. SI ASÍ LO DESEA, DEBEN REPETIRSE LAS LÍNEAS 22 A 32.
 * */

public class doWhile_PrimerEjemplo {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		char opcion;
		String nombre;

		do {

			// COMO DESEAMOS QUE ESTAS INSTRUCCIONES SE REALICEN AL MENOS
			// UNA VEZ, USAMOS 'DO', QUE SIEMPRE EJECUTA EL CÓDIGO QUE TIENE 
			// ENTRE LLAVES AL MENOS UNA VEZ.
			
			System.out.println("Bienvenido!");
			System.out.println("Ingrese su nombre");
			nombre = datos.next();

			System.out.println("Su nombre es: " + nombre);

			System.out.println("Desea modificarlo?");
			System.out.println("Ingrese 'S' para confirmar");
			System.out.println("Ingrese 'N' para salir");

			opcion = datos.next().charAt(0);

			// SI ALGUNA DE ESTAS CONDICIONES SE CUMPLE, SE REPITE TODO EL 'DO'
		} while (opcion == 'S' || opcion == 's'); 
		System.out.println("Programa finalizado");

	}
}
