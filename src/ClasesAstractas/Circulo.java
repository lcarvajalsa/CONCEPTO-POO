public class Circulo extends Figura{
    //Atributos 
    private float radio;
    //encapsulado
    //Metodos

    public Circulo() {//construcor vacio
        
    }
    public Circulo(float radio) {//contructor con datos
        this.radio = radio;
    }

    public float getLado() {//obtener datos
        return radio;
    }
    public void setLado(float radio) {//establecer datos
        this.radio = radio;
    }

    @Override //sobre escribir
    public void calcularArea(){
        double area=Math.PI *Marh.;
        System.out.println("El area del circulo es PI"+Math.PI+"por"+radio);
    }
}

