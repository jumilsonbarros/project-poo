package pt.iade.unimanagerdb.controllers;

import java.util.logging.Logger;

import org.apache.tomcat.util.http.parser.MediaType;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.unimanagerdb.models.Carrinho;
import pt.iade.unimanagerdb.models.repositories.CarrinhoRepository;

@RestController
@RequestMapping(path = "/api/carrinhos")
@Component
public class CarrinhoController {
    private org.jboss.logging.Logger logger = LoggerFactory.logger(CarrinhoController.class);
    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Carrinho> getCarrinho() {
        logger.info("Sending all carrinhos");
        return carrinhoRepository.findAll();
    }
}