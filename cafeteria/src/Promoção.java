

import java.util.ArrayList;
import java.util.List;

public class Promoção implements ICafeteria {
	
	private List<ICliente> clientes = new ArrayList();
	private Combo e;

	@Override
	public void registrarCliente(ICliente a) {
		clientes.add(a);
		

	}

	@Override
	public void notificarCliente() {
		
		for(ICliente a: clientes)
			a.update(e);

	}

	public void setCombo(Combo e) {
		this.e = e; 
	}
}
