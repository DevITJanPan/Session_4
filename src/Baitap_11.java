import java.util.Scanner;

public class Baitap_11 {
    public static void main(String[] args) {
        int Size=5;
        int[] arr = new int[Size];

        Scanner scanner = new Scanner(System.in);

        //  Nhập giá trị cho các phần tử trong mảng từ bàn phím
        System.out.println("Nhap " + Size + " so nguyen: ");
        for (int i = 0; i < Size; i++) {
            arr[i] = scanner.nextInt();
        }
        // Gán phần tử đầu tiên trong mảng là giá trị nhỏ nhất
        int minValue = arr[0];

        // Duyệt mảng từ phần tử thứ 2 đến hết mảng
        for (int i = 1; i < Size; i++) {
            // So sánh lần lượt các phần tử tiếp theo với giá trị nhỏ nhất
            if (arr[i] < minValue) {
                // Gán giá trị nhỏ nhất là phần tử tiếp theo nếu nó nhỏ hơn giá trị nhỏ nhất hiện tại
                minValue = arr[i];
            }
        }

        // In ra giá trị nhỏ nhất
        System.out.println("Gia tri nho nhat trong mang la: " + minValue);


    }
}

