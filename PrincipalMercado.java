package enu;

public class PrincipalMercado {

	public static void main(String[] args) {
		for (Mercado mercado: Mercado.values()) {
			System.out.println("-");
			System.out.println(mercado);
		}
	}

}
