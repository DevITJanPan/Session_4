import java.util.Scanner;

public class Baitap_3 {
    public static void main(String[] args) {
        int size;
        int[] arrInt;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("Nhập giá trị vào mảng :");
            size=Integer.parseInt(scanner.nextLine());
            if(size>20)
                System.out.println("Kích thước không được vượt quá 20");
        }while(size>20);
        arrInt=new int[size];
        int i=0;
        while(i< arrInt.length){
            System.out.print("Nhập vào số phần tử "+(i+1)+":");
            arrInt[i]=Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.print("Danh sách phần tử trong mảng :");
        for (int j = 0; j < arrInt.length ; j++) {
            System.out.print(arrInt[j] + "\t");
        }
        int max =arrInt[0];
        int index=1;
        for (int j = 0; j < arrInt.length; j++) {
          if(arrInt[j]>max) {
              max=arrInt[j];
              index=j+1;
          }
        }
        System.out.println("Giá trị lớn nhất trong mảng là "+ max + " tại vị trí "+index);
    }
}
