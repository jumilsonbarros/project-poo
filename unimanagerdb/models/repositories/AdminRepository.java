package pt.iade.unimanagerdb.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.unimanagerdb.models.Admin;

public interface AdminRepository extends CrudRepository <Admin, Integer> {
    
}