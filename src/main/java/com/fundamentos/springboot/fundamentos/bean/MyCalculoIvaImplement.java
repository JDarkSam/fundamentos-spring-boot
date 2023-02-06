package com.fundamentos.springboot.fundamentos.bean;

public class MyCalculoIvaImplement implements MyCalculoIva {
    @Override
    public double calculoIva(double monto) {
        return monto * 0.19;
    }
}
