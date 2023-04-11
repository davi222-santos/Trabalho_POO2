package poo;
import poo.habilidade.*;

public abstract class Componente {
    protected String descricao;
    protected Habilidade habilidade;
    protected String nomeCarro;

    public void setHabilidade(Habilidade newHabilidade){
        this.habilidade = newHabilidade;
    }

    public Habilidade getHabilidade(){
        return this.habilidade;
    }

    public String getNome() {
		return this.nomeCarro;
	}

    public String getDescricao() {
        return this.getNome() + this.descricao;
    }

    public abstract void ativarHabilidade();

}
