package poo.observers;
import poo.base.Estado;
import poo.base.Pista;

public interface Observador {
    Pista pistaAtual = new Pista();
    public default void atualizar(Estado estado){};
}
