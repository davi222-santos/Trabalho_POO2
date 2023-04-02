package poo2;

public class CorFarolDecorator extends CarroDecorado {
	
	public CarroDecorado carro;
	public String cor;
	
	
	public CorFarolDecorator(CarroDecorado carro, String cor) {
		
		this.carro = carro;
		this.cor = cor;
		descricao = carro.getDescricao() + ", a cor do farol " + cor;
		
	}
	
	public String getDescricao() {
        return descricao;
    }
}
