package Principal;
import Salud.Persona4;
    public class Inicio4 {public static void main(String[] args) {
        Persona4 uno=new Persona4(1,79922691,"Luis", "Carvajal",68, 1.68, 41, 1);
        System.out.println("Sus datos son "+uno.toString());
        //System.out.println("Tipo documento "+uno.getTipoDocumento()+"\nDocumento "+uno.getDocumento()+"\nNombre "+uno.getNombre()+"\nApellido "+uno.getApellido()+"\nPeso "+uno.getPeso()+"\nEstatura "+uno.getEstatura()+"\nEdad "+uno.getEdad()+"\nSexo "+uno.getSexo());
        uno.setTipoDocumento(2);
        uno.setDocumento(1025142125);
        uno.setNombre("Juan");
        uno.setApellido("Rojas");
        uno.setPeso(70);
        uno.setEstatura(1.80);
        uno.setEdad(18);
        uno.setSexo(1);
        System.out.println("Sus datos son "+uno.toString());
        //System.out.println("Tipo documento "+uno.getTipoDocumento()+"\nDocumento "+uno.getDocumento()+"\nNombre "+uno.getNombre()+"\nApellido "+uno.getApellido()+"\nPeso "+uno.getPeso()+"\nEstatura "+uno.getEstatura()+"\nEdad "+uno.getEdad()+"\nSexo "+uno.getSexo());
    }
}
