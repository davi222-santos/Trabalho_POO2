package decorators;

import base.Componente;

public class CorCarroceriaDecorator extends CarroDecorado {

	public String cor;

	public CorCarroceriaDecorator(Componente componente, String cor) {
		super(componente);
		this.cor = cor;
		String desc = this.getDescricao() + " + com carroceria na cor " + cor;
		this.getComponente().setDescricao(desc); 

	}

}
