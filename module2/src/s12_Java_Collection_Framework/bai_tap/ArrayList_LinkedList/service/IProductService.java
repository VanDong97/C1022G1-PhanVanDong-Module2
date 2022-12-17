package s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.service;

import s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;

public interface IProductService {

    void addProduct(Product product);

    void fixProduct(Product product, int id);

    void deleteProduct(int id);

    void displayProduct();

    void searchProduct(String name);

    void sortProduct();
}
