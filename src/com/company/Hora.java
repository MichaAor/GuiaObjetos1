package com.company;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora() {
    }

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void mostrarHora(Hora hs) {
        if (hs.hora > 9 && hs.minutos > 9 && hs.segundos > 9) {
            System.out.println("Su hora es: " + hs.hora + ":" + hs.minutos + ":" + hs.segundos);
        } else {
            if (hs.hora < 10) {
                if (hs.minutos < 10) {
                    if (hs.segundos < 10) {
                        System.out.println("Su hora es: 0" + hs.hora + ":0" + hs.minutos + ":0" + hs.segundos);
                    } else {
                        System.out.println("Su hora es: 0" + hs.hora + ":0" + hs.minutos + ":" + hs.segundos);
                    }
                } else {
                    if (hs.segundos < 10) {
                        System.out.println("Su hora es: 0" + hs.hora + ":" + hs.minutos + ":0" + hs.segundos);
                    } else {
                        System.out.println("Su hora es: 0" + hs.hora + ":" + hs.minutos + ":" + hs.segundos);
                    }
                }
            } else {
                if (hs.minutos < 10) {
                    if (hs.segundos < 10) {
                        System.out.println("Su hora es: " + hs.hora + ":0" + hs.minutos + ":0" + hs.segundos);
                    } else {
                        System.out.println("Su hora es: " + hs.hora + ":0" + hs.minutos + ":" + hs.segundos);
                    }
                } else {
                    if (hs.segundos < 10) {
                        System.out.println("Su hora es: " + hs.hora + ":" + hs.minutos + ":0" + hs.segundos);
                    } else {
                        System.out.println("Su hora es: " + hs.hora + ":" + hs.minutos + ":" + hs.segundos);
                    }
                }
            }
        }
    }

    public Hora avanzar(Hora hs) {
        if(hs.segundos == 59){
            if(hs.minutos == 59){
                if (hs.hora == 23){
                    hs.hora = 00;
                    hs.minutos =00;
                    hs.segundos = 00;
                }else{

                }
            }
        }
    }


}
