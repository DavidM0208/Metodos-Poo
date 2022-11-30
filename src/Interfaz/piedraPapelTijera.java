package Interfaz;

import java.util.Random;

import java.util.Scanner;

public class piedraPapelTijera implements Juego {

    Scanner sc=new Scanner(System.in);

    private int eleccion;
    private int juego;
    private String nombre;

    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
        nombre=sc.next();
    }

    public void jugar() {
        System.out.println("Escoge "+"1.Piedra."+"2.Papel."+"3.Tijera.");
        eleccion=sc.nextInt();
    }

    public void finalizar() {
        juego=(int)(Math.random()*3)+1;

        if(juego==1 && eleccion==1){
            System.out.println("¡¡..EMPATE..!! \n La maquina escogio piedra, seleccionaste piedra.");
        }
        else if(juego==1 && eleccion==2){
            System.out.println("¡¡..GANASTE..!! \n La maquina escogio piedra, seleccionaste papel.");
        }
        else if(juego==1 && eleccion==3){
            System.out.println("¡¡..PERDISTE..!! \n La maquina escogio piedra, seleccionaste tijera.");
        }
        else if(juego==2 && eleccion==1){
            System.out.println("¡¡..PERDISTE..!! \n La maquina escogio papel, seleccionaste piedra.");
        }
        else if(juego==2 && eleccion==2){
            System.out.println("¡¡..EMPATE..!! \n La maquina escogio papel, seleccionaste papel.");
        }
        else if(juego==2 && eleccion==3){
            System.out.println("¡¡..GANASTE..!! \n La maquina escogio papel, seleccionaste tijera.");
        }
        else if(juego==3 && eleccion==1){
            System.out.println("¡¡..GANASTE..!! \n La maquina escogio tijera, seleccionaste piedra.");
        }
        else if(juego==3 && eleccion==2){
            System.out.println("¡¡..Perdiste..!! \n La maquina escogio tijera, seleccionaste papel.");
        }
        else if(juego==3 && eleccion==3){
            System.out.println("¡¡..EMPATE..!! \n La maquina escogio tijera, seleccionaste tijera.");
        }
        else{
            System.out.println("Opcion no valida");
        }
    }


    
}
