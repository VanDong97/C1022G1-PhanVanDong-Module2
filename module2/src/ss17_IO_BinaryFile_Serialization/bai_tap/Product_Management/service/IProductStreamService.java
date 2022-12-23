package ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.service;

import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;
import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.model.ProductManagement;

public interface IProductStreamService {

    void addProduct(Product product);

    Product findById (int id);

    void findByName (String name);

    void findByCompany (String company);

    void findByPrice (int price);

    void findByColor (String color);

    void displayProduct();

    void searchProduct(String name);

    void addProduct(ProductManagement productManagement);
}
