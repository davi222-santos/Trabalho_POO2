package poo2;

	public class CorCarroceriaDecorator extends CarroDecorado {
		
		public CarroDecorado carro;
		public String cor;
		
		public CorCarroceriaDecorator(CarroDecorado carro, String cor) {
			
			this.carro = carro;
			this.cor = cor;
			descricao = carro.getDescricao() + "Cor " + cor;
			
		}
		
		public String getDescricao() {
	        return descricao;
	    }
	}
	


