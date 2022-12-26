package ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.cotroller;

import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;
import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.model.ProductManagement;
import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.service.IProductStreamService;
import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.service.ProductStreamService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProductStreamCotroller {
    public static void main(String[] args) {
        IProductStreamService service = new ProductStreamService();

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("-----Product Management----");
            System.out.println("1 : addProduct");
            System.out.println("2 : displayProduct");
            System.out.println("3 : searchProduct");
            System.out.println("4 : Exit");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    service.addProduct();
                    break;
                case 2:
                    service.displayProduct();
                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm");
                    String name = scanner.nextLine();
                    service.searchProduct(name);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please input choice in menu");
            }
        }while (true);
    }
}
