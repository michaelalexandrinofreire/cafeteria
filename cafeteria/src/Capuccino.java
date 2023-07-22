

	public class Capuccino extends CafeDecoretor {

		public Capuccino(Cafe cafe) {
			super(cafe);
		}
		
		@Override
	    public double informarPreco() { 
	        return super.informarPreco() + 10;
	    }

	    @Override
	    public String informarIngredientes() {
	        return super.informarIngredientes() + ", Leite Vaporizado";
	    }
	}

