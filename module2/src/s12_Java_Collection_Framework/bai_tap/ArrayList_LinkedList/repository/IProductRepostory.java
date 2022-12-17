package s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.repository;

import s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;

public interface IProductRepostory {

    void addProduct(Product product);

    void fixProduct(Product product, int id);

    void deleteProduct(int id);

    void displayProduct();

    void searchProduct(String name);

    void sortProduct();
}
