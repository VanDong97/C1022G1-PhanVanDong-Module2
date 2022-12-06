package ss5_Class_Object.bai_tap;

public class Car {
    int modelYear;
    String modelName;

    public void run(){
        System.out.println("My Car " + " " + modelName + "is running");
    }

    public Car(int modelYear,String modelName){
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    public static void main(String[] args) {
        Car myCar = new Car(1987,"TOYOTA");
        System.out.println(myCar.modelName + " " + myCar.modelYear);
//        System.out.println(myCar.run(););
    }
}
