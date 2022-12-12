package ss8_Absclass_Interface.bai_tap.Interface_Colorable;

import ss7_Inheritance_KeThua.bai_tap.Cricle_Cylinder.Cricle;

public class Test {
    public static void main(String[] args) {
        Geometry2[] geometry2s = new Geometry2[2];
        geometry2s[0] = new Square7(true, "red", 5);
        geometry2s[1] = new Rectangle(false, "violet", 5, 10);

        System.out.println(geometry2s[0]);
        System.out.println(geometry2s[1]);
    }
}
