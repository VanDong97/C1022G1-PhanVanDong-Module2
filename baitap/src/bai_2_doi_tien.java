import java.util.Scanner;

public class bai_2_doi_tien {
    public static void main(String[] args) {
        int vnd = 23000;
        int usd;
        Scanner tienDo = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD muốn đổi");
        usd = tienDo.nextInt();
        int quydoi = usd * 23000;
        System.out.print("Số tiền đổi được là " + quydoi + "VND");
    }
}
