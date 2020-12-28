package com.dbs.customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CustomerNotFoundExceptionHandler {

	@ExceptionHandler(CustomerNotFoundException.class)
	@ResponseBody
	//@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ResponseEntity handleEmpNotFoundException(CustomerNotFoundException ex){
		return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
}
