package Salud;

import java.util.Scanner;

public class Persona4 {
    Scanner leer=new Scanner(System.in);
    //Atributos
    private int tipoDocumento;
    private int documento;
    private String nombre;
    private String apellido;
    private int peso;
    private double estatura;
    private int edad;
    private int sexo;
    private double pesoactual;
    private String resultado;
    //Constructor vacio
    public Persona4(){
        System.out.println("Ingrese su tipo de documento 1. CC 2. TI 3. RC ");
        tipoDocumento=leer.nextInt();
        if (tipoDocumento==1){
            System.out.println("Marcaste como tipo de documento Cedula de Ciudadania ");
        }
        else if (tipoDocumento==2){
            System.out.println("Marcaste como tipo de documento Tarjeta de Identidad ");
        }
        else if (tipoDocumento==3){
            System.out.println("Marcaste como tipo de documento Registro Civil ");
        }
        else{
            System.out.println("Confirma los diferentes tipos de identificación y confirma nuevamente ");
        }
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
        if (sexo==1){
            System.out.println("Marcaste el genero Masculino");
        }
        else if (sexo==2){
            System.out.println("Marcaste el genero Masculino");
        }
        else if (sexo==3){
            System.out.println("Marcaste el genero Masculino");
        }
        else{
            System.out.println("Confirma los diferentes tipos de sexo y confirma nuevamente ");
        }
    }
    //Constructor con argumentos
    public Persona4(int tipoDocumento,int documento,String nombre,String apellido,int peso,double estatura,int edad,int sexo){
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
    public int getTipoDocumento(){
        return this.tipoDocumento;
    }
    public void setTipoDocumento(int tipoDocumento){
        this.tipoDocumento=tipoDocumento;
    }
    public int getDocumento(){
        return this.documento;
    }
    public void setDocumento(int documento){
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
    public int getPeso(){
        return this.peso;
    }
    public void setPesoe(int peso){
        this.peso=peso;
    }
    public double getEstatura(){
        return this.estatura;
    }
    public void setEstatura(double estatura){
        this.estatura=estatura;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getSexo(){
        return this.sexo;
    }
    public void setSexo(int sexo){
        this.sexo=sexo;
    }
    public String toString(){
        return "Tipo: "+this.tipoDocumento+"\nNumero de documento: "+this.documento+",\nNombre: "+this.nombre+"\nApellido: "+this.apellido+"\nPeso: "+this.peso+"\nEstatura: "+this.estatura+"\nEdad: "+this.edad+"\nSexo: "+this.sexo+"]";
    }
    public void pedirDatos(){
        System.out.println("Ingrese su tipo de documento 1. CC 2. TI 3. RC ");
        tipoDocumento=leer.nextInt();
        if (tipoDocumento==1){
            System.out.println("Marcaste como tipo de documento Cedula de Ciudadania ");
        }
        else if (tipoDocumento==2){
            System.out.println("Marcaste como tipo de documento Tarjeta de Identidad ");
        }
        else if (tipoDocumento==3){
            System.out.println("Marcaste como tipo de documento Registro Civil ");
        }
        else{
            System.out.println("Confirma los diferentes tipos de identificación y confirma nuevamente ");
        }
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
        if (sexo==1){
            System.out.println("Marcaste el genero Masculino");
        }
        else if (sexo==2){
            System.out.println("Marcaste el genero Masculino");
        }
        else if (sexo==3){
            System.out.println("Marcaste el genero Masculino");
        }
        else{
            System.out.println("Confirma los diferentes tipos de sexo y confirma nuevamente ");
        }
    }
    public static void mostrarPersona(){
        System.out.println("Sus datos son los siguientes.............. \nTipo: "+tipoDocumento+"\nNumero de documento: "+documento+",\nNombre: "+nombre+"\nApellido: "+apellido+"\nPeso: "+peso+"\nEstatura: "+estatura+"\nEdad: "+edad+"\nSexo: "+sexo);
    }
    public String calcularImc(){
            pesoactual=peso/(Math.pow(estatura, 2));
            if(pesoactual < 20){
                resultado = "Peso bajo";
            }
            else if (pesoactual == 20  || pesoactual <=25){
                resultado = "Peso ideal";
            }
            else {
                resultado = "Sobre peso";
            }
            return resultado;//metodo de retorno
        }
    public void mayorEdad(){
        if (edad > 18){
            System.out.println("Eres mayor de edad...............");
        }
        else {
            System.out.println("Es menor de edad..................");
        }
    }
    public void setPeso(int i) {
    }
    
}