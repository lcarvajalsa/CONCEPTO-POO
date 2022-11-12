package SALUD;

import java.util.Scanner;

public class Persona {
    //atributos
    int peso1,estatura1,tipoDoc,tipocc,tipoti,tiporc, documento, nombre, apellido, peso, estatura,edad, sexo;
    String genero;
    //metodos
    public void pedirDatos() {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa el tipo de documento 1. CC 2.TI 3. RC");
        tipoDoc=leer.nextInt();
        if (tipoDoc==1){
            System.out.println("Ingresa el numero de CC");
            tipocc=leer.nextInt();
        }
        else if (tipoDoc==2){
            System.out.println("Ingresa el numero de TI");
            tipoti=leer.nextInt();
        }
        else if (tipoDoc==3){
            System.out.println("Ingresa el numero de RC");
            tiporc=leer.nextInt();
        }
        else{
            System.out.println("verifica tu tipo de documento");
            leer.nextLine();
        }
    }
    //Metodo dos
    public void mostrarPersona() {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        nombre=leer.next();
        System.out.println("Ingresa tu apellido");
        apellido=leer.next();
        leer.nextLine();
        System.out.println("Ingresa tu peso");
        peso=leer.next();
        float peso1 = Float.valueOf(peso);
        leer.nextLine();
        System.out.println("Ingresa tu estatura");
        estatura=leer.next();
        float estatura1 = Float.valueOf(estatura);
        leer.nextLine();
        System.out.println("Ingresa tu edad");
        edad=leer.nextInt();
        do{
            System.out.println("Introdice tu género (H/M)");
            genero=leer.next();
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        if (genero.equalsIgnoreCase("H")){
            System.out.println("Tu eres Hombre");
        }
        else if(genero.equalsIgnoreCase("M")){
            System.out.println("Tu eres Mujer");
        }
    }
    // Metodo tres
    public void calcularlmc() {
        float pesoActual= Float.valueOf((peso1/estatura1)/2);
        if (pesoActual<=19){
            System.out.println("El peso está por debajo de lo ideal");
        }
        else if (pesoActual>=20 || pesoActual<=25){
            System.out.println("Estas en el peso es ideal");
        }
        else {
                System.out.println("tiene sobrepeso"); 
        }
        System.out.println(nombre+" "+apellido+" su peso es "+peso1+" Kg, su estatura es "+estatura1+" m, tu edad "+edad);
        if (edad<=18){
            System.out.println("Eres menor de edad"); 
        }
        else{
            System.out.println(" Eres mayor de edad "); 
        }
        leer.close();      

    }

 }
    