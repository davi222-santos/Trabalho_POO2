package base;

import java.util.HashMap;
import java.util.Map;

import habilidade.AProvaDeFogo;
import habilidade.Habilidade;
import habilidade.Jump;
import habilidade.NenhumaHabilidade;
import habilidade.SuperNitro;

public class Carro extends Componente {

	// Map<Estado, Class<?>> referencias = new HashMap<Estado, Class<?>>() {
	// 	{
	// 		put(Estado.AreiaMovedica, SuperNitro.class);
	// 		put(Estado.Erupcao_Vulcanica, AProvaDeFogo.class);
	// 		put(Estado.Precipicio, Jump.class);
	// 	}
	// };

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

	// public void atualizar(Estado estado) {

	// 	if (this.habilidade.getClass() == this.referencias.get(estado)) {
	// 		System.out.println("Habilidade de " + this.nomeCarro + " foi ativada:");
	// 		this.ativarHabilidade();

	// 	} else {
	// 		System.out.println("O " + this.nomeCarro + " foi destruido, porque estava apenas com a habilidade de " + this.habilidade);
	// 		setDestruido(true);
	// 	}
	// };
}
