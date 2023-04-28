package base;

import habilidade.*;
import observers.Observador;

public abstract class Componente implements Observador {
    protected String descricao;
    protected Habilidade habilidade;
    protected String nomeCarro;
    protected Boolean destruido = false;

    public abstract void ativarHabilidade();

    public abstract void atualizar(Estado estado);

    public Boolean getDestruido() {
        return this.destruido;
    }

    public void setDestruido(Boolean destruido) {
        this.destruido = destruido;
    }

    public Habilidade getHabilidade() {
        return this.habilidade;
    }

    public abstract void setHabilidade(Habilidade newHabilidade);

    public String getNome() {
        return this.nomeCarro;
    }

    public String getDescricao() {
        return  this.descricao;
    }

    public abstract void setDescricao(String desc);
}
