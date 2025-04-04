package sentencia_while;

import java.util.Scanner;

/* ESTRUCTURA DEL WHILE:
while (condiciÃ³n a analizar) {
instrucciones;
}
while significa "mientras"
Se lee asi: "mientras la condicion se cumpla, se haran REPETITIVAMENTE las instrucciones
hasta que deje de cumplirse la condiciÃ³n. ESTE CICLO SE REPITE hasta que no se cumpla la condicion analizada.
*/
public class sentencia_while {
	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
		int contras;

		System.out.println("Escribi la contrasena: ");
		contras = datos.nextInt(); 
		
		
		// LA CONTRASEÑA CORRECTA ES 7
		// MIENTRAS LA CONTRASEÑA ES DISTINTA DE 7, HAY QUE PERMITIR
		// VOLVER A INGRESARLA.
		while (contras != 7) {
			System.out.println("No, le erraste.");
			System.out.println("Volve a intentarlo: ");
			contras = datos.nextInt();
		}

		System.out.println("Contrasena correcta.");

	}
}
