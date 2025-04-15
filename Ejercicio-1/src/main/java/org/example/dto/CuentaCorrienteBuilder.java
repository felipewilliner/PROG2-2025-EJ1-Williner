package org.example.dto;

public class CuentaCorrienteBuilder implements CuentaBuilder {
    public int id;
    public double giroDescubierto;

    public void setGiroDescubierto(double giroDescubierto) {
        this.giroDescubierto = giroDescubierto;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public CuentaCorriente build() {
        return new CuentaCorriente(giroDescubierto, id);
    }


}
