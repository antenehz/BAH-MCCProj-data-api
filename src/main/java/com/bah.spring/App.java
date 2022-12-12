package com.bah.spring;


import com.bah.spring.domain.Customer;
import com.bah.spring.repository.CustomersRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {
	@Autowired
	CustomersRepository customersRepository;
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer test = new Customer();
		test.setId("10");
		test.setName("Santos");
		test.setEmail("Santos@bah.com");
		test.setPassword("pass");

		customersRepository.save(test);

		List<Customer> allCustomers = customersRepository.findAll();
		for(Customer c: allCustomers) {
			System.out.println(c.toString());
		}
	}
}
