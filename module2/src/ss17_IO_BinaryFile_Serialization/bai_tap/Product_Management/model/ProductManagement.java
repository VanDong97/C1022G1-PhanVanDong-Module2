package ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.model;

import java.io.Serializable;

public class ProductManagement implements Comparable<ProductManagement> {
    private int id;
    private String name;
    private String company;
    private double price;
    private String color;

    public ProductManagement() {
    }

    public ProductManagement(int id, String name, String company, double price, String color) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(ProductManagement o) {
        return (int) (this.price - o.getPrice());
    }
}
