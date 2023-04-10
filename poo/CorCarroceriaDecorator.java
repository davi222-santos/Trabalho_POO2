package poo;

public class CorCarroceriaDecorator extends CarroDecorado {

	public CarroDecorado carro;
	public String cor;

	public CorCarroceriaDecorator(Componente componente, String cor) {
		super(componente);
		this.descricao = this.descricao + cor;
	}

}
