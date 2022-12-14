package com.bah.spring;


import com.bah.spring.domain.Customer;
import com.bah.spring.domain.Event;
import com.bah.spring.repository.CustomersRepository;
import com.bah.spring.repository.EventRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class App {
	@Autowired
	EventRepository eventRepository;
	public static void main(String[] args)  {
		SpringApplication.run(App.class, args);
	}

	// ADD implements CommandLineRunner

//	// ADD a customer
//	@Override
//	public void run(String... args) throws Exception {
//		Customer test = new Customer();
//		test.setName("Santos");
//		test.setEmail("Santos@bah.com");
//		test.setPassword("pass");
//
//		customersRepository.save(test);
//
//		List<Customer> allCustomers = customersRepository.findAll();
//		for(Customer c: allCustomers) {
//			System.out.println(c.toString());
//		}
//	}

//	//ADD EVENT
//	@Override
//	public void run(String... args) throws Exception {
//		Event test = new Event();
//		test.setCode("1");
//		test.setTitle("Secret Santa");
//		test.setDescription("festive holiday fun");
//
//		eventRepository.save(test);
//
//		List<Event> allEvents = eventRepository.findAll();
//		for(Event c: allEvents) {
//			System.out.println(c.toString());
//		}
//	}
}
