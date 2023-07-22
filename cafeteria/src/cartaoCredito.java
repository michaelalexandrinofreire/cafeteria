

public class cartaoCredito implements cartaoCreditoInterface{

	@Override
	public void passarCartao() {
		System.out.println("passando cartão na maquininha");
		
	}

	@Override
	public void pagamentoConcluido() {
		System.out.println("pagamento finalizado");
		
	}
	
}
