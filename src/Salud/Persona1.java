package Salud;

import java.util.Scanner;

public class Persona1 {
    Scanner leer=new Scanner(System.in);
    //Atributos
    int tipoDocumento;
    int documento;
    String nombre;
    String apellido;
    int peso;
    double estatura;
    int edad;
    int sexo;
    double pesoactual;
    //Metodos
    public void pedirDatos(){
        System.out.println("Ingrese su tipo de documento 1. CC 2. TI 3. RC ");
        tipoDocumento=leer.nextInt();
        if (tipoDocumento==1){
            System.out.println("Marcaste como tipo de documento es Cedula de Ciudadania ");
        }
        else if (tipoDocumento==2){
            System.out.println("Marcaste como tipo de documento es Tarjeta de Identidad ");
        }
        else if (tipoDocumento==3){
            System.out.println("Marcaste como tipo de documento es Registro Civil ");
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
    public void mostrarPersona(){
        System.out.println("Sus datos son los siguientes.............. \nTipo: "+tipoDocumento+"\nNumero de documento: "+documento+",\nNombre: "+nombre+"\nApellido: "+apellido+"\nPeso: "+peso+"\nEstatura: "+estatura+"\nEdad: "+edad+"\nSexo: "+sexo);
    }
    public void calcularImc(){
            pesoactual=peso/(Math.pow(estatura, 2));
            System.out.println(pesoactual);
            if (pesoactual < 20){
                System.out.println("El peso esta por debajo de lo ideal ");
            }
            else if (pesoactual == 20 || pesoactual <=25){
                System.out.println("El peso es ideal ");
            }
            else {
                System.out.println("Tiene sobrepeso ");  
            }
    }
    public void mayorEdad(){
        if (edad > 18){
            System.out.println("Eres mayor de edad...............");
        }
        else {
            System.out.println("Es menor de edad..................");
        }
    }
}
