package pt.iade.unimanagerdb.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.unimanagerdb.models.TOrder;

public interface TOrderRepository extends CrudRepository <TOrder, Integer> {
    
}
