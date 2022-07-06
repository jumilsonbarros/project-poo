package pt.iade.unimanagerdb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TOrder")
public class TOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TOrder_id")
    private int id;

    @Column(name = "TOrder_price")
    private double price;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "product_id")
    private int product_id;

    @Column(name = "product_quantity")
    private int quantity;

    @Column(name = "client_streetname")
    private String streetname;





    //get order
    
    public TOrder() {
    }
    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getuser_id() {
        return user_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStreetname() {
        return streetname;
    }
  
}