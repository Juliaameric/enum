package enu;

public class PricipalPedido {

	public static void main(String[] args) {
		StatusPedido status = StatusPedido.aberto;
		System.out.println(status); //aberto
		
		StatusPedido status1 = StatusPedido.cancelado;
		System.out.println(status1); //cancelado
		
		StatusPedido status2 = StatusPedido.em_andamento;
		System.out.println(status2); //em_andamento
		
		StatusPedido status3 = StatusPedido.entregue;
		System.out.println(status3); //entregue

	}

}
