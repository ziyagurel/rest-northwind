package com.ziyagurel.restnorthwindh.api.controllers;

import com.ziyagurel.restnorthwindh.business.abstracts.IProductService;
import com.ziyagurel.restnorthwindh.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private IProductService service;

    @Autowired
    public ProductsController(IProductService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return service.getAll();

    }
}
