

public class pagamentoDinheiro implements pagamento{

	@Override
	public void pagar() {
		System.out.println("Recebendo dinheiro");
		
	}

	@Override
	public void emitir_notaFiscal() {
		System.out.println("Emitindo nota fiscal");
		
	}

}
