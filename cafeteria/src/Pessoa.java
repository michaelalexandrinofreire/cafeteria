

public class Pessoa implements ICliente {
	
	private String nome;
	
	public Pessoa(String nome, ICafeteria r) {
		this.nome = nome;
		r.registrarCliente(this);
		
	}

	@Override
	public void update(Combo e) {
		System.out.println(nome+ " Confira a nossa promoção especial do cliente de hoje para você: "+e.getPromoção()+ " você só precisa nos pagar apenas "+e.getValorPromocional()+ "Reais");
		

	}

}
