package ss6_Modifier_StaticMethod_StaticProperty.bai_tap.XayLopChiGhi;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.getName());

        System.out.println(student.getClasses());

        student.setName("Đồng");

        student.setClasses("C10");

        System.out.println(student.getName());

        System.out.println(student.getClasses());
    }
}
