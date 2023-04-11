package poo;

import java.util.Scanner;

import poo.base.Carro;
import poo.base.Estado;
import poo.base.Pista;
import poo.decorators.*;
import poo.habilidade.*;
import poo.observers.Observador;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Carro 1
        Carro carro1 = new Carro("Carro 1");
        System.out.println("Customize o Carro 1:");
        System.out.print("Cor da Carroceria: ");
        String corCarroceria1 = scanner.nextLine();
        System.out.print("Cor do Farol: ");
        String corFarol1 = scanner.nextLine();
        System.out.print("Nome do Adesivo: ");
        String nomeAdesivo1 = scanner.nextLine();

        CarroDecorado carro_personalizado1 = new CorCarroceriaDecorator(carro1, corCarroceria1);
        carro_personalizado1 = new CorFarolDecorator(carro_personalizado1, corFarol1);
        carro_personalizado1 = new AdesivoDecorator(carro_personalizado1, nomeAdesivo1);

        // Carro 2
        Carro carro2 = new Carro(
                new AProvaDeFogo(), "Carro 2");
        System.out.println("Customize o Carro 2:");
        System.out.print("Cor da Carroceria: ");
        String corCarroceria2 = scanner.nextLine();
        System.out.print("Cor do Farol: ");
        String corFarol2 = scanner.nextLine();
        System.out.print("Nome do Adesivo: ");
        String nomeAdesivo2 = scanner.nextLine();

        CarroDecorado carro_personalizado2 = new CorCarroceriaDecorator(carro2, corCarroceria2);
        carro_personalizado2 = new CorFarolDecorator(carro_personalizado2, corFarol2);
        carro_personalizado2 = new AdesivoDecorator(carro_personalizado2, nomeAdesivo2);

        // Carro 3
        Carro carro3 = new Carro(new Jump(), "Carro 3");
        System.out.println("Customize o Carro 3:");
        System.out.print("Cor da Carroceria: ");
        String corCarroceria3 = scanner.nextLine();
        System.out.print("Cor do Farol: ");
        String corFarol3 = scanner.nextLine();
        System.out.print("Nome do Adesivo: ");
        String nomeAdesivo3 = scanner.nextLine();

        CarroDecorado carro_personalizado3 = new CorCarroceriaDecorator(carro3, corCarroceria3);
        carro_personalizado3 = new CorFarolDecorator(carro_personalizado3, corFarol3);
        carro_personalizado3 = new AdesivoDecorator(carro_personalizado3, nomeAdesivo3);

        System.out.println("\nTeste Decorators\n");

        System.out.println("Carro 1 \n " + carro_personalizado1.getDescricao());
        System.out.println("Carro 2 \n " + carro_personalizado2.getDescricao());
        System.out.println("Carro 3 \n " + carro_personalizado3.getDescricao());

        scanner.close();

        System.out.println("\nTeste Strategy\n");


        System.out.println("Carro 1");
        carro1.ativarHabilidade();
        System.out.println("Carro 2");
        carro2.ativarHabilidade();
        System.out.println("Carro 3");
        carro3.ativarHabilidade();

        System.out.println("\nTeste Observer\n");

        Pista pista = new Pista();
        pista.adicionarObservador(carro1);
        pista.adicionarObservador(carro2);
        pista.adicionarObservador(carro3);
        pista.setEstado(Estado.AreiaMovedica);

       for(Observador obs: pista.observadores){
            System.out.println(obs.pistaAtual.getEstado());
       }
        
    }
}
