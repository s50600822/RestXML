package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	 @PostMapping(path = "/save-cust-info" , consumes={MediaType.APPLICATION_XML_VALUE})
	    public String customerInformation(@RequestBody Customer cust) {
	        return "Customer information saved successfully ::." + cust.toString();
	    }
}