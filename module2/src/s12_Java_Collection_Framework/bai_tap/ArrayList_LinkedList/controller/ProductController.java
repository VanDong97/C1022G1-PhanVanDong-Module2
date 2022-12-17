package s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.controller;

import s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;
import s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.service.IProductService;
import s12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService service = new ProductService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int select = 0;

        do {
            System.out.println("------- Product Manager -------");
            System.out.println("1 : addProduct");
            System.out.println("2 : fixProduct");
            System.out.println("3 : deleteProduct");
            System.out.println("4 : displayProduct");
            System.out.println("5 : searchProduct");
            System.out.println("6 : sortProduct");
            System.out.println("7 : Exit");

            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
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
                    System.out.println("Nhập ID cần sửa:");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập ID mới :");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên sản phẩm ");
                    name = scanner.nextLine();
                    System.out.println("Nhập price");
                    price = Integer.parseInt(scanner.nextLine());
                    Product product1 = new Product(id1, name, price);
                    service.fixProduct(product1, id);
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
            }
        } while (true);
    }
}

