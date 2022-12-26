package ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.repository;

import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.ProductFile.ProductFile;
import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.model.ProductManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStreamRepossitory implements IProductStreamRepository {


    static List<ProductManagement> productStreams1 = new ArrayList<>();

    static {
        ProductManagement productStream1 = new ProductManagement(1, "Audi1", "AUDI", 30, "White");
        ProductManagement productStream2 = new ProductManagement(2, "Audi3", "AUDI", 40, "Blue");
        ProductManagement productStream3 = new ProductManagement(3, "Audi4", "AUDI", 50, "Black");

        productStreams1.add(productStream1);
        productStreams1.add(productStream2);
        productStreams1.add(productStream3);

    }


    @Override
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        String name, company, color;
        int id, price;
        System.out.println("Input ID : ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name : ");
        name = scanner.nextLine();
        System.out.println("Input company : ");
        company = scanner.nextLine();
        System.out.println("Input price : ");
        price = Integer.parseInt(scanner.nextLine());
        System.out.println("Input color : ");
        color = scanner.nextLine();
        ProductManagement productManagement = new ProductManagement();
        productManagement.setId(id);
        productManagement.setName(name);
        productManagement.setCompany(company);
        productManagement.setPrice(price);
        productManagement.setColor(color);
        productStreams1.add(productManagement);
        ProductFile.writerProduct(productStreams1);
    }

    @Override
    public void displayProduct() {
        for (ProductManagement pm : ProductFile.readProduct()) {
            System.out.println(pm);
        }
    }

    @Override
    public void searchProduct(String name) {
        for (ProductManagement pm : ProductFile.readProduct()) {
            if (pm.getName().contains(name)) {
                System.out.println(pm);
            }
        }
    }
}
