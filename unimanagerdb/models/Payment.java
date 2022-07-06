package pt.iade.unimanagerdb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Payment_id")
    private int id;

    @Column(name = "TOrder_price")
    private double price;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "Payment_method")
    private String product_id;

    @Column(name = "TOrder_id")
    private int TOrder_id;

    // gets payment

    public Payment() {

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

    public String getPayment_method() {
        return product_id;
    }

    public int getTOrder_id() {
        return TOrder_id;
    }

}
