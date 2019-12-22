package com.lhb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lhb.controller.ConstructorInjectedController;
import com.lhb.controller.NormalController;
import com.lhb.controller.PropertyInjectedController;
import com.lhb.controller.SetterInjectedController;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
@SpringBootApplication
public class GreetingsMain {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GreetingsMain.class, args);

		NormalController controller = (NormalController) ctx.getBean("normalController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
