package com.praveen.shethe.DomainLibraryManager.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Praveenkumar on 10/6/2020.
 */
@Entity
@Table(name = "customer")
public class Customer extends AbstractEntity {

    private String name;

    private String middleName;

    private String lastName;

    private String userName;

    private String email;

    private String mobileNo;



}
