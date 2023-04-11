package poo;

import poo.habilidade.Habilidade;
import poo.habilidade.NenhumaHabilidade;

public class Carro extends Componente {
	private Habilidade habilidade;

	public Carro(String nomeCarro){
		this.nomeCarro = nomeCarro;
		this.habilidade = new NenhumaHabilidade();
		this.descricao = "Carro sem personalização";
	}

	public Carro(Habilidade habilidade, String nomeCarro) {
		this.nomeCarro = nomeCarro;
		this.habilidade = habilidade;
	}

	@Override
	public void ativarHabilidade() {
		habilidade.usar();
	}

}
