package Principal;

import Salud.Persona2;

public class Inicio2 {
    public static void main(String[] args) {
        Persona2 dato= new Persona2();
        dato.pedirDatos();
        dato.mostrarPersona();
        String resultado = dato.calcularImc();
        if(resultado.equalsIgnoreCase("Peso bajo")){
            System.out.println("PESOBAJO....................");
        }
        else if (resultado.equalsIgnoreCase("Peso ideal")){
            System.out.println("PESOIDEAL..................");
        }
        else if (resultado.equalsIgnoreCase("Sobre peso")){
            System.out.println("SOBREPESO..................");
        }
        else{
            System.out.println("Confirma nuevamente tu peso ");
        }
        dato.mayorEdad();
        


        

    }
}
