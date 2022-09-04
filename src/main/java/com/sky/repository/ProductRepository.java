package com.sky.repository;

import java.util.List;

import com.sky.domain.Product;

public interface ProductRepository {
	public void addProduct(Product product);
	public List<Product> getProduct();
	public void deleteProduct(Product product);
	public Product getProductByID(String productID);
	public Product updateProductByID(Product tempProduct);
}
