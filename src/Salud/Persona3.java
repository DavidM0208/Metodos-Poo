package Salud;

import java.util.Scanner;

public class Persona3 {
    
    Scanner registro=new Scanner(System.in);

    /*Atributos*/

    public String tipoDoc, nombre, apellido, genero;
    public int documento, edad;
    public Double peso, Imc, estatura;

    /*Metodos constructores*/

    public Persona3() {

    }

    public Persona3(String tipoDoc, String nombre, String apellido, String genero, int documento, int edad, Double peso,
            Double estatura) {
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.documento = documento;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public void consultarPersona(String Nombre){
        if(Nombre.equalsIgnoreCase(nombre)){
            System.out.println("La persona "+nombre+" "+apellido+" identificado con "+tipoDoc+" de número "+documento+", con "+edad+" años, un peso de "+peso+" kg, una estatura de "+estatura+" y de sexo "+genero);
        }
    }

    /*Metodos*/

}