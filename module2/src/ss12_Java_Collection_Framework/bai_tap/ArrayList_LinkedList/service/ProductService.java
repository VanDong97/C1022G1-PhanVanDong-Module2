package ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.service;

import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;
import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.repository.IProductRepostory;
import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.repository.ProductRepostory;

public class ProductService implements IProductService {
    private IProductRepostory repostory = new ProductRepostory();


    @Override
    public void addProduct(Product product) {
        repostory.addProduct(product);
    }

    @Override
    public Product findById(int id) {
        return repostory.findById(id);
    }

    @Override
    public void update(Product product) {
        repostory.update(product);
    }

    @Override
    public void deleteProduct(int id) {
        repostory.deleteProduct(id);
    }

    @Override
    public void displayProduct() {
        repostory.displayProduct();
    }

    @Override
    public void searchProduct(String name) {
        repostory.searchProduct(name);
    }

    @Override
    public void sortProduct() {
        repostory.sortProduct();
    }
}
