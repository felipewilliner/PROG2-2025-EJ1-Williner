package org.example.dto;

public class CajaDeAhorroBuilder implements CuentaBuilder {
    public int id;

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public CajaDeAhorro build() {
        return new CajaDeAhorro(id);
    }
}
