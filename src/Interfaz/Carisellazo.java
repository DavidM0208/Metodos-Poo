package Interfaz;

import java.util.Random;

import java.util.Scanner;

public class Carisellazo implements pruebaJuego{

    Scanner sc=new Scanner(System.in);

    //Atributos

    private String nombre;
    private int opcion;
    private int moneda;

    public void iniciar(){
        System.out.println("Ingrese el nombre del jugador");
        nombre=sc.next();
    }

    public void jugar(){
        System.out.println("Escoge: "+"1. Cara."+"2. Sello.");
        opcion=sc.nextInt();
        System.out.println("¡¡...Moneda Girand...!!");
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
    }

    public void finalizar(){
        if(moneda == 1 && opcion==2){
            System.out.println("Salio cara, seleccionaste cara. ¡¡ GANASTE !!"+nombre);
        }
        else if(moneda==1 && opcion==2){
            System.out.println("Salio cara, seleccionaste sello. ¡¡ PERDISTE !!"+nombre);
        }
        else if(moneda==2 && opcion==2){
            System.out.println("Salio sello, seleccionaste sello. ¡¡ GANASTE !!"+nombre);
        }
        else if(moneda==1 && opcion==2){
            System.out.println("Salio cara, seleccionaste sello. ¡¡ PERDISTE !!"+nombre);
        }
        else{
            System.out.println("Opcion incorrecta.");
        }
        sc.close();
    }

}