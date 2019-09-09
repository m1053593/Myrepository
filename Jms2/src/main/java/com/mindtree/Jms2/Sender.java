package com.mindtree.Jms2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sender {
	
	  @Autowired
	   private JmsTemplate jmsTemplate;
	  
	  @PostMapping("/send")
	  public void send(@RequestBody Employee emp)
	  {    
		  System.out.println("Sending object....");
		  jmsTemplate.convertAndSend("objectQueue",emp.toString());
	  }

}
