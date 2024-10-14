package com.ust.factorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Factorial")
public class FactorialController {
	@GetMapping("/of/{num}")
	public int getFact(@PathVariable int num) {
		int res = 1;
		for(int i=2;i<=num;i++) res*= i;
		return res;
	}
	

}
