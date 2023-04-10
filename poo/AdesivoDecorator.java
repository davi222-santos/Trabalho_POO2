package poo;

public class AdesivoDecorator extends CarroDecorado {
	public CarroDecorado carro;
	public String nomeAdesivo;

	public AdesivoDecorator(Componente componente, String nomeAdesivo) {
		super(componente);
		this.descricao = this.descricao + nomeAdesivo;
	}

}
