package Principal;
import Salud.Persona3;
public class Inicio3 {
    public static void main(String[] args) {
    //metodo contructor sin retorno
        Persona3 ejecutar=new Persona3();


    //metodo contructor de retorno
        Persona3 llamar1 = new Persona3("Cc", "79922691","Luis", "Carvajal", 68, 1.68, 41);
        llamar1.consultarPersona("Luis");
    }
}
        