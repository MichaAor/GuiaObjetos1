package com.company;

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private float salario;

    //CONSTRUCTORES
    public Empleado(){}
    public Empleado(int dni,String nombre,String apellido,float salario){
        this.dni = dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }

    //SET AND GET
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getDni() {
        return this.dni;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public float getSalario() {
        return this.salario;
    }

    //Metodos
    public float salAnual(){
        return this.salario * 12;
    }
    public void aumentarSal(float porcentaje){
        this.salario += (this.salario * (porcentaje / 100));
    }

    //Mostrar
    public void mostrarEmp(){
        System.out.println("//////////////////////\n" +
                "Empleado : " +
                "\nDNI: " + this.dni +
                "\nNOMBRE: " + this.nombre +
                "\nAPELLIDO: " + this.apellido +
                "\nSALARIO: " + this.salario +
                "\n//////////////////////\n");
    }
}
