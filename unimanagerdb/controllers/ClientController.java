package pt.iade.unimanagerdb.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.unimanagerdb.models.Client;
import pt.iade.unimanagerdb.models.repositories.ClientRepository;

@RestController
@RequestMapping(path = "/api/clients")
@Component
public class ClientController {
    private Logger logger = LoggerFactory.getLogger(ClientController.class);
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Client> getClients() {
        logger.info("Sending all clients");
        return clientRepository.findAll();
    }
}