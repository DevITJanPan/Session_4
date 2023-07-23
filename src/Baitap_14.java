import java.util.Scanner;

public class Baitap_14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //  Khai báo và gán giá trị cho chuỗi
        String inputString = "Rikkei Academy Fukuoka";
        System.out.println("Chuoi da cho: " + inputString);

        //  Khai báo và nhập giá trị cho ký tự cần đếm
        System.out.print("Nhap ky tu can dem: ");
        char targetChar = scanner.next().charAt(0);

        //  Khai báo và gán giá trị cho biến count
        int count = 0;

        //  Dùng vòng lặp duyệt từng ký tự trong chuỗi và đếm số lần xuất hiện của ký tự cần đếm
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                count++;
            }
        }

        // In ra kết quả
        System.out.println("So lan xuat hien cua ky tu " + targetChar + " trong chuoi la: " + count);
    }
}
