package com.company;

public class CuentaBanco {
    private int id;
    private String nombre;
    private float balance;

    public void setID(int ID) {
        this.id = ID;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getID() {
        return this.id;
    }
    public String getNombre() {
        return this.nombre;
    }
    public float getBalance() {
        return this.balance;
    }

    public CuentaBanco(){}
    public CuentaBanco(int id,String nombre,float balance){
        this.id=id;
        this.nombre=nombre;
        this.balance=balance;
    }

    public float credito(float deposito){
    return this.balance + deposito;
    }
    public float debito(float sustraccion){
        float aux = this.balance;
        if(sustraccion>this.balance){
            System.out.println("El valor a sustraer es mayor al balance de la cuenta,no se cubre lo pedido,operacion cancelada");
        }else{
            aux = this.balance - sustraccion;
        }
        return aux;
    }

    public void mostrarCuenta(){
        System.out.println("//////////////////////\n" +
                "CUENTA: " +
                "\nID: " + this.id +
                "\nNOMBRE: " + this.nombre +
                "\nBALANCE: " + this.balance +
                "\n//////////////////////\n");
    }


}
