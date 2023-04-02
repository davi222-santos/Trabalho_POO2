package poo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Carro 1
        CarroDecorado carro1 = new Carro();
        System.out.println("Customize o Carro 1:");
        System.out.print("Cor da Carroceria: ");
        String corCarroceria1 = scanner.nextLine();
        System.out.print("Cor do Farol: ");
        String corFarol1 = scanner.nextLine();
        System.out.print("Nome do Adesivo: ");
        String nomeAdesivo1 = scanner.nextLine();

        carro1 = new CorCarroceriaDecorator(carro1, corCarroceria1);
        carro1 = new CorFarolDecorator(carro1, corFarol1);
        carro1 = new AdesivoDecorator(carro1, nomeAdesivo1);

       

        // Carro 2
        CarroDecorado carro2 = new Carro();
        System.out.println("Customize o Carro 2:");
        System.out.print("Cor da Carroceria: ");
        String corCarroceria2 = scanner.nextLine();
        System.out.print("Cor do Farol: ");
        String corFarol2 = scanner.nextLine();
        System.out.print("Nome do Adesivo: ");
        String nomeAdesivo2 = scanner.nextLine();

        carro2 = new CorCarroceriaDecorator(carro2, corCarroceria2);
        carro2 = new CorFarolDecorator(carro2, corFarol2);
        carro2 = new AdesivoDecorator(carro2, nomeAdesivo2);

       

        // Carro 3
        CarroDecorado carro3 = new Carro();
        System.out.println("Customize o Carro 3:");
        System.out.print("Cor da Carroceria: ");
        String corCarroceria3 = scanner.nextLine();
        System.out.print("Cor do Farol: ");
        String corFarol3 = scanner.nextLine();
        System.out.print("Nome do Adesivo: ");
        String nomeAdesivo3 = scanner.nextLine();

        carro3 = new CorCarroceriaDecorator(carro3, corCarroceria3);
        carro3 = new CorFarolDecorator(carro3, corFarol3);
        carro3 = new AdesivoDecorator(carro3, nomeAdesivo3);

        
        System.out.println("Carro 1 / " + carro1.getDescricao());
        System.out.println("Carro 2 / " +carro2.getDescricao());
        System.out.println("Carro 3 / " +carro3.getDescricao());
    }
}
