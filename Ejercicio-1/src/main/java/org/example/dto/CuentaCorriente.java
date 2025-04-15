package org.example.dto;

public class CuentaCorriente extends Cuenta implements IGestionSaldo {
    public double giroDescubierto;

    public CuentaCorriente(double giroDescubierto, int id) {
        this.giroDescubierto = giroDescubierto;
        this.id = id;
    }


    @Override
    public synchronized boolean agregarSaldo(double monto) {
        saldo += monto;
        cantidadOperaciones++;
        return true;
    }

    @Override
    public synchronized boolean quitarSaldo(double monto) {
        if (giroDescubierto > (saldo - monto)) {
            return false;
        }
        saldo -= monto;
        cantidadOperaciones++;
        return true;
    }

    @Override
    public synchronized double getSaldo() {
        return saldo;
    }

    @Override
    public synchronized int getOperaciones() {
        return cantidadOperaciones;
    }
}
