package poo.base;

import java.util.List;
import java.util.ArrayList;
import poo.observers.*;
    
public class Pista {

    public Estado estado;

    public List<Observador> observadores = new ArrayList<Observador>();
    
    public Pista(){
        this.estado = Estado.Normal;    
    }

    public Estado getEstado(){
        return this.estado;
    }

    public void setEstado(Estado newEstado){
        this.estado = newEstado;
        this.mostrarEstadoPista();
        for(Observador obs: this.observadores){
            obs.atualizar(newEstado);
        }
    }

    public void mostrarEstadoPista(){
        this.estado.mostrarEstado();
    }

    public void voltarAoNormal(){
        this.setEstado(Estado.Normal);
    };

    public void adicionarObservador(Observador obs){
        this.observadores.add(obs);
    }

    public void removerObservador(Observador obs){
        this.observadores.remove(obs);
    }

}