package Salud;

public class Empleado extends Persona4{
    
    private int valorHora, horasTrabajadas;
    private String cargo, departamentos;

    public Empleado() {
        
    }

    public Empleado(int valorHora, int horasTrabajadas, String cargo, String departamentos) {
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.cargo = cargo;
        this.departamentos = departamentos;
    }

    public Empleado(String tipoDoc, String nombre, String apellido, String genero, int documento, int edad, Double peso, Double estatura, int valorHora, int horasTrabajadas, String cargo, String departamentos) {
        super(tipoDoc, nombre, apellido, genero, documento, edad, peso, estatura);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.cargo = cargo;
        this.departamentos = departamentos;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }

    public double calcularHonorarios(){
        double producto=(valorHora*horasTrabajadas);
        double reteica=0.096;
        double valor=producto*reteica;
        double valorTotal=producto-valor;

        return valorTotal;
    }

}
