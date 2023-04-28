package habilidade;

public class SuperNitro implements Habilidade{

    @Override
    public void usar() {
       System.out.println("Ativando nitro");
    }
    
    @Override
    public String toString() {
        return "Super Nitro!";
    }

}
