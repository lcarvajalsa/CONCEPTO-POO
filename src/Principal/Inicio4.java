package Principal;
import SubClase.Empleado;
    public class Inicio4 {
        public static void main(String[] args) {
        Empleado Empleado1=new Empleado("cc", "79922691", "Luis", "Carvajal", 80.0, 1.68, "41", "Masculino", "Tecnico", 30000, 8, "TIC");
        Empleado1.calcularHonorarios();
        System.out.println("El Empleado "+Empleado1.getNombre()+"\n Apellido "+Empleado1.getApellido()+"\n Identificado con "+Empleado1.getDocumento()+"\n En el cargo "+Empleado1.getCargo()+"\n Sus horas extras "+Empleado1.getHorasTrabajadas()+"\n Sus horas son "+Empleado1.calcularHonorarios());
        
    }
}
