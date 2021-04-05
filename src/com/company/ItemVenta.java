package com.company;

public class ItemVenta {
    private int id;
    private String descripcion;
    private int cantidad;
    private float precioUnitario;

    public ItemVenta(){}
    public ItemVenta(int id,String descripcion,int cantidad,float precioUnitario){
        this.id=id;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getId() {
        return this.id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    public float getPrecioUnitario() {
        return this.precioUnitario;
    }


    public float precioTot(){
        return this.cantidad * this.precioUnitario;
    }
    public void mostrarItemVenta(){
        System.out.println("//////////////////////\n" +
                "Item de Venta : " +
                "\nID: " + this.id +
                "\nDESCRIPCION: " + this.descripcion +
                "\nCANTIDAD: " + this.cantidad +
                "\nPRECIO UNITARIO: " + this.precioUnitario +
                "\nPRECIO TOTAL: " + this.precioTot() +
                "\n//////////////////////\n");

    }
}
