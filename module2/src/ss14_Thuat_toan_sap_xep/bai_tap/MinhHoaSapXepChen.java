package ss14_Thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class MinhHoaSapXepChen {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int num = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > num) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = num;
        }
    }

    static void arr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 8, 15, 10, 16, 9, 4};
        System.out.println("Mảng ban đầu " + Arrays.toString(arr));

        MinhHoaSapXepChen insertionSort = new MinhHoaSapXepChen();

        insertionSort.sort(arr);

        System.out.println("Mảng sau khi được sắp xếp :" + Arrays.toString(arr));

    }
}
