package poo;

import poo.habilidade.Habilidade;

public class Carro extends Componente {
	private Habilidade habilidade;
	private String nomeCarro;

	public void setHabilidade(Habilidade habilidade) {
		this.habilidade = habilidade;
	}

	public Carro(Habilidade habilidade, String nomeCarro) {
		this.habilidade = habilidade;
		this.nomeCarro = nomeCarro;
		descricao = "Personalização: ";
	}

	public void ativarHabilidade() {
		habilidade.usar();
	}

}
