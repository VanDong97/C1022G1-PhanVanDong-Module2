package ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.repository;

import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.model.ProductManagement;

public interface IProductStreamRepository {

    void addProduct(ProductManagement productStream);

    ProductManagement findById (int id);

   ProductManagement findByName (String name);

   ProductManagement findByCompany (String company);

   ProductManagement findByPrice (int price);

    ProductManagement findByColor (String color);

    void displayProduct();

    void searchProduct(String name);
}
