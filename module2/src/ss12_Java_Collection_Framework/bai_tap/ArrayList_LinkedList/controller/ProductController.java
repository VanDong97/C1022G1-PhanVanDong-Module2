package ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.controller;

import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;
import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.service.IProductService;
import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.service.ProductService;

import java.util.Scanner;

public class ProductController {


    public static void main(String[] args) {
        IProductService service = new ProductService();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("------- Product Manager -------");
            System.out.println("1 : addProduct");
            System.out.println("2 : updateProduct");
            System.out.println("3 : deleteProduct");
            System.out.println("4 : displayProduct");
            System.out.println("5 : searchProduct");
            System.out.println("6 : sortProduct");
            System.out.println("7 : Exit");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập ID :");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập name :");
                    String name = scanner.nextLine();
                    System.out.println("Nhập price");
                    int price = Integer.parseInt(scanner.nextLine());
                    Product product = new Product(id, name, price);
                    service.addProduct(product);
                    break;
                case 2:
                    System.out.println("Nhập ID ");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    Product p = service.findById(id1);
                    if (p != null) {
                        System.out.println("Nhập Name");
                        String newName = scanner.nextLine();
                        System.out.println("Nhập giá mới");
                        int newPrice = Integer.parseInt(scanner.nextLine());
                        p.setName(newName);
                        p.setPrice(newPrice);
                        service.update(p);
                    } else {
                        System.out.println("Not existed");
                    }
                    break;

                case 3:
                    System.out.println("Nhập ID");
                    id = Integer.parseInt(scanner.nextLine());
                    service.deleteProduct(id);
                    break;
                case 4:
                    service.displayProduct();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm");
                    name = scanner.nextLine();
                    service.searchProduct(name);
                    break;
                case 6:
                    service.sortProduct();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please input choice in menu");
            }
        } while (true);
    }
}

