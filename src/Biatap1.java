import java.util.Scanner;

public class Biatap1 {
    public static void main(String[] args) {
        /*
         * bài tập ứng dụng 1:
         * 1. Nhập vào số phần tử (n) của mảng từ bàn phím
         * 2. Khai báo và khởi tạo mảng 1 chiều kiểu số nguyên gồm n phần tử
         * 3. Xây dựng menu và thực hiện các chức năng theo menu
         * ********Menu*********
         * 1. Nhập giá trị cho các phần tử của mảng
         * 2. In ra giá trị các phần tử của mảng
         * 3. In ra giá trị các phần tử là số chẵn
         * 4. In ra các chỉ số của các phần tử có giá trị là lẻ
         * 5. Tính tổng các phần tử của mảng
         * 6. Thoát
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n=Integer.parseInt(scanner.nextLine());
        int[] arrInt=new int[n];

        do{
            System.out.println("* ********Menu*********");
            System.out.println("1. Nhập giá trị cho các phần tử của mảng");
            System.out.println("2. In ra giá trị các phần tử của mảng");
            System.out.println("3. In ra giá trị các phần tử là số chẵn");
            System.out.println("4. In ra các chỉ số của các phần tử có giá trị là lẻ");
            System.out.println("5. Tính tổng các phần tử của mảng");
            System.out.println("6. Thoát");
            System.out.println("Lựa chọn của  bạn là :");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    for (int i = 0; i < arrInt.length; i++) {
                        System.out.println("Nhập giá trị phần tử thứ " + (i + 1));
                        arrInt[i]=Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng là:");
                    for (int element:arrInt) {
                        System.out.printf("%d\t",element);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    System.out.println("Các phần tử có giá trị chẵn trong mảng :");
                    for (int element:arrInt) {
                      if(element%2==0){
                          System.out.printf("%d\t",element);
                      }
                    }
                    System.out.printf("\n");
                    break;
                case 4:
                    System.out.println("Chỉ số các phần tử có giá trị lẻ là:");
                    for (int i = 0; i < arrInt.length; i++) {
                     if(arrInt[i]%2==1){
                         System.out.printf("%d\t",i);
                     }
                    }
                    System.out.printf("\n");
                    break;
                case 5:
                    int sum=0;
                    for (int i = 0; i < arrInt.length; i++) {
                     sum+=arrInt[i];
                    }
                    System.out.println("Tổng các phần tử trong mảng là:"+sum);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println(" Vui lòng chọn từ 1-6.");
            }
        }while (true);
    }
}

