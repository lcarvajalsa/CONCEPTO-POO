package SubClase;

import java.util.Scanner;

import Salud.Persona4;

public class Empleado extends Persona4 {
    Scanner leer = new Scanner(System.in);
    // Atributos
    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;

    // metodos
    /*
     * public void calcularHonorarios(){
     * System.out.println("Digite valor por hora");
     * valorHora=leer.nextInt();
     * System.out.println("Digite horas trabajadas");
     * horasTrabajadas=leer.nextInt();
     * double reteica=(((horasTrabajadas*valorHora)*0.966)/100);
     * System.out.println("Valor total"+reteica);
     * 
     * }
     */
    public Empleado(){
        
    }
    public Empleado(String cargo, int valorHora, int horasTrabajadas, String departamento) {
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public Empleado(String tipoDocumento, String documento, String nombre, String apellido, double peso,
            double estatura, String edad, String sexo, String cargo, int valorHora, int horasTrabajadas,
            String departamento) {
        super(tipoDocumento, documento, nombre, apellido, peso, estatura, edad, sexo);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
    public double calcularHonorarios() {
        double producto = (valorHora * horasTrabajadas);
        double reteica = 0.096;
        double valor = producto * reteica;
        double valorTotal = producto - valor;
        return valorTotal;
    }
}
