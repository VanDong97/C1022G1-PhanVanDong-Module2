package ss2_Loop.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int snt = 2;
        while (snt < 100){
            int count = 0;
            for (int i = 1; i <= snt; i++) {
                if (snt % i == 0){
                    count ++;
                }
            }
            if (count == 2){
                System.out.println(snt);
            }
            snt ++;
        }
    }
}
