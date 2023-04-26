package poo.observers;
import poo.base.Estado;

public interface Observador {
    public default void atualizar(Estado estado){};
}
