package Animais;

import Lojas.petshop;

public class poo {
    public static void main(String... args) 
    {
        animal dog1 = new dog("Xiko", "Marrão", 10, 5.90,"felizão pai", 3);
        animal cat1 = new cat("jopa", "Marrão", 10);
        animal bird1 = new bird("joca", "malhado", 3);

        dog1.soar();
        cat1.soar();
        bird1.soar();
    }
}    