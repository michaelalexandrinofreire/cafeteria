
	public abstract class CafeDecoretor implements Cafe{
	private final Cafe cafeDecorador;
	
	public CafeDecoretor(Cafe cafe) {
		this.cafeDecorador = cafe;
	}
	
	@Override
    public double informarPreco() { 
        return cafeDecorador.informarPreco();
    }

    @Override
    public String informarIngredientes() {
        return cafeDecorador.informarIngredientes();
    }

	public Cafe getCafe() {
		return cafeDecorador;
	}
}
