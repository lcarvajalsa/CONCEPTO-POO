package Principal;

import java.util.Scanner;

import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        Persona datos = new Persona();

        datos.pedirDatos();
        datos.mostrarPersona();
        String resultado = datos.calculoImc();

        if(resultado.equalsIgnoreCase("Peso bajo")){
            System.out.println("Estas bajo de peso");
        }
        else if (resultado.equalsIgnoreCase("Peso ideal")){
            System.out.println("Estas en el peso ideal");
        }
        else{
            System.out.println("Estas en sobrepeso");
        }
        datos.mayorEdad();
        leer.close();
    }
    
}
