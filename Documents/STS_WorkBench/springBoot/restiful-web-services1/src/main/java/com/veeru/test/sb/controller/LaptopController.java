package com.veeru.test.sb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.veeru.test.sb.exception.CustomizedResponseEntityExceptionHandler;
import com.veeru.test.sb.exception.UserException;
import com.veeru.test.sb.exception.UserNotFoundException;
import com.veeru.test.sb.model.Laptop;
import com.veeru.test.sb.model.User;
import com.veeru.test.sb.service.LaptopService;

@RestController
@RequestMapping(value = "/laptop")
@ComponentScan(basePackages = {"com.veeru.test.sb.service","com.veeru.test.sb.exception"})
public class LaptopController {

	private static final Logger logger = LoggerFactory.getLogger(LaptopController.class);

	@Autowired
	LaptopService laptopService;

	// /laptop/insert
	@PostMapping(path = "/insert", consumes = "application/json", produces = "application/json")
	/*
	 * @PostMapping(path="/insert")
	 * 
	 * @Produces("application/json")
	 * 
	 * @Consumes("application/json")
	 */
	// @Valid , BindingResult bindingResult
	public Laptop insertLaptop(@RequestBody Laptop laptop) throws Exception {
		Laptop laptopData = new Laptop();
		// if(bindingResult !=null) {
		laptopData = laptopService.insertLaptop(laptop);
		// }

		return laptopData;
	}

	@PutMapping(path = "/update") // laptop/update
	public Laptop updateLaptap(@RequestBody Laptop laptop) throws Exception {
		Laptop laptopData = laptopService.updateLaptop(laptop);
		return laptopData;

	}

	@GetMapping("/get/{sNumber}") // /laptop/get/
	public ResponseEntity<Laptop> getLaptap(@PathVariable int sNumber) throws Exception  {
		logger.debug("entered into the getLaptap() method using serial number "+sNumber );
		Laptop laptop = null;
		
		laptop = laptopService.getLaptop(sNumber);
		
		if (laptop == null) {
			throw new Exception("sNumber is not found : ");
			//throw new UserNotFoundException("sNumber is not found : ", sNumber);
		}
		// orElseThrow(() -> new RecordNotFoundException("sNumber '" + sNumber + "' does
		// no exist"));

		return new ResponseEntity<Laptop>(laptop, HttpStatus.OK);

		// return laptop;

	}

	@GetMapping("/get") // /laptop/get
	public List<Laptop> getLaptop() throws Exception {
		List<Laptop> laptoplist = new ArrayList<>();
		laptoplist = laptopService.getLaptop();
		// throw new UserException();
		return laptoplist;

	}

	@DeleteMapping(path = "/delete/{sNumber}") // /laptop/delete/
	public String deleteLaptop(@PathVariable int sNumber) throws Exception {
		int rowDelete = laptopService.deleteLaptop(sNumber);
		if (rowDelete > 0) {
			return "The deleted Data from the DB successfully based CID";
		}
		return "The deleted Data from the DB is not successfully based CID";
	}

	@GetMapping("/get/ex") // /laptop/get/ex
	public Laptop getLaptopExceptionEx() throws Exception {
		Laptop laptop = null;

		// throw new UserException();
		if (laptop == null)
			throw new UserException("get laptop ExceptionEx() has Null");

		return laptop;

	}

	@GetMapping("/users/{id}") // /laptop/users/100
	public User retriveUser(@PathVariable int id) throws Exception {
		User user = laptopService.findOne(id);

		if (user == null) {
			// runtime exception
			throw new UserNotFoundException("ID is not found :: ", id);
		}

		return user;
	}

}
