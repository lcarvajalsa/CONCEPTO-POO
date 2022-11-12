import java.util.Scanner;

public class Calculadora {
    //Atributos
    int num1,num2;
    double exponum1,exponum2;

    //Método
    public void pregunta(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=leer.nextInt();
    }
    //1.Método sin valor de retorno que sume lo dos números
    public void sumeNumeros(int newsuma){
        newsuma=num1+num2;
        System.out.println("Lasuma de los numeros es"+newsuma);
    }
    //2.Método con valor de retorno que reste lo dos números
    public int resteNumeros(int newresta){
        newresta=num1-num2;
        return newresta;
    }
    //3.Método con valor de retorno que devuelva ¿Cuál es el número mayor?
    public int mayorNumero(int numero){
        if(num1<num2){
            System.out.println("El numero mayor es "+num2);
        }
        else if (num1>num2){
            System.out.println("El numero mayor es "+num1);
        }
        return numero;
    }
    //4.Método sin valor de retorno que devuelva ¿Cuál es el número menor?
    public void menorNumero(){
        if(num1<num2){
            System.out.println("El numero menor es "+num2);
        }
        else if (num1>num2){
            System.out.println("El numero menor es "+num1);
        }
        
    }
    /*5.Método con valor de retorno que eleve cada número al 
    esponente que sea indicado por el usuario*/
    public double exponente(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite a que numero decea elevar "+num1);
        exponum1=leer.nextDouble();
        exponum1=(Math.pow(num1, exponum1));
        System.out.println("Su resultado es "+exponum1);
        return exponum1;
    }
    public double exponum2(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite a que numero decea elevar "+num2);
        exponum2=leer.nextDouble();
        exponum2=(Math.pow(num1, exponum2));
        System.out.println("Su resultado es "+exponum2);
        return exponum2;
    }
}