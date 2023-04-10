package poo;

public abstract class CarroDecorado extends Componente {

    private Componente componente;

    public Componente getComponente() {
        return componente;
    }

    public String getDescricao() {
        return componente.descricao;
    }

    public CarroDecorado(Componente componente) {
        this.componente = componente;
    }
}
