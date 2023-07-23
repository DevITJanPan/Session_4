import java.util.Scanner;

public class Array_One {
    public static void main(String[] args) {
        // Khai báo mảng 1  chiều
        int[] arrayInt;
        // khởi tạo 1 chiều số nguyên gồm 5 phần tử
        arrayInt =new int[5];
        //
        String[] arrString=new String[3];
        //
        float[] arrFloat={5.7F, -6.8F};
        // Khởi tạo các giá trị cho các phần tử mảng arrInt
        arrayInt[0]=3;
        arrayInt[1]=6;
        arrayInt[2]=9;
        arrayInt[3]=2;
        arrayInt[4]=5;
        // In ra các giá trị của mảng arrInt
        System.out.println("Các phần tử trong mảng :");
        for(int element:arrayInt){
            System.out.printf("%d\t",element);
        }
        System.out.printf("\n");
        //
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<arrString.length;i++){
            System.out.println("Nhập vào giá trị phần tử "+(i+1));
            arrString[i]= scanner.nextLine();
        }
        //
        System.out.println("Các phần tử arrayString vừa nhập là :");
        for(int i=0; i<arrString.length;i++){
            System.out.printf("%s\t",arrString[i]);
        }
    }
}
