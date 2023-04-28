import java.util.ArrayList;
import java.util.List;
import base.Carro;
import base.Componente;
import decorators.*;

public class Main {
     public static void main(String[] args) {

          // Carro 1
          Carro carro1 = new Carro("Carro 1");
          CorCarroceriaDecorator carro_com_carroceria_1 = new CorCarroceriaDecorator(carro1, "preto");
          CorFarolDecorator carro_com_farol_1 = new CorFarolDecorator(carro_com_carroceria_1, "preto");
          AdesivoDecorator carro_com_adesivo_1 = new AdesivoDecorator(carro_com_farol_1, "preto");

          // Carro 2
          Carro carro2 = new Carro("Carro 2");
          CorCarroceriaDecorator carro_com_carroceria_2 = new CorCarroceriaDecorator(carro2, "azul");
          CorFarolDecorator carro_com_farol_2 = new CorFarolDecorator(carro_com_carroceria_2, "azul");
          AdesivoDecorator carro_com_adesivo_2 = new AdesivoDecorator(carro_com_farol_2, "azul");

          // Carro 3
          Carro carro3 = new Carro("Carro 3");
          CorCarroceriaDecorator carro_com_carroceria_3 = new CorCarroceriaDecorator(carro3, "vermelho");
          CorFarolDecorator carro_com_farol_3 = new CorFarolDecorator(carro_com_carroceria_3, "vermelho");
          AdesivoDecorator carro_com_adesivo_3 = new AdesivoDecorator(carro_com_farol_3, "vermelho");

          List<Componente> participantes = new ArrayList<Componente>();
          participantes.add(carro_com_adesivo_1);
          participantes.add(carro_com_adesivo_2);
          participantes.add(carro_com_adesivo_3);

          Corrida.iniciar(participantes);
     }

}
