package Salud;

import java.util.Scanner;

public class Persona4 {
    
    Scanner leer=new Scanner(System.in);

    private String tipoDoc, nombre, apellido, genero;
    private int documento, edad;
    private Double peso, estatura;

    public Persona4() {

    }

    public Persona4(String tipoDoc, String nombre, String apellido, String genero, int documento, int edad, Double peso,
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

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    
    

}
