import java.util.ArrayList;
import java.util.List;
import base.Componente;
import base.Estado;
import base.Pista;
import habilidade.*;
import java.util.Random;

public class Corrida {

    static public void iniciar(List<Componente> carros) {

        List<Componente> _carros = carros;
        Pista pista = new Pista();

        apresentarCompetidores(carros);
        
        System.out.println("A corrida vai começar");
        while (_carros.size()> 1) {
         
        
             // adicionando habilidades nos carros
             for (Componente carro : _carros) {
                carro.setHabilidade(getHabilidadeAleatorio());
            }
            // atualizando estado da habilidade dos carros na pista
            pista.observadores.clear();
            pista.observadores.addAll(_carros);
            pista.setEstado(getEstadoAleatorio());

            _carros = limparPista(_carros);

        
           }
           if(_carros.size() == 1){
            System.out.println("Temos um sobrevivente, muito bem " + _carros.get(0).getNome());
           }
           else if (_carros.size() == 0){
            System.out.println("Infelizmente pessoal estão todos mortos, mas semana que vem tem mais.");
           }

    }

    private static void apresentarCompetidores(List<Componente> carros) {
        System.out.println("===========================================================");
        for (Componente carro : carros) {
            System.out.println("");
            System.out.println(carro.getDescricao());
            System.out.println("");
        }
        System.out.println("===========================================================");
    }

    private static Estado getEstadoAleatorio() {
        Random gerador = new Random();
        final int estadoAleatorio = gerador.nextInt(Estado.values().length);
        return Estado.values()[estadoAleatorio];
    }

    private static Habilidade getHabilidadeAleatorio() {
        List<Habilidade> habilidades = new ArrayList<Habilidade>();

        habilidades.add(new AProvaDeFogo());
        habilidades.add(new Jump());
        habilidades.add(new SuperNitro());

        Random gerador = new Random();
        final int habilidadeAleatorio = gerador.nextInt(habilidades.size());
        return habilidades.get(habilidadeAleatorio);
    }

    private static List<Componente> limparPista(List<Componente> carros) {
        List<Componente> _carros = new ArrayList<Componente>();
        for (Componente carro : carros) {
            if (!carro.getDestruido()) {
                _carros.add(carro);
            }
         
        }
        return _carros;
    }

}