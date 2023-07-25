import java.util.Scanner;

public class Baitap_7 {
    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        //Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
//        System.out.println("Nhập số lượng phần tử của mảng :");
//        int N=Integer.parseInt(scanner.nextLine());
//        int [] array=new int[N];
//        System.out.println("Nhập các phần tử của mảng :");
//        for (int i = 0; i < N; i++) {
//            System.out.print("Phần tử thứ "+(i+1)+":");
//            array[i]= scanner.nextInt();
//        }
//        // Nhập X là phần tử cần xoá
//        System.out.print("Nhập phần tử cần xoá (X):");
//        int X= scanner.nextInt();
//        //Tìm X trong mảng và lấy vị trí nếu có
//        int index_del=-1;
//        for (int i = 0; i < array.length; i++) {
//           if(array[i]==X){
//               index_del=i;
//               break;
//           }
//        }
//        //Thực hiện xoá phần tử X khỏi mảng (nếu có)
//        if(index_del!=-1){
//            for (int i = index_del; i < array.length-1; i++) {
//             array[i] =array[i+1];
//            }
//            //Giảm kích thước mảng đi 1 sau khi xoá phần tử
//            int[] newArray=new int[array.length-1];
//            for (int i = 0; i < newArray.length; i++) {
//             newArray[i]=array[i];
//            }
//            array=newArray;
//        }else{
//            System.out.println("Phần tử không tồn tại trong mảng.");
//        }
//        //In ra mảng sau khi xoá (nếu có)
//        System.out.println("Mảng sau khi xoá phần tử:");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+"");
//        }
        /*
         * 1. Nhập số phần tử của mảng 1 chiều số nguyên
         * 2. Khởi tạo mảng
         * 3. Nhập giá trị các phần tử của mảng
         * 4. Nhập giá trị phần tử cần xóa trong mảng
         * 5. Thực hiện xóa các phần tử trong mảng và in mảng
         * */
        //Bước 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int arraySize = Integer.parseInt(scanner.nextLine());
        //Bước 2
        int[] arrInt = new int[arraySize];
        //Bước 3
        System.out.println("Nhập giá trị các phần tử của mảng: ");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("arrInt[%d]=", i);
            arrInt[i] = Integer.parseInt(scanner.nextLine());
        }
        //Bước 4
        System.out.println("Nhập giá trị cần xóa trong mảng:");
        int deleteValue = Integer.parseInt(scanner.nextLine());
        //Bước 5: Thực hiện xóa tất cả các phần tử trong mảng có giá trị là deleteValue
        //5.1. Tìm các chỉ số các phần tử trong mảng bằng deleteValue --> mảng arrIndexDelete
        int[] arrIndexDelete = new int[arrInt.length];
        int cntElement = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i]==deleteValue){
                //Lưu chỉ số phần tử
                arrIndexDelete[cntElement] = i;
                //Tăng đếm các phần tử cần xóa
                cntElement++;
            }
        }
        //5.2. Xóa các phần tử trong mảng arrInt
        if (cntElement>0){
            //Thực hiện xóa
            //5.2.1. Khởi tạo mảng mới gồm arrInt.lengh - cntElement phần tử
            int[] arrIntNew = new int[arrInt.length-cntElement];
            //5.2.2. Copy toàn bộ các phần tử còn lại từ arrInt --> mảng mới
            int indexNew = 0;
            //Duyệt mảng arrInt để xóa
            for (int i = 0; i < arrInt.length; i++) {
                //Duyệt chỉ số phần tử để xóa xem i có phải là phần tử cần xóa hay không
                boolean checkIndexDelete = false;
                for (int j = 0; j < cntElement; j++) {
                    if (i==arrIndexDelete[j]){
                        checkIndexDelete = true;
                        break;
                    }
                }
                if (!checkIndexDelete){
                    //Phần tử i không phải phần tử phải xóa --> copy sang mảng mới
                    arrIntNew[indexNew] = arrInt[i];
                    indexNew++;
                }
            }
            //In ra giá trị các phần tử mảng mới
            System.out.println("Giá trị các phần tử trong mảng mới là: ");
            for (int i = 0; i < indexNew; i++) {
                System.out.printf("%d\t",arrIntNew[i]);
            }
            System.out.printf("\n");
            //In ra số phần tử của mảng mới
            System.out.println("Độ dài mảng sau khi xóa là: "+indexNew);
        }else{
            System.out.println("Không tìm thấy giá trị nào để xóa");
        }
    }
}