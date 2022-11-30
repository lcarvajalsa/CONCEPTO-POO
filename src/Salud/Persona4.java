package Salud;

import java.util.Scanner;

public class Persona4 {
    Scanner leer=new Scanner(System.in);
    //Atributos
    private String tipoDocumento;
    private String documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private String edad;
    private String sexo;
    /*private double pesoactual;
    private String resultado;
    //Constructor vacio
    /*public Persona4(){
        System.out.println("Ingrese su tipo de documento 1. CC 2. TI 3. RC ");
        tipoDocumento=leer.nextInt();
        System.out.println("Digite documento");
        documento=leer.nextInt();
        leer.nextLine();
        System.out.println("Digite nombre");
        nombre=leer.nextLine();
        System.out.println("Digite apellido");
        apellido=leer.nextLine();
        System.out.println("Digite peso");
        peso=leer.nextInt();
        System.out.println("Digite estatura");
        estatura=leer.nextDouble();
        System.out.println("Digite edad");
        edad=leer.nextInt();
        System.out.println("Digite sexo 1. Masculino 2. Femenino 3. Neutro");
        sexo=leer.nextInt();
        
    }*/
    public Persona4(){

    }
    //Constructor con argumentos
    public Persona4(String tipoDocumento,String documento,String nombre,String apellido,double peso,double estatura,String edad,String sexo){
    this.tipoDocumento=tipoDocumento;
    this.documento=documento;
    this.nombre=nombre;
    this.apellido=apellido;
    this.peso=peso;
    this.estatura=estatura;
    this.edad=edad;
    this.sexo=sexo;
    }
    //Metodos
    public String getTipoDocumento(){
        return this.tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento){
        this.tipoDocumento=tipoDocumento;
    }
    public String getDocumento(){
        return this.documento;
    }
    public void setDocumento(String documento){
        this.documento=documento;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPesoe(Double peso){
        this.peso=peso;
    }
    public double getEstatura(){
        return this.estatura;
    }
    public void setEstatura(double estatura){
        this.estatura=estatura;
    }
    public String getEdad(){
        return this.edad;
    }
    public void setEdad(String edad){
        this.edad=edad;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    public String toString(){
        return "Tipo: "+this.tipoDocumento+"\nNumero de documento: "+this.documento+",\nNombre: "+this.nombre+"\nApellido: "+this.apellido+"\nPeso: "+this.peso+"\nEstatura: "+this.estatura+"\nEdad: "+this.edad+"\nSexo: "+this.sexo+"]";
    }
    
}