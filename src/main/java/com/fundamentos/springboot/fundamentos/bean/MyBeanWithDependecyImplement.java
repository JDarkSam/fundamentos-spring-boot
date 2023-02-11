package com.fundamentos.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependecyImplement implements MyBeanWithDependecy{

    Log LOGGER= LogFactory.getLog(MyBeanWithDependecyImplement.class);
    private MyOperation myOperation;
    public MyBeanWithDependecyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependecy() {
        LOGGER.info("Hemos ingresado al metodo printWithDependecy");
        int numero=1;
        LOGGER.debug("El numero mandado como parametro a la dependencia operation es:"+ numero);
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola Desde la implementacion de un bean con dependecia");
    }
}
