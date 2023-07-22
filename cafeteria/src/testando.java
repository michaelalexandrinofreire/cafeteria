

public class testando {

	public static void main(String[] args) {
		
		receberPagamento(new cartaoCreditoAdapter( new cartaoCredito() ));
		receberPagamento(new pixAdapter( new pix() ));
	}
	
	public static void receberPagamento(pagamento pagando) {
		pagando.pagar();
		pagando.emitir_notaFiscal();
	}

}
