public class Triangulo extends Figura{
    //Atributos 
    private float base;//encabsulado
    private float altura;
    //Metodos

    public Triangulo() {//construcor vacio
        
    }
    public Triangulo(float base, float altura) {//contructor con datos
        this.base = base;
        this.altura=altura;
    }

    public float getLado() {//obtener datos
        return base;
        return altura;
    }

    public void setLado(float base, float altura) {//establecer datos
        this.base = base;
        this.altura=altura;
    }

    @Override //sobre escribir
    public void calcularArea(){
        float area=((base*altura)/2);
        System.out.println("El area del triangulo es base"+base+"por"+altura+"Dividido dos");
    }
}

