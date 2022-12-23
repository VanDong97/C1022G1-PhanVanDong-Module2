package ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.service;

import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;
import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.model.ProductManagement;

public class ProductStreamService implements IProductStreamService {
    private IProductStreamService iProductStreamService = new IProductStreamService() {
        @Override
        public void addProduct(Product product) {

        }

        @Override
        public Product findById(int id) {
            return null;
        }

        @Override
        public void findByName(String name) {

        }

        @Override
        public void findByCompany(String company) {

        }

        @Override
        public void findByPrice(int price) {

        }

        @Override
        public void findByColor(String color) {

        }

        @Override
        public void displayProduct() {

        }

        @Override
        public void searchProduct(String name) {

        }

        @Override
        public void addProduct(ProductManagement productManagement) {

        }
    };
        @Override
        public void addProduct(Product product) {
            iProductStreamService.addProduct(product);
        }

        @Override
        public Product findById(int id) {
            return iProductStreamService.findById(id);
        }

        @Override
        public void findByName(String name) {
            iProductStreamService.findByName(name);
        }

        @Override
        public void findByCompany(String company) {
            iProductStreamService.findByCompany(company);
        }

        @Override
        public void findByPrice(int price) {
            iProductStreamService.findByPrice(price);
        }

        @Override
        public void findByColor(String color) {
            iProductStreamService.findByColor(color);
        }

        @Override
        public void displayProduct() {
            iProductStreamService.displayProduct();
        }

        @Override
        public void searchProduct(String name) {
            iProductStreamService.searchProduct(name);
        }

    @Override
    public void addProduct(ProductManagement productManagement) {

    }
}
