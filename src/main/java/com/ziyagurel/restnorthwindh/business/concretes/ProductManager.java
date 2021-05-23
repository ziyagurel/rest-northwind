package com.ziyagurel.restnorthwindh.business.concretes;

import com.ziyagurel.restnorthwindh.business.abstracts.IProductService;
import com.ziyagurel.restnorthwindh.entities.abstracts.IProductDao;
import com.ziyagurel.restnorthwindh.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements IProductService {
    private IProductDao dao;

    @Autowired
    public ProductManager(IProductDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Product> getAll() {
        return dao.findAll();
    }
}
