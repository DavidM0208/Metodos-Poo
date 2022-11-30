package Interfaz;

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
            System.out.println("¡¡..EMPATE..!! \n La maquina escogio piedra, "+nombre+" seleciono piedra.");
        }
        else if(juego==1 && eleccion==2){
            System.out.println("¡¡..GANASTE..!! \n La maquina escogio piedra, "+nombre+" seleciono papel.");
        }
        else if(juego==1 && eleccion==3){
            System.out.println("¡¡..PERDISTE..!! \n La maquina escogio piedra, "+nombre+" seleciono tijera.");
        }
        else if(juego==2 && eleccion==1){
            System.out.println("¡¡..PERDISTE..!! \n La maquina escogio papel, "+nombre+" seleciono piedra.");
        }
        else if(juego==2 && eleccion==2){
            System.out.println("¡¡..EMPATE..!! \n La maquina escogio papel, "+nombre+" seleciono papel.");
        }
        else if(juego==2 && eleccion==3){
            System.out.println("¡¡..GANASTE..!! \n La maquina escogio papel, "+nombre+" seleciono tijera.");
        }
        else if(juego==3 && eleccion==1){
            System.out.println("¡¡..GANASTE..!! \n La maquina escogio tijera, "+nombre+" seleciono piedra.");
        }
        else if(juego==3 && eleccion==2){
            System.out.println("¡¡..Perdiste..!! \n La maquina escogio tijera, "+nombre+" seleciono papel.");
        }
        else if(juego==3 && eleccion==3){
            System.out.println("¡¡..EMPATE..!! \n La maquina escogio tijera, "+nombre+" seleciono tijera.");
        }
        else{
            System.out.println("Opcion no valida");
        }
    }


    
}
