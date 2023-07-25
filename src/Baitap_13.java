import java.util.Scanner;

public class Baitap_13 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);

//        // Nhập kích thước của ma trận
//        System.out.print("Nhập số hàng của ma trận: ");
//        int m = scanner.nextInt();
//        System.out.print("Nhập số cột của ma trận: ");
//        int n = scanner.nextInt();
//
//        // Tạo mảng hai chiều theo kích thước đã nhập
//        int[][] arrInt = new int[n][m];
//
//        // Nhập các giá trị cho ma trận
//        System.out.println("Nhập các phần tử của ma trận:");
//        for (int i = 0; i < arrInt.length; i++) {
//            for (int j = 0; j < arrInt[i].length; j++) {
//                System.out.printf("arrInt[%d][%d]=",i,j);
//                arrInt[i][j] = scanner.nextInt();
//            }
//        }
//        //In gia tri cac phan tu mang theo ma tran
//        System.out.println("Ma trận các phần tử của mảng là: ");
//        for (int i = 0; i < arrInt.length; i++) {
//            for (int j = 0; j < arrInt[i].length; j++) {
//                System.out.printf("%d\t",arrInt[i][j]);
//            }
//            System.out.printf("\n");
//        }
//        System.out.printf("\n");
//        // Tính tổng các số ở đường chéo chính
//        int sum=0;
//        for (int i = 0; i < arrInt.length; i++) {
//        sum+=arrInt[i][i];
//        }
//        //In ra tổng các số ở đường chéo chính
//        System.out.println("Tong cac so o duong cheo chinh la: " + sum);
        //Bước 1: Nhập số phần tử, khởi tạo mảng, nhập giá trị các phần tử
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng 2 chiều: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của mảng 2 chiều: ");
        int col = Integer.parseInt(scanner.nextLine());
        float[][] arrFloat = new float[row][col];
        System.out.println("Nhập giá trị các phần tử mảng 2 chiều: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arrFloat[%d][%d]=", i, j);
                arrFloat[i][j] = Float.parseFloat(scanner.nextLine());
            }
        }
//        In gia tri cac phan tu mang theo ma tran
        System.out.println("Ma trận các phần tử của mảng là: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%s\t",arrFloat[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        //Bước 2: Tính tổng các phần tử trên đường chéo chính
        //2.1. Kiểm tra ma trận có phải vuông hay không
        if (row == col) {
            //2.2. Khởi tạo biến tổng
            float sumChinh = 0;
            float sumPhu = 0;
            float sumBien = 0;
            //2.3. Duyệt các phần tử của mảng
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    //2.4. Chỉ số dòng = chỉ số cột --> PT nằm trên chéo chính --> cộng vào tổng
                    if (i==j){
                        sumChinh+=arrFloat[i][j];
                    }
                    if (i+j==row-1){
                        sumPhu+=arrFloat[i][j];
                    }
                    if (i==0||i==row-1||j==0||j==col-1){
                        sumBien+=arrFloat[i][j];
                    }
                }
            }
            //2.4. In ra giá trị tổng
            System.out.println("Tổng các phần tử nằm trên đường chéo chính: "+sumChinh);
            System.out.println("Tổng các phần tử nằm trên đường chéo phụ: "+sumPhu);
            System.out.println("Tổng các phần tử nằm trên đường biên: "+sumBien);
        } else {
            System.out.println("Ma trận không phải ma trận vuông, không có đường chéo chính");
        }
    }
}
