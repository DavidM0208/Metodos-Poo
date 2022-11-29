package Principal;

import Salud.Persona1;

public class Inicio1 {
    public static void main(String[] args) {
        
        Persona1 datos=new Persona1();

        datos.pedirDatos();
        datos.mostrarPersona();
        datos.calcularImc();
        datos.mayorEdad();

    }
}
