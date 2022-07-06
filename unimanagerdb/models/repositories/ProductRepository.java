package pt.iade.unimanagerdb.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.unimanagerdb.models.Product;

public interface ProductRepository extends CrudRepository <Product, Integer>{
    
}
