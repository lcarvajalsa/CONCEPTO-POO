public class Cuadrado extends Figura{
    //Atributos 
    private float lado;//encabsulado
    //Metodos

    public Cuadrado() {//construcor vacio
        
    }
    public Cuadrado(float lado) {//contructor con datos
        this.lado = lado;
    }

    public float getLado() {//obtener datos
        return lado;
    }


    public void setLado(float lado) {//establecer datos
        this.lado = lado;
    }

    @Override //sobre escribir
    public void calcularArea(){
        float area=lado*lado;
        System.out.println("El area del cuadrado lado"+lado+"por"+area);
    }
}
