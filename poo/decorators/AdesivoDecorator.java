package decorators;

import base.Componente;


public class AdesivoDecorator extends CarroDecorado {
	
	public String nomeAdesivo;

	public AdesivoDecorator(Componente componente, String nomeAdesivo) {
		super(componente);
		this.nomeAdesivo = nomeAdesivo;
		this.descricao = this.descricao + " + adesivo de cor " + nomeAdesivo;
	
	}

	

}
