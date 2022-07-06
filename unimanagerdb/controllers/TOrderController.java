package pt.iade.unimanagerdb.controllers;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.unimanagerdb.models.Carrinho;
import pt.iade.unimanagerdb.models.TOrder;
import pt.iade.unimanagerdb.models.repositories.TOrderRepository;

@RestController
@RequestMapping(path = "/api/torders")

public class TOrderController<Torder> {
    private Logger logger = LoggerFactory.getLogger(TOrderController.class);
    @Autowired
    private TOrderRepository torderRepository;

     
    @GetMapping(path = "/torders", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Carrinho> getCarrinho(){
        ArrayList<Carrinho> Carrinho;
        logger.info("Get " +Carrinho.size()+"carrinho");
        return Carrinho;
    }
    

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public TOrder saveTOrder(@RequestBody TOrder torder) {
        
        TOrder savedTOrder = torderRepository.save(torder);
        logger.info("Saving order with id " + savedTOrder.getId());
        return savedTOrder;
    }
}

