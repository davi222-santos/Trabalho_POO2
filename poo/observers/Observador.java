package poo.observers;
import poo.base.Estado;
import poo.base.Pista;

public interface Observador {
    public Pista pistaAtual = new Pista();
    public default void atualizar(Estado estado){};
}
