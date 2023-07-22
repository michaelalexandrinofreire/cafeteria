

public class pixAdapter implements pagamento{
	
	private pixInterface pix1;
	
	public pixAdapter(pixInterface pix1) {
		this.pix1 = pix1;
	}

	@Override
	public void pagar() {
		pix1.usarChavePix();
		
	}

	@Override
	public void emitir_notaFiscal() {
		pix1.pagamentoConcluido();
		
	}

}
