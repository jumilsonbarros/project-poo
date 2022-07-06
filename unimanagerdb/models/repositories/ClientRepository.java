package pt.iade.unimanagerdb.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.unimanagerdb.models.Client;

public interface ClientRepository extends CrudRepository <Client, Integer>{
    
}
