package decorators;

import base.Carro;
import base.Componente;
import base.Estado;
import habilidade.Habilidade;

public abstract class CarroDecorado extends Componente {

    private Componente componente;

    public CarroDecorado(Componente componente) {
        this.componente = componente;
        if (componente instanceof Carro) {
            String descricao = "Personalização do " + this.componente.getNome() + ": ";
            this.componente.setDescricao(descricao);
        } else {
            this.componente.setDescricao(this.componente.getDescricao());
        }
    }

    public Componente getComponente() {
        return componente;
    }

    public Boolean getDestruido() {
        return this.componente.getDestruido();
    }

    public void setDestruido(Boolean destruido) {
        this.componente.setDestruido(destruido);
    }

    public Habilidade getHabilidade() {
        return this.componente.getHabilidade();
    }

    public void setHabilidade(Habilidade newHabilidade) {
        this.componente.setHabilidade(newHabilidade);
    }

    public void ativarHabilidade() {
        this.componente.ativarHabilidade();
    }

    public String getDescricao() {
        return this.componente.getDescricao();
    }

    public void setDescricao(String desc) {
        this.componente.setDescricao(desc);
    }

    public String getNome() {
        return this.componente.getNome();
    }

    @Override
    public void atualizar(Estado estado) {
        this.componente.atualizar(estado);
    }

}
