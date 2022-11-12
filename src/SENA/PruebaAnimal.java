package SENA;

import conceptos.Animal;

public class PruebaAnimal {
    public static void main(String[] args) {
        Animal panda=new Animal();
        //panda.nombre="Bambú";
        panda.registrarAnimal();
        panda.cambiarNombre("Copito");
        panda.calcularedad(2015);
        //Sys
        System.out.println("La edad del panda es"+panda.edad);

    }
    
}
