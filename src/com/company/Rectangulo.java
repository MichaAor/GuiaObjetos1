package com.company;

public class Rectangulo {
    //ATRIBUTOS
    private float ancho = 1.0f;
    private float alto = 1.0f;

    ///CONSTRUCTOR
    public Rectangulo (){}
    public Rectangulo(float ancho, float alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    //SET AND GET
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return this.ancho;
    }
    public float getAlto() {
        return this.alto;
    }

    //METODOS
    public float calc_area() {
        float area = this.ancho * this.alto;
        return (int) area;
    }
    public float calc_perimetro() {
       float perimetro = this.alto * 2 + this.ancho * 2;
    return perimetro;
    }
    //Mostrar
    public void mostrarRec(){
        System.out.println("//////////////////////\n" +
                "Los valores de su rectangulo : " +
                "\nAncho: " + this.ancho +
                "\nAlto: " + this.alto +
                "\nArea: " + this.calc_area() +
                "\nPerimetro: " + this.calc_perimetro() +
                "\n//////////////////////\n");
    }



}
