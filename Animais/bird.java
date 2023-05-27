package Animais;

public class bird extends animal{

    static int birdNumber;
    
    public bird(String nome, String cor, double peso) {
        super(nome, cor, peso); 
    }

    @Override
    public void soar() {
        System.out.println("PIL PEW");
    }
}
