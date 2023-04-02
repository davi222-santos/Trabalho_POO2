package poo;

import poo.habilidade.Habilidade;

public class Carro extends CarroDecorado {
		private Habilidade habilidade;
		


		public void setHabilidade(Habilidade habilidade) {
			this.habilidade = habilidade;
		}


		public Carro(Habilidade habilidade) {
			this.habilidade = habilidade;
			descricao = "Personalização: ";
		}


		public void ativarHabilidade(){
			habilidade.usar();
		}
	
	
}
