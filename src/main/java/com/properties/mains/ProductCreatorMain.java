package com.properties.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.myBean.myBeanCreators.ProductorCreator;
import com.properties.items.Product;
//Create beans using static factory method
public class ProductCreatorMain {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
		Product AAA=ProductorCreator.createProduct("aaa");
		System.out.println("Product name = " +AAA.getName());

	}

}
