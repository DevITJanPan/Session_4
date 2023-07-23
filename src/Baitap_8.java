import java.util.Scanner;

public class Baitap_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int N = Integer.parseInt(scanner.next());
        int[] array = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập X là số cần chèn
        System.out.print("Nhập số cần chèn (X): ");
        int X = scanner.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.print("Nhập vị trí cần chèn (index): ");
        int index = scanner.nextInt();

        // Bước 4: Kiểm tra nếu index không hợp lệ thì hiển thị không chèn được phần tử vào mảng
        if (index < 0 || index > array.length) {
            System.out.println("Không chèn được phần tử vào mảng. ");
        } else {
            // Bước 5: Chèn phần tử X vào vị trí index vào mảng
            int[] newArray = new int[array.length + 1];
            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == index) {
                    newArray[i] = X;
                } else {
                    newArray[i] = array[j];
                    j++;
                }
            }

            // Bước 6: In ra mảng sau khi chèn
            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
    }
}
