

	public class Main {
		public static void imprimirInfo(Cafe c) {
			System.out.println("Preço: " + c.informarPreco() + ", Ingredientes: " + c.informarIngredientes());
		}
		
		public static void main(String[] args) {
			Cafe c = new CafePuro();
			imprimirInfo(c);
			
			c = new Capuccino(c);
			imprimirInfo(c);
			
			c = new CafePuro();
			c = new Iris_Coffe(c);
			imprimirInfo(c);
			
			c = new CafePuro();
			c = new Caffe_Latte(c);
			imprimirInfo(c);
			
			c = new CafePuro();
			c = new Cafe_Macchiato(c);
			imprimirInfo(c);
			
			c = new CafePuro();
			c = new Cafe_Mocha(c);
			imprimirInfo(c);
		}

	}
