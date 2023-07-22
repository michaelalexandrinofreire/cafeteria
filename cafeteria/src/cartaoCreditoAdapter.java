

public class cartaoCreditoAdapter implements pagamento{
	
	private cartaoCreditoInterface cartao;
	
	public cartaoCreditoAdapter(cartaoCreditoInterface cartao) {
		this.cartao = cartao;
	}
	

	@Override
	public void pagar() {
		cartao.passarCartao();
		
	}

	@Override
	public void emitir_notaFiscal() {
		cartao.pagamentoConcluido();
		
	}

}
