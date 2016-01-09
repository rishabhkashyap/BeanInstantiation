package com.myBean.myBeanCreators;

import java.util.Map;

import com.properties.items.Product;
//This class create beans using map collection
public class ProductCreatorMap {
	private Map<String, Product> products;

	public void setProducts(Map<String, Product> products) {
		this.products = products;
	}
	
	
	public Product createProduct(String productId){
		
		if(products.get(productId)!=null){
			return products.get(productId);
		}
		throw new IllegalArgumentException("Unknown product");
	}
}
