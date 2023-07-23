import java.util.Scanner;

public class Baitap_2 {
    public static void main(String[] args) {
        String[] studens={"Tuan","Anh","Trung","Thong","Lan"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào tên sinh viên :");
        String input_name= scanner.nextLine();
        boolean isExits=false;
        for (int i = 0; i < studens.length; i++) {
         if(studens[i].equals(input_name)) {
             System.out.println("Vị trí của các sinh viên trong danh sách"+input_name+"is:"+i);
             isExits=true;
             break;
         }
        }
        if(!isExits){
            System.out.println("không tìm thấy"+input_name+"trong danh sách.");
        }
    }
}
