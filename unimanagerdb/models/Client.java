package pt.iade.unimanagerdb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private int id;


    @Column(name = "client_NIF")
    private int NIF;

    @Column(name = "client_zipcode")
    private int zipcode;

    @Column(name = "client_streetname")
    private String streetname;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "client_type")
    private String client_type;


    //gets clients
    
    public Client(){

    }

    public int getId() {
        return id;
    }

    public int getNIF() {
        return NIF;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getstreetname() {
        return streetname;
    }

    public int getuser_Id() {
        return id;
    }
    public String getclient_type() {
        return client_type;
    }
}

 