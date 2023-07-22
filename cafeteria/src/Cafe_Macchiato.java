public class Cafe_Macchiato extends CafeDecoretor {

		public Cafe_Macchiato(Cafe cafe) {
			super(cafe);
		}
		
		@Override
	    public double informarPreco() { 
	        return super.informarPreco() + 15;
	    }

	    @Override
	    public String informarIngredientes() {
	        return super.informarIngredientes() + ", Manchas De Leite coração" + ", Cremosidade espumada" + ", e Açucar da Bebida";
	    }
}
