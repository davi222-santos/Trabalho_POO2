package poo;

import java.util.Scanner;

import poo.habilidade.AProvaDeFogo;
import poo.habilidade.Jump;
import poo.habilidade.NenhumaHabilidade;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Carro 1
        Carro carro1 = new Carro(
                new NenhumaHabilidade());
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
                new AProvaDeFogo());
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
        Carro carro3 = new Carro(new Jump());
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

        System.out.println("Carro 1 / " + carro_personalizado1.getDescricao());
        System.out.println("Carro 2 / " + carro_personalizado2.getDescricao());
        System.out.println("Carro 3 / " + carro_personalizado3.getDescricao());

        scanner.close();

        System.out.println("Carro 1" );
        carro1.ativarHabilidade();
        System.out.println("Carro 2" 
        );
        carro2.ativarHabilidade();
        System.out.println("Carro 3");
        carro3.ativarHabilidade();
    }
}
