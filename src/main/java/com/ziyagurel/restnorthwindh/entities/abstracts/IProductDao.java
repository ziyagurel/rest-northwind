package com.ziyagurel.restnorthwindh.entities.abstracts;

import com.ziyagurel.restnorthwindh.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDao extends JpaRepository<Product,Integer> {

}
