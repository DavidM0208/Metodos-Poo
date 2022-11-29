package Principal;

import Salud.Persona3;

public class Inicio3 {
    public static void main(String[] args) {

        Persona3 llamar=new Persona3("Cedula", "David", "Cifuentes", "Masculino", 1000511858, 23, 70.0, 1.91);

        llamar.consultarPersona("David");
        
    }

        
}