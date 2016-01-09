package com.myBean.myBeanCreators;

import com.properties.items.Battery;
import com.properties.items.Disc;
import com.properties.items.Product;

//Uses static method to create beans

public class ProductorCreator {
	public static Product createProduct(String productId){
		if("aaa".equals(productId)){
			return new Battery("AAA",50,2.5);
		}else if("cdrw".equals(productId)){
			return new Disc("CD-RW", 40,20);
		}else if ("dvdrw".equals(productId)) {
			return new Disc("DVD-RW",  30,20);
		}
		throw new IllegalArgumentException("Unknown product");
	}

}
