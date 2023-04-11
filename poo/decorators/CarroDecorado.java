package poo.decorators;

import poo.base.Carro;
import poo.base.Componente;

public abstract class CarroDecorado extends Componente {

    private Componente componente;
    
    public CarroDecorado(Componente componente) {
        this.componente = componente;
        if (componente instanceof Carro)
            this.descricao = "Personalização do " + this.componente.getNome() + ": ";
        else
            this.descricao = componente.getDescricao();
    }

    public Componente getComponente() {
        return componente;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void ativarHabilidade(){
        this.componente.ativarHabilidade();
    }

    public String getNome(){
        return this.componente.getNome();
    }
}
