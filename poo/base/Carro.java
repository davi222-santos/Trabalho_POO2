package poo.base;

import java.util.Map;
import poo.habilidade.*;

public class Carro extends Componente {

	Map<Estado, Object> referencias = Map.of(Estado.AreiaMovedica, SuperNitro.class,
			Estado.Erupcao_Vulcanica, AProvaDeFogo.class,
			Estado.Precipicio, Jump.class);

	public Carro(String nomeCarro) {
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
		this.habilidade.usar();
	}

	public void atualizar(Estado estado) {
		if(this.habilidade.getClass() == this.referencias.get(estado)){
			System.out.println("Habilidade de " + this.nomeCarro + " foi ativada:");
			this.ativarHabilidade();
			// System.out.println("log1: " + this.referencias.get(estado));
			// System.out.println("log2: " + this.habilidade.getClass());
			// System.out.println("log3: " + estado);
		} else {
			// DESTRÓI
		}
	};
}
