package pt.iade.unimanagerdb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    @Column(name = "user_firstname")
    private String firstname;

    @Column(name = "user_lastname")
    private String lastname;

    @Column(name = "user_zipcode")
    private int zipcode;

    @Column(name = "user_streetname")
    private String streetname;

    @Column(name = "user_type")
    private String type;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_phonenumb")
    private int phonenumb;

    @Column(name = "user_genero")
    private String genero;

    

    // gets da tabela//

    public User() {
    }

    public String getStreetname() {
        return streetname;
    }

    public String getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }

    public int getPhonenumb() {
        return phonenumb;
    }

    public int getZipcode() {
        return zipcode;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGenero() {
        return genero;
    }

    
}
