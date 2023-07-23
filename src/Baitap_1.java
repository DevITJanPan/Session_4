import java.util.Scanner;

public class Baitap_1 {
    public static void main(String[] args) {
        int size;
        int[] arrInt;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số phần tử của mảng :");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20)
                System.out.println("Kích thước không vượt quá 20");
        } while (size > 20);
        arrInt = new int[size];
        int i = 0;
        while (i < arrInt.length) {
            System.out.println("Nhập số phần tử " + (i + 1));
            arrInt[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < arrInt.length; j++) {
            System.out.print(arrInt[j] + "\t");
        }
        for (int j = 0; j < arrInt.length / 2; j++) {
            int temp = arrInt[j];
            arrInt[j] = arrInt[size - 1 - j];
            arrInt[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < arrInt.length; j++) {
            System.out.print(arrInt[j] + "\t");
        }
    }
}
