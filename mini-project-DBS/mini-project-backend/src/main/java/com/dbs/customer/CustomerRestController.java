package com.dbs.customer;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.customer.entity.Customer;
import com.dbs.customer.repo.CustomerRepository;

@RestController
@CrossOrigin()
public class CustomerRestController {

	Logger logger=Logger.getLogger("Customer Controller");
	@Autowired
	private CustomerRepository repo;

	@GetMapping(path = "/customer/find/{customerid}", produces = { MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity findOne(@PathVariable("customerid") int id) {

		Optional<Customer> customerOp = repo.findById(id);
		if (customerOp.isPresent()) {
			logger.info("Customer Controller returning emp...");
			return ResponseEntity.ok(customerOp.get());
		} else {
			throw new CustomerNotFoundException(id);
			
		}
	}
	
	@GetMapping(path="/customer/list",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Customer>> listAll(){
		
		List<Customer> custList=repo.findAll();
		return ResponseEntity.ok(custList);
	}
	@PostMapping(value="/customer/save",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity save(@RequestBody Customer c) {
		System.out.println("called....");
		if(repo.existsById(c.getCustomerId())) {
			ResponseMessage message=new ResponseMessage(000,"Customer with the Given ID already exists");
			return ResponseEntity.ok(message);
		}else {
			repo.save(c);
			ResponseMessage message=new ResponseMessage(201,"Customer with the Given ID saved successfully");
			return ResponseEntity.ok(message);
		}
	}
	
	@DeleteMapping(value = "/customer/delete/{id}")
	public ResponseEntity deleteEmp(@PathVariable("id") int id) {
		System.out.println(id);
		repo.deleteById(id);
		return ResponseEntity.ok("{\"status\":\"deleted\"}");
		
	}
}
