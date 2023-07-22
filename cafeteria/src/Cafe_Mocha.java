public class Cafe_Mocha extends CafeDecoretor{

		public Cafe_Mocha(Cafe cafe) {
			super(cafe);
		}
		
		@Override
	    public double informarPreco() { 
	        return super.informarPreco() + 12;
	    }

	    @Override
	    public String informarIngredientes() {
	        return super.informarIngredientes() + ", Café Espresso" + ", Leite Vaporizado" + ", Espuma de Leite" + ", e Calda de Chocolate ";
	    }
}
