package pt.iade.unimanagerdb.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.unimanagerdb.models.Admin;
import pt.iade.unimanagerdb.models.repositories.AdminRepository;


@RestController
@RequestMapping(path = "/api/admins")
@Component

    public class AdminController {
        private Logger logger = LoggerFactory.getLogger(AdminController.class);
        @Autowired
        private AdminRepository adminRepository;
    
        @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
        public Iterable<Admin> getAdmins() {
            logger.info("Sending all admins");
            return adminRepository.findAll();
        }
        @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
        public Admin saveAdmin(@RequestBody Admin admin) {
            Admin savedAdmin = adminRepository.save(admin);
            logger.info("Saving admin with id "+savedAdmin.getId());
            return savedAdmin;
        }
    }

