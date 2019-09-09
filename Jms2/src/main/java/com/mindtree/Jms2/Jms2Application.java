package com.mindtree.Jms2;

import javax.jms.ConnectionFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;



@SpringBootApplication
@EnableJms
@ComponentScan(basePackages= {"com.mindtree.Jms2"})
public class Jms2Application {
	
	   @Bean
	   public JmsListenerContainerFactory<?>
	         jmsListenerContainerFactory
	         (ConnectionFactory connectionFactory,
	          DefaultJmsListenerContainerFactoryConfigurer
	            configurer) {
	      DefaultJmsListenerContainerFactory factory =
	         new DefaultJmsListenerContainerFactory();
	      configurer.configure(factory, connectionFactory);
	      return factory;
	   }

	public static void main(String[] args) {
		 SpringApplication.run(Jms2Application.class, args);
	  
	
	}

}
