package e3;

public class E3App {

	public static void main(String[] args) {
		Electrodomestico elec = new Electrodomestico();
		elec.comprobarColor("verde");
		String color = elec.getColor();
		System.out.println(color);
	}

}
