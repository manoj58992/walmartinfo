package com.walmart.dummydata;

import java.util.HashMap;
import java.util.Map;
import com.walmart.dto.WalmartDTO;

public class WalmartDumData {

	public static Map<Integer, WalmartDTO> productsList;
	static {
		productsList = new HashMap<Integer, WalmartDTO>();

		WalmartDTO w = new WalmartDTO();
		w.setId(100);
		w.setName("nwalmart");
		w.setLocation("fairfax");
		w.setPhonenum("703-292-2829");
		w.setProducts("fruits,meat,drinks");
		productsList.put(100, w);

		WalmartDTO w1 = new WalmartDTO();
		w1.setId(200);
		w1.setName("jackson walmart");
		w1.setLocation("delaware");
		w1.setPhonenum("393-393-2919");
		w1.setProducts("milk,veg,gloceries");
		productsList.put(200, w1);

		WalmartDTO w2 = new WalmartDTO();
		w2.setId(300);
		w2.setName("head walmart");
		w2.setLocation("girald");
		w2.setPhonenum("949-292-9203");
		w2.setProducts("water,cake,toys");
		productsList.put(300, w2);

	}
}