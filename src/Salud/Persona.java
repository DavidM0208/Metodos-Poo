package Salud;

import java.util.Scanner;

public class Persona{

    Scanner registro=new Scanner(System.in);

    /*Atributos*/

    public String tipoDoc, nombre, apellido, genero;
    public int documento, edad;
    public Double peso, Imc, estatura;

    /*Metodos*/

    public void pedirDatos(){

        System.out.println("Ingrese el tipo de documento");
        tipoDoc=registro.nextLine();
        System.out.println("Ingrese el numero de documento");
        documento=registro.nextInt();
        registro.nextLine();
        System.out.println("Ingrese su nombre");
        nombre=registro.nextLine();
        System.out.println("Ingrese su apellido");
        apellido=registro.nextLine();
        System.out.println("Ingrese su peso en kilogramos");
        peso=registro.nextDouble();
        System.out.println("Ingrese su estatura");
        estatura=registro.nextDouble();
        System.out.println("Ingrese su edad");
        edad=registro.nextInt();
        registro.nextLine();
        System.out.println("Ingrese su género");
        genero=registro.nextLine();
    }
    
    public void mostrarPersona(){
        System.out.println("Los datos ingresados fueron: \n Tipo de documento: "+tipoDoc+" \n Número de documento: "+documento+" \n Nombre: "+nombre+" \n Apellido: "+apellido+" \n Peso: "+peso+" \n Estatura: "+estatura+" \n Edad: "+edad+" \n Género: "+genero);
    }

    public void calcularImc(){
        Imc=peso/(Math.pow(estatura, 2));
        System.out.println(Imc);

        if(Imc<20){
            System.out.println("El peso esta por debajo de lo ideal.");
        }
        else if(Imc==20 || Imc<=25){
            System.out.println("El peso es ideal");
        }
        else{
            System.out.println("Tiene sobrepeso");
        }
    }
    public void mayorEdad(){

        if(edad>18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
    }

}