

public class Caffe_Latte extends CafeDecoretor {

		public Caffe_Latte(Cafe cafe) {
			super(cafe);
		}
		
		@Override
	    public double informarPreco() { 
	        return super.informarPreco() + 9;
	    }

	    @Override
	    public String informarIngredientes() {
	        return super.informarIngredientes() + ", e Pingados de Leite";
	    }
}
