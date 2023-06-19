package com.springbootjwt.service;
import java.util.List;

import com.springbootjwt.model.OrderDetails;
import com.springbootjwt.model.Product;

//This Service interface class holds  business logical interface methods 
public interface ProductService 
	{
		//for adding an products
		Product addProduct(Product product);
		
		//for getting all the products by their name
		List<Product> getAllproductsByProductType(String productType);
		
		//to cancel the products from the system
		String  cancelProduct(int id);
		
		//for updating an product details
		Product updateProduct(int id, Product product);
	}
