package com.walmart.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import com.walmart.dto.WalmartDTO;
import com.walmart.dummydata.WalmartDumData;

@RestController
@Service
public class WalmartServices {
	public WalmartDTO getWalmartById(Integer id) {
		return WalmartDumData.productsList.get(id);
	}

	public List<WalmartDTO> getProducts() {
		ArrayList<WalmartDTO> valueList = new ArrayList<WalmartDTO>(WalmartDumData.productsList.values());

		return valueList;
	}

}
