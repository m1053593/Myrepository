package com.mindtree.Jms2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	//List<String> l=new ArrayList<String>();
	@JmsListener(destination = "objectQueue")
	public void receive(String msg)
	{
		 System.out.println("Message Received\n\n");
		System.out.println(msg);
	}
	

}
