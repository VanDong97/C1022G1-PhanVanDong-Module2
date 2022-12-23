package ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.repository;

import ss17_IO_BinaryFile_Serialization.bai_tap.Product_Management.model.ProductManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductStreamRepossitory implements IProductStreamRepository{
    private static final String FILE_PATH = "E:\\C1022G1-PhanVanDong-module2\\module2\\src\\ss17_IO_BinaryFile_Serialization\\bai_tap\\Product_Management\\Product.dat";

    public static List<ProductManagement> readProduct(){
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

    public static void writerProduct(List<ProductManagement> productStreamList){
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

    static List<ProductManagement> productStreams = new ArrayList<ProductManagement>();

    static {
        ProductManagement productStream1 = new ProductManagement(1,"Audi1","AUDI",30,"White");
        ProductManagement productStream2 = new ProductManagement(2,"Audi3","AUDI",40,"Blue");
        ProductManagement productStream3 = new ProductManagement(3,"Audi4","AUDI",50,"Black");

        productStreams.add(productStream1);
        productStreams.add(productStream2);
        productStreams.add(productStream3);
    }

    @Override
    public void addProduct(ProductManagement productManagement) {
        productStreams.add(productManagement);
    }

    @Override
    public ProductManagement findById(int id) {
        for (ProductManagement pId : productStreams) {
            if (pId.getId() == id) {
                return pId;
            }
        }
        return null;
    }

    @Override
    public ProductManagement findByName(String name) {
        for (ProductManagement pName : productStreams){
            if (pName.getName() == name){
                return pName;
            }
        }
        return null;
    }

    @Override
    public ProductManagement findByCompany(String company) {
        for (ProductManagement pCompany : productStreams){
            if (pCompany.getCompany() == company){
                return pCompany;
            }
        }
        return null;
    }

    @Override
    public ProductManagement findByPrice(int price) {
        for (ProductManagement pPrice : productStreams){
            if (pPrice.getPrice() == price){
                return pPrice;
            }
        }
        return null;
    }

    @Override
    public ProductManagement findByColor(String color) {
        for (ProductManagement pColor : productStreams){
            if (pColor.getColor() == color){
                return pColor;
            }
        }
        return null;
    }

    @Override
    public void displayProduct() {
        for (int i = 0; i < productStreams.size(); i++) {
            System.out.println(productStreams.get(i));
        }
    }

    @Override
    public void searchProduct(String name) {
        for (int i = 0; i < productStreams.size(); i++) {
            if (productStreams.get(i).getName().equals(name)){
                System.out.println(productStreams.get(i));
            }
        }
    }
}
