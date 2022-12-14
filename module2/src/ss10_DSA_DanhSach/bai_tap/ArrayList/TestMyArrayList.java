package ss10_DSA_DanhSach.bai_tap.ArrayList;

public class TestMyArrayList {
    public static class Student<student1> {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            Student student1 = new Student(1, "A");
            Student student2 = new Student(2, "B");
            Student student3 = new Student(3, "C");
            Student student4 = new Student(4, "D");
            Student student5 = new Student(5, "E");
            Student student6 = new Student(6, "F");

            MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
            MyArrayList<Student> newMyArrayList = new MyArrayList<>();
            studentMyArrayList.add(student1);
            studentMyArrayList.add(student2);
            studentMyArrayList.add(student3);
            studentMyArrayList.add(student4);
            studentMyArrayList.add(student5);
//            studentMyArrayList.add(student6, 4);

//            studentMyArrayList.clear();

            studentMyArrayList.size();

            System.out.println("size : " + studentMyArrayList.size());

            for (int i = 0; i < studentMyArrayList.size(); i++) {
                Student student = (Student) studentMyArrayList.elements[i];
                System.out.println(student.getId());
                System.out.println(student.getName());
            }

            System.out.println("phần tử được lấy ở vị trí 3 là : " + studentMyArrayList.get(3).getName());

            System.out.println("Vị trí của index là : " + studentMyArrayList.indexOf(student2));

            System.out.println(studentMyArrayList.contains(student6));

            newMyArrayList = studentMyArrayList.clone();

            newMyArrayList.remove(3);// xóa phần tử thứ 3

//            Student student = newMyArrayList.remove(2);
//            System.out.println(student.getName());


            for (int i = 0; i < newMyArrayList.size(); i++) {
                System.out.println(newMyArrayList.get(i).getName());
            }
        }
    }
}
