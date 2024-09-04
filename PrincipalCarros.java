package enu;

public class PrincipalCarros {

	public static void main(String[] args) {
		for (Carros carro: Carros.values()) {
			System.out.println("-");
			System.out.println(carro);
		}
	}

}
