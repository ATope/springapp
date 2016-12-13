package com.atope.springapp.repository;

import java.util.List;

import com.atope.springapp.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}