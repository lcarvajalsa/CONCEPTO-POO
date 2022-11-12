package conceptos;
public class Animal {

    //Atributos
    String nombre;
    public int edad;
    //Metodos
    public void registrarAnimal(){
        System.out.println("Este es el metodo registroAnimal()");
    }
    //Metodo sin valor de retorno con parámetros
    public void cambiarNombre(String newname){
        nombre=newname;
        System.out.println("El nuevo nombre es "+nombre);
    }
    //Metodo con valor de retorno con parámetros
    public int calcularedad(int anioNacimiento){
        return edad;
    }
}
