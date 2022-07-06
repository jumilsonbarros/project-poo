package pt.iade.unimanagerdb.controllers;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.unimanagerdb.models.Payment;
import pt.iade.unimanagerdb.models.repositories.PaymentRepository;

@RestController
@RequestMapping(path = "/api/payments")

public class PaymentController {
    private org.jboss.logging.Logger logger = LoggerFactory.logger(PaymentController.class);
    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Payment> getpayments() {
        logger.info("Sending all payments");
        return paymentRepository.findAll();
    }

}