package SubClase;

import java.util.Scanner;

public class Empleado {
    Scanner leer=new Scanner(System.in);
    //Atributos
    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;
    private int tipoCargo;

    //metodos
    public void calcularHonorarios(){
        System.out.println("Digite valor por hora");
        valorHora=leer.nextInt();
        System.out.println("Digite horas trabajadas");
        horasTrabajadas=leer.nextDouble();
        reteica=(((horasTrabajadas*valorHora)*100)/0.966);
        System.out.println("Valor total");
        
    }
    public void Empleados(){

    }   
    public String getCargo(){
        return this.getCargo();
    }
    public void setTipoDocumento(int tipoCargo){
        this.tipoCargo=tipoCargo;
    }
}
