package com.praveen.shethe.DomainLibraryManager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by Praveenkumar on 10/6/2020.
 */
@Entity
@Table(name = "items")
public class Item extends AbstractEntity {

    @Column(name = "item_name")
    private String itemName;

    @OneToOne(mappedBy = "item_id")
    private ItemCost itemCost;

    @Column(name = "manufacutured_date")
    private String manufacuturedDate;

    @Column(name = "use_before_date")
    private String useBeforeDate;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ItemCost getItemCost() {
        return itemCost;
    }

    public void setItemCost(ItemCost itemCost) {
        this.itemCost = itemCost;
    }

    public String getManufacuturedDate() {
        return manufacuturedDate;
    }

    public void setManufacuturedDate(String manufacuturedDate) {
        this.manufacuturedDate = manufacuturedDate;
    }

    public String getUseBeforeDate() {
        return useBeforeDate;
    }

    public void setUseBeforeDate(String useBeforeDate) {
        this.useBeforeDate = useBeforeDate;
    }
}
