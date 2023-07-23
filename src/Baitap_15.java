import java.util.Scanner;

public class Baitap_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khai báo và nhập giá trị cho mảng số nguyên bất kỳ
        System.out.print("Nhập số lượng phần tử trong mảng : ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];

        System.out.println("Nhập " + n + " số nguyên: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Bước 2: Tìm số lớn thứ 2 trong mảng
        int max1 = Integer.MIN_VALUE; // Lưu phần tử lớn nhất
        int max2 = Integer.MIN_VALUE; // Lưu phần tử lớn thứ 2

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1; // Gán max2 bằng giá trị của max1 trước khi gán max1 bằng phần tử mới
                max1 = arr[i]; // Gán max1 bằng phần tử mới
            } else if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i]; // Gán max2 bằng phần tử mới nếu nó lớn hơn max2 và nhỏ hơn max1
            }
        }

        // Kiểm tra nếu không tìm thấy phần tử lớn thứ 2
        if (max2 == Integer.MIN_VALUE) {
            System.out.println("Không tìm thấy phần tử lớn thứ hai trong mảng.");
        } else {
            System.out.println("Phần tử lớn thứ 2 trong mảng là: " + max2);
        }
    }
}
