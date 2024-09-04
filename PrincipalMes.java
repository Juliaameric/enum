package enu;

public class PrincipalMes {

	public static void main(String[] args) {
//executar o codigo
		for (Mes mes: Mes.values()) {
//for:navegador;inicializar o enum; : indica que os valores venham; values: mostrar os valores do enum
			System.out.println("*");
			System.out.println(mes);
//system chama o que esta na variavel
		}
	}

}
