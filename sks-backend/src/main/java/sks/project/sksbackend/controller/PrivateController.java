package sks.project.sksbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {
	
	@GetMapping
	public String Private() {
		
		return "From private endpoint";
	}
	
	

}
