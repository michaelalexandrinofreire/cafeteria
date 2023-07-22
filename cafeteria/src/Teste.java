

public class Teste {

	public static void main(String[] args) {
		
		Promoção r = new Promoção();
		
		Pessoa p1 = new Pessoa("BEYONCE!", r);
		Pessoa p2 = new Pessoa("ANA BEATRIZ!", r);
		Pessoa p3 = new Pessoa("NEYMAR!", r);
		
		Combo e1 = new Combo();
		e1.setNome("Promoção do dia");
		e1.setValorPromocional(15);
		e1.setPromoção("Café, Uisque Irlandes e camada de creme, ");

		
		r.setCombo(e1);
		
		r.notificarCliente();
		
	}

}
