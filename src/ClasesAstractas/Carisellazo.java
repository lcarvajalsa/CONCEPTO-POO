import java.util.Random;
import java.util.Scanner;

import javax.naming.SizeLimitExceededException;
import javax.sound.midi.Soundbank;

public class Carisellazo implements Juego {
//atributos
private String nombre;
private int moneda,eleccion;
Scanner leer=new Scanner(System.in);



    @Override
    public void iniciar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void jugar() {
        // TODO Auto-generated method stub
        System.out.println("Ingrese 1. cara o 2.sello");
        nombre=leer.nextLine();
        eleccion=leer.nextInt();
        System.out.println("......moneda girando");
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        if (moneda==1 && eleccion ==1){
            System.out.println("Cayo cara, seleccionaste cara ... Ganaste!!!"+nombre);
        }
        else if (moneda==1 && eleccion ==2){
            System.out.println("Cayo cara, seleccionaste cara ... Perdiate!!!"+nombre);
        }
        if (moneda==2 && eleccion ==2){
            System.out.println("Cayo sello, seleccionaste cara ... Ganaste!!!"+nombre);
        }
        if (moneda==2 && eleccion ==1){
            System.out.println("Cayo sello, seleccionaste cara ... Perdiste!!!"+nombre);
        }
    }

    
}
