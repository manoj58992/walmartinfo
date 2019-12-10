package com.walmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.dto.WalmartDTO;
import com.walmart.services.WalmartServices;

@RestController
@RequestMapping("/search")
public class WalmartController {

	@Autowired
	private WalmartServices walmartservices;

	@PostMapping(value = "/post")
	public void showPostProducts(@RequestBody WalmartDTO wd) {
		System.out.println(wd.toString());
	}

	@PutMapping(value = "/put")
	public void showPutProducts(@RequestBody WalmartDTO wd) {
		System.out.println(wd.toString());
	}

	@GetMapping(value = "/{id}/results")
	public WalmartDTO getWalmartById(@PathVariable(value = "id") Integer walmartid) {
		return walmartservices.getWalmartById(walmartid);
	}

	@GetMapping(value = "/all")
	public List<WalmartDTO> getAllProducts() {
		return walmartservices.getProducts();
	}

	@GetMapping(value = "/print")
	public WalmartDTO getWalmartByIdAgain(@RequestParam(value = "id", required = true) Integer walmartid) {
		return walmartservices.getWalmartById(walmartid);

	}

}
