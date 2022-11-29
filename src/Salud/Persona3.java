package Salud;

import java.util.Scanner;

public class Persona3 {
    Scanner leer=new Scanner(System.in);
    //Atributos
    public String tipoDocumento;
    public String documento;
    public String nombre;
    public String apellido;
    public double peso;
    public double estatura;
    public int edad;
    public int sexo;
    double pesoactual;
    String resultado;
    
    //Constructor vacio
    public Persona3(){
       
    }
    //Constructor con parametros

    public Persona3(String tipoDocumento,String documento,String nombre, String apellido, double peso, double estatura, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.tipoDocumento=tipoDocumento;
        this.documento=documento;
    }
    
    //Metodos
    public void consultarPersona(String Nombre){
        if(Nombre.equalsIgnoreCase(nombre)){
            System.out.println("El paciente " + nombre + " " + apellido + " identificado con " + tipoDocumento + " y numero " + documento + " con " + edad + " años " + " y con un peso de " + peso + " y una estatura de" + estatura);
        }
        else {
            System.out.println("Paciente no existe");
        }
    }
    
}