

	public class Iris_Coffe extends CafeDecoretor {
		public Iris_Coffe(Cafe cafe) {
			super(cafe);
		}
		
		@Override
	    public double informarPreco() { 
	        return super.informarPreco() + 11.0;
	    }

	    @Override
	    public String informarIngredientes() {
	        return super.informarIngredientes() + ", Uisque Irlandês" + ", e Camada de Creme";
	    }
	}
