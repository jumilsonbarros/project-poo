package pt.iade.unimanagerdb.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.unimanagerdb.models.User;

public interface UserRepository extends CrudRepository <User, Integer>{
    
}
