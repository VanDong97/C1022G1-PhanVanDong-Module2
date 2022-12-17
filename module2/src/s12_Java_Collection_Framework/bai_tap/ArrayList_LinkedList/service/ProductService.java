package s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.service;

import s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;
import s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.repository.IProductRepostory;
import s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.repository.ProductRepostory;

public class ProductService implements IProductService {
    private IProductRepostory repostory = new ProductRepostory();

    @Override
    public void addProduct(Product product) {
        repostory.addProduct(product);
    }

    @Override
    public void fixProduct(Product product, int id) {
        repostory.fixProduct(product, id);
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
