package Lojas;

import Animais.animal;
import Animais.bird;
import Animais.dog;

public class petshop {
    
    public void darBanho (animal animal){
        animal.setEstadoEspirito("Limpo");
    }

    public void tosar(dog dog){
        dog.setEstadoEspirito("Tosadah");
    }

    public void deixarHotel(animal animal){
        animal.setEstadoEspirito("Sardade pora");
    }
}
 