package sentencia_while;

import java.util.Scanner;

/* ESTRUCTURA DEL WHILE:
while (condición a analizar) {
instrucciones;
}
while significa "mientras"
Se lee asi: "mientras la condicion se cumpla, se haran REPETITIVAMENTE las instrucciones
hasta que deje de cumplirse la condición. ESTE CICLO SE REPITE hasta que no se cumpla la condicion analizada.
*/
public class sentencia_while {
	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
		int contras;

		System.out.println("Escribi la contrasena: ");
		contras = datos.nextInt();
		
		while (contras != 7) {
			System.out.println("No, le erraste.");
			System.out.println("Volve a intentarlo: ");
			contras = datos.nextInt();
		}

		System.out.println("Contrasena correcta.");

	}
}
