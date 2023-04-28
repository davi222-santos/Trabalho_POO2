import java.util.ArrayList;
import java.util.List;
import base.Carro;
import base.Componente;
import decorators.*;
import java.util.Random;

public class Main {
     public static void main(String[] args) {

          Corrida.iniciar(geradorDeCarros(3));
          
     }

     public static List<Componente> geradorDeCarros(int quantidade) {
          List<Componente> _carros = new ArrayList<Componente>();
          if (quantidade > 0) {

               for (int i = 0; i < quantidade; i++) {
                    CarroDecorado carro_personalizado = new CorCarroceriaDecorator(new Carro("Carro " + (i + 1)),
                              getColor());
                    carro_personalizado = new CorFarolDecorator(carro_personalizado, getColor());
                    carro_personalizado = new AdesivoDecorator(carro_personalizado, getColor());
                    _carros.add(carro_personalizado);
               }
               return _carros;
          } else {
               System.out.println("Erro");
               return _carros;
          }
     }

     public static String getColor() {
          Random gerador = new Random();
          List<String> cores = new ArrayList<String>();

          cores.add("Azul");
          cores.add("Amarelo");
          cores.add("Âmbar");
          cores.add("Ameixa");
          cores.add("Vermelho");
          cores.add("Preto");
          cores.add("Branco");
          cores.add("Rosa");
          cores.add("Verde");
          cores.add("Roxo");
          cores.add("Laranja");
          return cores.get(gerador.nextInt(cores.size()));
     }
}
