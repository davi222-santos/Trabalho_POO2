import java.util.ArrayList;
import java.util.List;
import base.Carro;
import base.Componente;
import decorators.*;

public class Main {
     public static void main(String[] args) {

          // Carro 1
          Carro carro1 = new Carro("Carro 1");
          CarroDecorado carro_personalizado1 = new CorCarroceriaDecorator(carro1, "Preto");
          carro_personalizado1 = new CorFarolDecorator(carro_personalizado1, "Preto");
          carro_personalizado1 = new AdesivoDecorator(carro_personalizado1, "Preto");

          // Carro 2
          Carro carro2 = new Carro("Carro 2");
          CarroDecorado carro_personalizado2 = new CorCarroceriaDecorator(carro2, "Azul");
          carro_personalizado2 = new CorFarolDecorator(carro_personalizado2, "Azul");
          carro_personalizado2 = new AdesivoDecorator(carro_personalizado2, "Azul");

          // Carro 3
          Carro carro3 = new Carro("Carro 3");
          CarroDecorado carro_personalizado3 = new CorCarroceriaDecorator(carro3, "vermelho");
          carro_personalizado3 = new CorFarolDecorator(carro_personalizado3, "vermelho");
          carro_personalizado3 = new AdesivoDecorator(carro_personalizado3, "vermelho");

          List<Componente> participantes = new ArrayList<Componente>();
          participantes.add(carro_personalizado1);
          participantes.add(carro_personalizado2);
          participantes.add(carro_personalizado3);

          Corrida.iniciar(participantes);
     }

}
