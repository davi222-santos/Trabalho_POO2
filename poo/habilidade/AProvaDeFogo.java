package habilidade;

public class AProvaDeFogo implements Habilidade {

    @Override
    public void usar() {
        System.out.println("Imune a fogo");
    }

    @Override
    public String toString() {
        return "À prova de fogo!";
    }

}
