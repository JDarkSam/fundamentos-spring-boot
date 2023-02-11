package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependecy;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.springboot.fundamentos.bean.MyCalculoIva;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import com.fundamentos.springboot.fundamentos.component.ComponentTwoImplement;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;

	private MyBeanWithDependecy myBeanWithDependecy;
    private MyCalculoIva myCalculoIva;
	private MyBeanWithProperties myBeanWithProperties;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependecy myBeanWithDependecy,MyCalculoIva myCalculoIva, MyBeanWithProperties myBeanWithProperties){
		this.componentDependency = componentDependency;
		this.myBean=myBean;
		this.myBeanWithDependecy=myBeanWithDependecy;
		this.myCalculoIva = myCalculoIva;
		this.myBeanWithProperties=myBeanWithProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependecy.printWithDependecy();
		double valorIva = myCalculoIva.calculoIva(15000);
		System.out.println("El valor de IVA es: "+valorIva);
		System.out.println(myBeanWithProperties.function());
	}
}
