package segundo_ejercicio;

import java.util.Scanner;

public class Prueba3 {

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		System.out.print("Ingrese texto: ");
		String msg=leer.nextLine();
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
		
		leer.close();

	}

}
