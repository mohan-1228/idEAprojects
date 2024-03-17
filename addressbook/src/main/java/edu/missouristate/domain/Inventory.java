package edu.missouristate.domain;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id", columnDefinition = "Integer")
    private Integer inventoryId;
    @Column(name = "sku", columnDefinition = "VARCHAR(9)")
    private String sku;
    @Column(name = "price", columnDefinition = "DOUBLE(10,2)")
    private Double price;
    @Column(name = "description", columnDefinition = "VARCHAR(1024)")
    private String description;
    @Column(name = "serial_id", columnDefinition = "Integer")
    private Integer serialId;
    @Column(name = "manufacture_number", columnDefinition = "VARCHAR(512)")
    private String manufactureNumber;

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSerialId() {
        return serialId;
    }

    public void setSerialId(Integer serialId) {
        this.serialId = serialId;
    }

    public String getManufactureNumber() {
        return manufactureNumber;
    }

    public void setManufactureNumber(String manufactureNumber) {
        this.manufactureNumber = manufactureNumber;
    }
}
