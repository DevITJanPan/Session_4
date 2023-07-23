import java.util.Scanner;

public class Baitap_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        System.out.println("Nhập số lượng phần tử của mảng :");
        int N=Integer.parseInt(scanner.nextLine());
        int [] array=new int[N];
        System.out.println("Nhập các phần tử của mảng :");
        for (int i = 0; i < N; i++) {
            System.out.print("Phần tử thứ "+(i+1)+":");
            array[i]= scanner.nextInt();
        }
        // Nhập X là phần tử cần xoá
        System.out.print("Nhập phần tử cần xoá (X):");
        int X= scanner.nextInt();
        //Tìm X trong mảng và lấy vị trí nếu có
        int index_del=-1;
        for (int i = 0; i < array.length; i++) {
           if(array[i]==X){
               index_del=i;
               break;
           }
        }
        //Thực hiện xoá phần tử X khỏi mảng (nếu có)
        if(index_del!=-1){
            for (int i = index_del; i < array.length-1; i++) {
             array[i] =array[i+1];
            }
            //Giảm kích thước mảng đi 1 sau khi xoá phần tử
            int[] newArray=new int[array.length-1];
            for (int i = 0; i < newArray.length; i++) {
             newArray[i]=array[i];
            }
            array=newArray;
        }else{
            System.out.println("Phần tử không tồn tại trong mảng.");
        }
        //In ra mảng sau khi xoá (nếu có)
        System.out.println("Mảng sau khi xoá phần tử:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"");
        }
    }
}