package curso.bradesco;

public class ContaTeste {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.cliente = "Daniel";
		conta.saldo = 4_000.00;
		conta.exibeSaldo();
		
//		conta.saque(2000);
//		conta.exibeSaldo();
//		
//		conta.deposita(8000);
//		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Carlos";
		destino.saldo = 5_000.00;
		destino.exibeSaldo();
		
		
		conta.transferenciaValor(destino, 1000);
		conta.exibeSaldo();
		destino.exibeSaldo();
	}

}
