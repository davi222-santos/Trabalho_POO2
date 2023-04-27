package base;
import java.util.HashMap;
import java.util.Map;

import habilidade.*;
import observers.Observador;

public abstract class Componente implements Observador {
    protected String descricao;
    protected Habilidade habilidade;
    protected String nomeCarro;
    protected Boolean destruido =  false;

    Map<Estado, Class<?>> referencias = new HashMap<Estado, Class<?>>() {
		{
			put(Estado.AreiaMovedica, SuperNitro.class);
			put(Estado.Erupcao_Vulcanica, AProvaDeFogo.class);
			put(Estado.Precipicio, Jump.class);
		}
	};
    
    public Boolean getDestruido() {
        return destruido;
    }

    public void setDestruido(Boolean destruido) {
        this.destruido = destruido;
    }

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
    
    @Override
	public void atualizar(Estado estado) {

	if(estado != Estado.Normal){
        if (this.habilidade.getClass() == this.referencias.get(estado)) {
			System.out.println("Habilidade de " + this.nomeCarro + " foi ativada:");
			this.ativarHabilidade();

		} else {
			System.out.println("O " + this.nomeCarro + " foi destruido, porque estava apenas com a habilidade de " + this.habilidade);
			setDestruido(true);
		}
    }
    else{
        System.out.println("Apenas mais uma corrida normal");
    }
	};
}
