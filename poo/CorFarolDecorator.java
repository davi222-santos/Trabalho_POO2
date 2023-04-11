package poo;

public class CorFarolDecorator extends CarroDecorado {

	public CarroDecorado carro;
	public String corFarol;

	public CorFarolDecorator(Componente componente, String corFarol) {
		super(componente);
		this.descricao = this.descricao + " + com farol de cor " + corFarol;
	}

}
