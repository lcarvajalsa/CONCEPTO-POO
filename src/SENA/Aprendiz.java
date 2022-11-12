package SENA;

import java.util.Scanner;

public class Aprendiz {
   
      Scanner leer=new Scanner(System.in);
      String nombre;
      int edad;
      String sede;
      int id;
      int ficha; 
   //Metodo / operaciones
   public void registrarNombre(){
      System.out.println("Su nombre es"+nombre);
      System.out.println("ingrese nuevo nombre");
      nombre=leer.next();
      leer.nextLine();
      System.out.println("ingrese nuevo nombre"+nombre);
      leer.nextLine();
      leer.close();
   }
   
}
