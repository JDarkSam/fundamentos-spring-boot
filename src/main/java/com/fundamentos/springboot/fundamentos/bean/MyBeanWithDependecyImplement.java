package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanWithDependecyImplement implements MyBeanWithDependecy{
    private MyOperation myOperation;
    public MyBeanWithDependecyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependecy() {
        int numero=1;
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola Desde la implementacion de un bean con dependecia");
    }
}
