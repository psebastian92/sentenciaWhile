package sentencia_while;

import java.util.Scanner;

/*
 * EN ESTE EJEMPLO, SE REALIZAR� UN INGRESO DE UNA CONTRASE�A, PERMITIENDO 
 * QUE EL USUARIO INGRESE AL MENOS UNA VEZ ESA CONTRASE�A. 
 * LA CONTRASE�A CORRECTA ES 1992. SE DEBEN PERMITIR TRES INTENTOS HASTA LOGRAR
 * LA CONTRASE�A CORRECTA. SI NO ES LOGRADA, HAY QUE INDICAR QUE SE BLOQUE� EL INTENTO.
 * SI SE INGRESA LA CLAVE CORRECTA, INDICAR QUE LA CONTRASE�A ES CORRECTA. 
 * */

public class doWhile_SegundoEjemplo {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		int contrasena;
		int intentos = 0;

		do {

			System.out.println("Ingresa tu contrasena: ");
			contrasena = datos.nextInt();

			if (contrasena != 1992) {
				Thread.sleep(1000); // Demorar un segundo (1000 mili segundos)

				intentos++; // intentos = intentos + 1, le suma 1

				if (intentos < 3) {
					System.out.println("Volve a intentarlo. ");
				}

			}

		} while (contrasena != 1992 && intentos < 3);

		if (contrasena == 1992) {
			System.out.println("Contrasena correcta.");
		}
		if (contrasena != 1992) {
			System.err.println("Bloqueaste el usuario, salame. ");
		}
	}

}
