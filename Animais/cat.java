package Animais;

public class cat extends animal{
    
    static int catNumber;


    public cat(String nome, String cor, double peso) {
        super(nome, cor, peso); 
    }

    
    @Override
    public void soar() {
        System.out.println("MIAL PORA");
    }
}
