package com.praveen.shethe.DomainLibraryManager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by Praveenkumar on 10/6/2020.
 */
@Entity
@Table(name = "cart")
public class Cart extends AbstractEntity {

    @Column(name = "cart_name")
    private String cartName;

    @Column
    @OneToOne
    private Customer customer;

}
