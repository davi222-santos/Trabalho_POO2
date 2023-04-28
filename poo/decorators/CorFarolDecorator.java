package decorators;

import base.Componente;

public class CorFarolDecorator extends CarroDecorado {
	public String corFarol;

	public CorFarolDecorator(Componente componente, String corFarol) {
		super(componente);
		this.corFarol = corFarol;
		String desc = this.getDescricao() + " + com farol de cor " + corFarol;
		this.getComponente().setDescricao(desc); 
	}

}
