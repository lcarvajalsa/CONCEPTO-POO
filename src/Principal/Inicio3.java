package Principal;
import Salud.Persona3;
public class Inicio3 {
    public static void main(String[] args) {
    //metodo contructor sin retorno
        Persona3 ejecutar=new Persona3();
    //metodo contructor de retorno
        Persona3 llamar=new Persona3(1,1014211425);
            System.out.println("Tipo de identificacion "+llamar.tipoDocumento);
            System.out.println("Numero de identificacion "+llamar.documento);
    }
}
        