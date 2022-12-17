package s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.repository;

import s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductRepostory implements IProductRepostory {

    List<Product> productsRepostory = new ArrayList<>();

    Product product1 = new Product(1, "Book", 15);
    Product product2 = new Product(2, "FLower", 10);
    Product product3 = new Product(3, "Laptop", 30);

    {
        productsRepostory.add(product1);
        productsRepostory.add(product2);
        productsRepostory.add(product3);
    }


    @Override
    public void addProduct(Product product) {
        productsRepostory.add(product);
    }

    @Override
    public void fixProduct(Product product, int id) {
        for (int i = 0; i < productsRepostory.size(); i++) {
            if (productsRepostory.get(i).getId() == id) {
                productsRepostory.set(productsRepostory.indexOf(productsRepostory.get(i)), product);
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        for (int i = 0; i < productsRepostory.size(); i++) {
            if (productsRepostory.get(i).getId() == id) {
                productsRepostory.remove(productsRepostory.get(i));
            }
        }
    }

    @Override
    public void displayProduct() {
        for (int i = 0; i < productsRepostory.size(); i++) {
            System.out.println(productsRepostory.get(i));
        }
    }

    @Override
    public void searchProduct(String name) {
        for (int i = 0; i < productsRepostory.size(); i++) {
            if (productsRepostory.get(i).getName().equals(name)) {
                System.out.println(productsRepostory.get(i));
            }
        }
    }

    @Override
    public void sortProduct() {
        Collections.sort(productsRepostory);
    }
}
