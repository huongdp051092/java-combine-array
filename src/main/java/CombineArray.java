import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap gia tri cho mang thu nhat tai vi tri arr1[" + i + "]");
            arr1[i] = scanner.nextInt();
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.println("Nhap gia tri cho mang thu nhat tai vi tri arr2[" + j + "]");
            arr2[j] = scanner.nextInt();
        }

        int[] arr3 = combine(arr1, arr2);
        System.out.println("Mang thu 3 bao gom cac phan tu la");
        for (int k : arr3) {
            System.out.print(k);
            System.out.print("\t");
        }
    }

    public static int[] combine(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        int count = arr1.length;
        for (int j = 0; j < arr2.length; j++) {
            arr3[count] = arr2[j];
            count++;
        }
        return arr3;
    }
}
