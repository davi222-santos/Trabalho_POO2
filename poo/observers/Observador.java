package observers;
import base.Estado;

public interface Observador {
    public default void atualizar(Estado estado){};
}
