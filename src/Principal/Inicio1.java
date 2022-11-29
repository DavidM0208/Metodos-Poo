package Principal;

import Salud.Persona1;

public class Inicio1 {
    public static void main(String[] args) {
        
        Persona1 datos=new Persona1();

        datos.pedirDatos();

        datos.mostrarPersona();

        String resultado = datos.calcularImc();
        System.out.println(resultado);
        if(resultado.equals("Peso bajo")){
            System.out.println("El peso esta por debajo de lo ideal");
        }
        else if(resultado.equals("Peso ideal")){
            System.out.println("Esta en el peso ideal");
        }
        else{
            System.out.println("Sobrepeso");
        }
        
        datos.mayorEdad();

    }
}
