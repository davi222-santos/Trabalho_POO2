package poo;

public class AdesivoDecorator extends CarroDecorado{
	public CarroDecorado carro;
	public String nomeAdesivo;
	
	public AdesivoDecorator(CarroDecorado carro, String nomeAdesivo) {
		this.carro = carro;
		this.nomeAdesivo = nomeAdesivo;
		descricao = carro.getDescricao() + ", e um adesivo de " + nomeAdesivo;
	}
	
	public String getDescricao() {
        return descricao;
    }
}
