import java.util.Scanner;

public class Baitap_10 {
    public static void main(String[] args) {
//        // Ma trận mẫu có sẵn
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        // Biến lưu giá trị lớn nhất và tọa độ tương ứng
//        int maxElement = matrix[0][0];
//        int row = 0;
//        int col = 0;
//
//        // Duyệt qua từng phần tử trong ma trận để tìm giá trị lớn nhất
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] > maxElement) {
//                    maxElement = matrix[i][j];
//                    row = i;
//                    col = j;
//                }
//            }
//        }
//
//        // Hiển thị kết quả tìm thấy được
//        System.out.println("Phần tử lớn nhất trong ma trận: " + maxElement);
//        System.out.println("Tọa độ: [" + row + "][" + col + "]");

        Scanner scanner=new Scanner(System.in);

        // Nhập kích thước của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int n = scanner.nextInt();

        // Tạo mảng hai chiều theo kích thước đã nhập
        int[][] arrInt = new int[n][m];

        // Nhập các giá trị cho ma trận
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                System.out.printf("arrInt[%d][%d]=",i,j);
                arrInt[i][j] = scanner.nextInt();
            }
        }
        //In gia tri cac phan tu mang theo ma tran
        System.out.println("Ma trận các phần tử của mảng là: ");
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                System.out.printf("%d\t",arrInt[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");

        // Tìm phần tử lớn nhất và tọa độ tương ứng
        int max_Element = arrInt[0][0];
        int rows = 0;
        int cols = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arrInt[i][j] > max_Element) {
                    max_Element = arrInt[i][j];
                    rows = i;
                    cols = j;
                }
            }
        }

        // Hiển thị kết quả tìm thấy được
        System.out.println("Phần tử lớn nhất trong ma trận: " + max_Element);
        System.out.println("Tọa độ: [" + rows + "][" + cols + "]");
    }
}
