package sentencia_while;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		int contrasena ;
		int intentos = 0;
			
		do  {
		
			System.out.println("Ingresa tu contrasena: ");
			contrasena = datos.nextInt(); 
			
			if (contrasena!=1992) {
				Thread.sleep(1000);
		
				intentos++;  // intentos = intentos + 1;
				
				if (intentos <3) {
					System.out.println("Volve a intentarlo. ");
				}
				
			}
			
				 
		} while(contrasena != 1992 && intentos<3);
		
		if (contrasena==1992){
		System.out.println("Contrasena correcta.");
		}
		if (contrasena!=1992){
			System.out.println("Bloqueaste el usuario, salame. ");
		}
	}

}
