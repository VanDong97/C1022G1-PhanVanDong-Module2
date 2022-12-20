package ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.repository;

import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepostory implements IProductRepostory {

    static List<Product> productsRepostory = new ArrayList<>();

    static {
        Product product1 = new Product(1, "Book", 15);
        Product product2 = new Product(2, "FLower", 10);
        Product product3 = new Product(3, "Laptop", 30);

        productsRepostory.add(product1);
        productsRepostory.add(product2);
        productsRepostory.add(product3);
    }


    @Override
    public void addProduct(Product product) {
        productsRepostory.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product p : productsRepostory) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void update(Product product) {
        for (int i = 0; i < productsRepostory.size(); i++) {
            if (productsRepostory.get(i).getId() == product.getId()) {
                productsRepostory.set(i, product);
                break;
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
