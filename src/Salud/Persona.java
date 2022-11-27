package Salud;

import java.util.Scanner;

public class Persona {
    Scanner leer=new Scanner(System.in);
    //atributos
    public int documento,edad,tipoDoc;
    public String nombre,apellido,sexo,resultado;
    public Double peso,pesoactual,estatura;
    // metdodos
    public void pedirDatos(){
        System.out.println("Ingrese su tipo de documento");
        tipoDoc=leer.nextInt();
        
        System.out.println("Ingrese el numero de su documento ");
        documento=leer.nextInt();
        System.out.println("Ingrese el numero de su nombre ");
        nombre=leer.next();
        System.out.println("Ingrese el numero de su apellido ");
        apellido=leer.next();
        System.out.println("Ingrese su peso en kilogramos ");
        peso=leer.nextDouble();
        System.out.println("Ingrese su estatura en centimetros ");
        estatura=leer.nextDouble();
        System.out.println("Ingrese su edad ");
        edad=leer.nextInt();
        System.out.println("Ingrese el sexo que usted se considera ");
        sexo=leer.next();
    }
    public void mostrarPersona(){
        System.out.println("los datos que usted ingreso fueron\n Tipo de documento :"+tipoDoc+"\n Numero de cedula :"+documento+"\n Nombre:"+nombre+"\n Apellido: "+apellido+"\n Peso:"+peso+"\n Estatura : "+estatura+"\n Edad : "+edad+"\n Sexo : "+sexo);
    }
    /*public void calcularImc(){
        pesoactual=peso/(Math.pow(estatura, 2));
        System.out.println(pesoactual);
        if (pesoactual < 20){
            System.out.println("el peso esta por debajo de lo ideal");
        }
        else if (pesoactual == 20 || pesoactual <=25){
            System.out.println("El peso es ideal");
        }
        else {
            System.out.println("Tiene sobrepeso");  
        }
    }*/
    public String calcularImc(){
        pesoactual = peso / Math.pow(estatura, 2);
        if(pesoactual < 20){
            resultado = "Peso bajo";
        }
        else if (pesoactual == 20  || pesoactual <=25){
            resultado = "Peso ideal";
        }
        else {
            resultado = "Sobrepeso";
        }
        return resultado;
    }
    public void mayorEdad (){
        if (edad > 18){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
    }
}

