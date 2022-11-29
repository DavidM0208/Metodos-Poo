package clasesAbstractas;

public class Circulo extends Figura{

    //Atributos

    private float radio;

    //Metodos 
    public Circulo(){

    }

    public Circulo(float radio){
        this.radio=radio;
    }

    public float getRadio(){
        return radio;
    }

    public void setRadio(float radio){
        this.radio=radio;
    }

    public void calcularArea(){
        double area=Math.PI*Math.pow(radio,2);
        System.out.println("El area del circulo es "+area);
    }
}