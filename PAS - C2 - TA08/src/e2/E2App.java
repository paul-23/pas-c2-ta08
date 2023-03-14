package e2;

import java.util.Scanner;

public class E2App {

	public static void main(String[] args) {
		Password passw = new Password();
		Scanner sc = new Scanner(System.in);
		int longitud = 0;
		System.out.print("Introduce la longitud de la contraseña: ");
		longitud = sc.nextInt();
		String password = passw.generarPassword(longitud);
		System.out.println("Contraseña generada: " + password);
	}

}
