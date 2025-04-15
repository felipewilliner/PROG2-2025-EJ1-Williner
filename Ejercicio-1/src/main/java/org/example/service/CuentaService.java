package org.example.service;

import org.example.dto.Cuenta;
import org.example.dto.IGestionSaldo;

import java.util.ArrayList;
import java.util.List;

public class CuentaService {
    CuentaService instance;
    List<IGestionSaldo> cuentas;

    public CuentaService() {
        cuentas = new ArrayList<>();
    }

    public CuentaService getInstance() {
        if (instance == null) {
            instance = new CuentaService();
        }
        return instance;
    }

    public boolean agregarSaldo(int id, int monto) {
        IGestionSaldo cuenta = cuentas.stream().filter(x -> ((Cuenta) x).getId() == id).findFirst().orElse(null);
        if (cuenta == null) {
            return false;
        }
        cuenta.agregarSaldo(monto);
        return true;
    }

    public boolean quitarSaldo(int id, int monto) {
        IGestionSaldo cuenta = cuentas.stream().filter(x -> ((Cuenta) x).getId() == id).findFirst().orElse(null);
        if (cuenta == null) {
            return false;
        }

        return cuenta.quitarSaldo(monto);

    }

    public double getSaldo(int id) {
        IGestionSaldo cuenta = cuentas.stream().filter(x -> ((Cuenta) x).getId() == id).findFirst().orElse(null);
        if (cuenta == null) {
            return 0.0;
        }
        return cuenta.getSaldo();
    }

    public int getOperaciones(int id) {
        IGestionSaldo cuenta = cuentas.stream().filter(x -> ((Cuenta) x).getId() == id).findFirst().orElse(null);
        if (cuenta == null) {
            return 0;
        }
        return cuenta.getOperaciones();
    }


}
