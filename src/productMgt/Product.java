package productMgt;

import providerMgt.Provider;

import java.time.LocalDate;

public class Product {
    long id;
    static long lastId=0;
    String label;
    double price;
    LocalDate fabricationDate;
    LocalDate expirationDate;
    String description;
    Provider idProvider;
    //byte[] photo;
    String photo;
    long stock;

    public Product(long stock, String label, Provider idProvider, double price, LocalDate fabricationDate, LocalDate expirationDate, String description, String photo) {
        this.id =++lastId;
        this.stock=stock;
        this.label = label;
        this.price = price;
        this.fabricationDate = fabricationDate;
        this.expirationDate = expirationDate;
        this.description = description;
        this.photo = photo;
        this.idProvider=idProvider;
    };

    public Provider getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(Provider idProvider) {
        this.idProvider = idProvider;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public Product(){
        id =++lastId;
        this.stock=0;
        this.label="";

        this.price=0;
        this.fabricationDate=null;
        this.expirationDate=null;
        this.description="";
        this.photo="";
    };

    public long getId() {
        return id;
    }

    public static long getLastId() {
        return lastId;
    }

    public static void setLastId(long lastId) {
        Product.lastId = lastId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(LocalDate fabricationDate) {
        this.fabricationDate = fabricationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!label.equals(product.label)) return false;
        if (!fabricationDate.equals(product.fabricationDate)) return false;
        return expirationDate.equals(product.expirationDate);
    }

    @Override
    public int hashCode() {
        int result = label.hashCode();
        result = 31 * result + fabricationDate.hashCode();
        result = 31 * result + expirationDate.hashCode();
        return result;
    }



}