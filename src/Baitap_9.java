import java.util.Scanner;

public class Baitap_9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Tạo 2 mảng số với kích thước cho trước
        System.out.println("Nhập số lượng phần tử của mảng 1: ");
        int size1=Integer.parseInt(scanner.nextLine());
        int[] array1=new int[size1];
        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ":");
            array1[i]= scanner.nextInt();
        }
        System.out.println("Nhập số lượng phần tử của mảng 2:");
        int size2= scanner.nextInt();
        int[] array2=new int[size2];
        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array2[i]= scanner.nextInt();
        }
        //Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int[] array3=new int[size1+size2];
        // Gán các phần tử của mảng 1 vào mảng 3
        for (int i = 0; i < size1; i++) {
         array3[i]=array1[i];
        }
        //Gán các phần tử của mảng 2 vào mảng 3, tính từ vị trí size1 trong mảng 3
        for (int i = 0; i < size2; i++) {
          array3[size1+i]=array2[i];
        }
        //In ra mảng 3 sau khi gộp
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
