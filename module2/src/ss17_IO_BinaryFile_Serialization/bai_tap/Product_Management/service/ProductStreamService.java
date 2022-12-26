package ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.service;


import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.repository.IProductStreamRepository;
import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.repository.ProductStreamRepossitory;

public class ProductStreamService implements IProductStreamService{
    IProductStreamRepository iProductStreamRepository = new ProductStreamRepossitory();


    @Override
    public void addProduct() {
        iProductStreamRepository.addProduct();
    }

    @Override
    public void displayProduct() {
        iProductStreamRepository.displayProduct();
    }

    @Override
    public void searchProduct(String name) {
        iProductStreamRepository.searchProduct(name);
    }
}
