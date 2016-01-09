package com.properties.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.myBean.myBeanCreators.ProductCreatorMap;
import com.properties.items.Product;

public class ProductCreatorMapMains {

	public static void main(String[] args) {
		ApplicationContext context =new FileSystemXmlApplicationContext("beansMap.xml");
		ProductCreatorMap productcreate=(ProductCreatorMap) context.getBean("productCreator");
		Product aaa=productcreate.createProduct("AAA");
		System.out.println("Battery discount = " +aaa.getPrice());
		

	}

}
