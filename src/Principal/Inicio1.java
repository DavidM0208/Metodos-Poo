package Principal;

import Salud.Persona1;

public class Inicio1 {
    public static void main(String[] args) {
        
        Persona1 datos1=new Persona1();

        datos1.pedirDatos();

        datos1.mostrarPersona();

        String resultado = datos1.calcularImc();
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
        
        datos1.mayorEdad();

    }
}
