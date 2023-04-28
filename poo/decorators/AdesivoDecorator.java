package decorators;

import base.Componente;

public class AdesivoDecorator extends CarroDecorado {

	public String nomeAdesivo;

	public AdesivoDecorator(Componente componente, String nomeAdesivo) {
		super(componente);
		this.nomeAdesivo = nomeAdesivo;
		String desc = this.getDescricao() + " - adesivo de cor " + nomeAdesivo;
		this.getComponente().setDescricao(desc); 

	}

}
