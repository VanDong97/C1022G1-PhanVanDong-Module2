package ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.repository;

import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.model.ProductManagement;

public interface IProductStreamRepository {
    void addProduct();
    void displayProduct();
    void searchProduct(String name);
}
