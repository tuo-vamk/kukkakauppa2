package fi.vamk.tuo.kukkakauppa2.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "price")
    private Float price;

    public Product() {}

    public Product(Integer id, String name, String barcode, Float price) {
        this.id = id;
        this.name = name;
        this.barcode = barcode;
        this.price = price;
    }

    // Getterit ja setterit
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBarcode() { return barcode; }
    public void setBarcode(String barcode) { this.barcode = barcode; }

    public Float getPrice() { return price; }
    public void setPrice(Float price) { this.price = price; }

}