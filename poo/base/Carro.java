package poo.base;

import poo.habilidade.Habilidade;
import poo.habilidade.NenhumaHabilidade;
// import poo.observers.Observador;


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

	public void atualizar(Estado newEstado) {
        this.pistaAtual.setEstado(newEstado);
	};
}
