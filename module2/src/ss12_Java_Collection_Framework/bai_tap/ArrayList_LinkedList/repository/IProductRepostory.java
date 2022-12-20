package ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.repository;

import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;

public interface IProductRepostory {

    void addProduct(Product product);

    Product findById(int id);

    void update(Product product);

    void deleteProduct(int id);

    void displayProduct();

    void searchProduct(String name);

    void sortProduct();
}
