package habilidade;

public class Jump implements Habilidade{

    @Override
    public void usar() {
       System.out.println("Pulando");
    }
    
    @Override
    public String toString() {
        return "Jump!";
    }
}
