package e2;

import java.util.Random;

public class Password {
	
	private final static int LONGDEFECTO = 8;
	private static final String[] CARACTERES = new String[] { "abcdefghijklmnopqrstuvwxyz",
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789", "!@#$%&*()_+-=[]|,./?><" };
	
	private int longitud;
	private String contraseña;

	public Password() {
		this.longitud = LONGDEFECTO;
		this.contraseña = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword(longitud);
	}

	

	public String generarPassword(int longitud) {
		String password = "";
		Random random = new Random();

		for (int i = 0; i < longitud; i++) {
			String caracteres = CARACTERES[random.nextInt(CARACTERES.length)];
			int posicion = random.nextInt(caracteres.length());
			password = password + (caracteres.charAt(posicion));
		}

		return new String(password);
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}
