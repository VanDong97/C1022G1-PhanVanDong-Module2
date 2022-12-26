package ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.ProductFile;

import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.model.ProductManagement;

import java.io.*;
import java.util.List;

public class ProductFile {
    private static final String FILE_PATH = "E:\\C1022G1-PhanVanDong-module2\\module2\\src\\ss17_IO_BinaryFile_Serialization\\bai_tap\\Product_Management\\Product.dat";

    public static List<ProductManagement> readProduct() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<ProductManagement> ProductList = null;
        try {
            ProductList = (List<ProductManagement>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ProductList;
    }

    public static void writerProduct(List<ProductManagement> productStreamList) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectOutputStream.writeObject(productStreamList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
