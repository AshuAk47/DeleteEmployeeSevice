package com.spring.delete.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.delete.model.Emp;
import com.spring.delete.model.EmpRepository;

@RestController
@RequestMapping("/employee")
public class DeleteEmpController {
	@Autowired
	EmpRepository edao;


	@GetMapping("/delete")
	public ResponseEntity<String> delEmp(@RequestParam("eid") int eid) {
		try {
			Emp e = edao.findById(eid).orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found"));
			edao.delete(e);
			return new ResponseEntity<String>("Employee found and Deleted", HttpStatus.OK);
		} catch (EmployeeNotFoundException e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	public class EmployeeNotFoundException extends RuntimeException {
		public EmployeeNotFoundException(String message) {
			super(message);
		}
	}
	



	
}

