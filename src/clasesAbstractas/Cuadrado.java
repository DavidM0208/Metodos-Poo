package clasesAbstractas;

public class Cuadrado extends Figura{
    
    //Atributos
    private float lado;

    //Metodos
    public Cuadrado(){

    }

    public Cuadrado(float lado){
        this.lado=lado;
    }

    public float getLado(){
        return lado;
    }

    public void setLado(float lado){
        this.lado=lado;
    }

    public void calcularArea(){
        float area=lado*lado;
        System.out.println("El area del cuadradi "+lado+" es "+area);
    }
}
