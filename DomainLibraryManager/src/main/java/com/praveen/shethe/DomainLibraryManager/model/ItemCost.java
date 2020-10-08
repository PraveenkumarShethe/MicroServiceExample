package com.praveen.shethe.DomainLibraryManager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by Praveenkumar on 10/6/2020.
 */
@Entity
@Table(name = "itemcost")
public class ItemCost extends AbstractEntity{

    @Column(name = "iem")
    private Item item;

    @Column(name = "iem_cost")
    private BigDecimal itemCost;

    @Column(name = "model")
    private String model;

}
