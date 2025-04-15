package org.example.dto;

public class Cuenta {
    protected double saldo;
    public int id;
    public int cantidadOperaciones;

    public Cuenta() {
        this.saldo = 0.00;
    }

    public int getId() {
        return id;
    }
}
