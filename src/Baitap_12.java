import java.util.Scanner;

public class Baitap_12 {
    public static void main(String[] args) {
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
        System.out.print("Nhap so cot muon tinh tong:");
        int columIndex= scanner.nextInt();
        //Tính tổng các số trong cột xác định
        int sum=0;
        for (int i = 0; i < arrInt.length; i++) {
           if(columIndex>=0 && columIndex< arrInt[i].length){
               sum+=arrInt[i][columIndex];
           }
        }
        //In ra tổng của cột xác định
        System.out.println("Tong cua cot " + columIndex + " la: " + sum);
    }
}
