package ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.service;

import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;
import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.model.ProductManagement;

public interface IProductStreamService {

    void addProduct();

    void displayProduct();

    void searchProduct(String name);

}
