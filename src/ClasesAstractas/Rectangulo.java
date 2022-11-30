public class Rectangulo extends Figura{
    //Atributos 
    private float base;
    private float altura;//encabsulado
    //Metodos

    public Rectangulo() {//construcor vacio
        
    }
    public Rectangulo(float base, float altura) {//contructor con datos
        this.base = base;   
    }
    public float getLado() {//obtener datos
        return base;  
    }
    public float getLado(){
        return altura;
    }
    public void setLado(float base,float altura) {//establecer datos
        this.base = base;
        this.altura=altura;  
    }

    @Override //sobre escribir
    public void calcularArea(){
        float area=base*altura;
        System.out.println("El area del rectangulo es base"+base+"por"+altura);
    }
}

