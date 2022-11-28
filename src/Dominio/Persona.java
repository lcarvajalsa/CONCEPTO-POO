package Dominio;

public class Persona {
    //atribitos
    private String nombre;
    private double sueldo;
    //constructor
    public Persona(String nombre,double sueldo) {
        this.nombre=nombre;
        this.sueldo=sueldo;
    }
    //Metodos
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //clases

    
}
