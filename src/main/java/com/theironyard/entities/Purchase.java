package com.theironyard.entities;
import javax.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Created by gilbertakpan on 1/14/17.
 */

@Entity
@Table(name = "purchase")
public class Purchase {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String date;

    @Column(nullable = false)
    String creditCard;

    @Column(nullable = false)
    int cvv;

    @Column(nullable = false)
    String category;

    @ManyToOne
    Customer customer;


    public Purchase(int id, String date, String creditCard, int cvv, String category, Customer customer) {
        this.id = id;
        this.date = date;
        this.creditCard = creditCard;
        this.cvv = cvv;
        this.category = category;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Purchase(String s, String s1, int i, String s2, Customer one) {
    }
}
