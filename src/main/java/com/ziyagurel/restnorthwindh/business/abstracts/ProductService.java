package com.ziyagurel.restnorthwindh.business.abstracts;

import com.ziyagurel.restnorthwindh.entities.concretes.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();
}
