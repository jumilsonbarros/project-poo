package pt.iade.unimanagerdb.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.unimanagerdb.models.Payment;

public interface PaymentRepository extends CrudRepository <Payment, Integer>{
    
}

