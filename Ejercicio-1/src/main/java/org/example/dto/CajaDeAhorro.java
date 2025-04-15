package org.example.dto;

public class CajaDeAhorro extends Cuenta implements IGestionSaldo {
    public CajaDeAhorro(int id) {
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
