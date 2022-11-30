import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Seleccione la figura que desea calcular 1.Circulo 2. Cuadrado 3.Rectangulo 4. Triangulo ");
        int figura = leer.nextInt();
        if (figura==1){
            System.out.println("Ingrese radio");
            int lado1=leer.nextInt();
            Circulo b1=new Circulo();
            b1.setLado(lado1);
            b1.calcularArea();
       }
         else if(figura==2){
            Cuadrado c1=new Cuadrado();
            c1.setLado(12);
            c1.calcularArea();
        }
        else if(figura==3){
            Rectangulo d1=new Rectangulo();
            d1.setLado(10, 14);
            d1.calcularArea();
        }
        else if(figura==4){
            Circulo e1=new Triangulo();
            e1.setLado(0);
            e1.calcularArea();
        }
        else{
            System.out.println("Confirma nuevamente las opciones");
        }
        

    }
}
