package sentencia_while;

import java.util.Scanner;

/*
 * EN ESTE EJEMPLO, SE REALIZARÁ UN INGRESO DE UNA CONTRASEÑA, PERMITIENDO 
 * QUE EL USUARIO INGRESE AL MENOS UNA VEZ ESA CONTRASEÑA. 
 * LA CONTRASEÑA CORRECTA ES 1992. SE DEBEN PERMITIR TRES INTENTOS HASTA LOGRAR
 * LA CONTRASEÑA CORRECTA. SI NO ES LOGRADA, HAY QUE INDICAR QUE SE BLOQUEÓ EL INTENTO.
 * SI SE INGRESA LA CLAVE CORRECTA, INDICAR QUE LA CONTRASEÑA ES CORRECTA. 
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
