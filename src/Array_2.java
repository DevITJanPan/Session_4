import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        // Khai bao va Khoi tao mang 2 chieu so nguyen gom n dong va m cot duoc nhap tu ban phim
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so dong cua mang 2 chieu:");
        int n=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao so cot cua mang 2 chieu:");
        int m=Integer.parseInt(scanner.nextLine());
        // Khoi tao mang 2 chieu
        int [][] arrInt=new int[n][m];
        // Nhap gia tri cac phan tu cua mang va in ra
        // i chay theo dong
        for (int i = 0; i < arrInt.length; i++) {
            // j chay theo cot
            for(int j=0;j< arrInt[i].length;j++){
                System.out.printf("arrInt[%d][%d]=",i,j);
                arrInt[i][j]=Integer.parseInt(scanner.nextLine());

            }

        }
        // In gia tri cac phan tu mang theo ma tran
        System.out.println("Ma tran cac phan tu cua mang la:");
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                System.out.printf("%d\t",arrInt[i][j]);
                System.out.printf("\n");

            }

        }
    }
}
