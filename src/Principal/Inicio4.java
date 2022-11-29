package Principal;

import Salud.Empleado;

public class Inicio4 {
    public static void main(String[] args) {
        
        Empleado Empleado1=new Empleado("Cedula", "David", "Cifuentes", "Masculino", 1000511858, 23, 70.0, 1.91, 30000, 8, "Operario", "Producción");

        Empleado1.calcularHonorarios();

        System.out.println("El empleado "+Empleado1.getNombre()+" "+Empleado1.getApellido()+", identificado con " +Empleado1.getTipoDoc()+" " +Empleado1.getDocumento()+", tiene un cargo de "+ Empleado1.getCargo()+", las horas laboradas son "+Empleado1.getHorasTrabajadas()+", el valor por cada hora es "+Empleado1.getValorHora()+" y su pago total, por el dia laborado es "+Empleado1.calcularHonorarios());

    }
}
