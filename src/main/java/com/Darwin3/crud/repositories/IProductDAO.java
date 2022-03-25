package com.Darwin3.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.Darwin3.crud.models.ProductDTO;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {
	
	
}