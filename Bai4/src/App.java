import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //1 Xuất ra màn hình
        System.out.print("Tôi muốn học giỏi JAVA1");
        System.out.println("tại ngành PTPM");
        System.out.print("năm 2020\t FPOLY\n");
        // In theo template
        String name ="Dũng";
        System.out.printf("Tôi là :%s Sinh Năm:%d sẽ không phải là người chép code",name,2000);//Truyền đổ dữ liệu vào đúng thứ tự và đúng kiểu dữ liệu
        System.out.println("Tôi là :"+ name +"Sinh Năm:" + 2000 + "sẽ không phải là người chép code");
        //Nhập dữ liệu từ bàn phím 
        //Viết 1 chương trình nhập tên và in ra
        //Bước 1 khai báo 1 thu viện Scanner
        Scanner sc = new Scanner(System.in);
        //Bước 2 xác định số lượng biến cần sử dụng
        String name1= "Đạt";
        //Bước 3 Gán giá trị vào cho bieedns và howngs dẫn người dùng
        System.out.println("Mòi bạn nhập tên:");
        name1 =sc.nextLine();//Gán giá trị do nguoif dùng nhập vào cho biến .scc.
        //Bước 4 Thưc thi 
        System.out.printf("Chào bạn :%s",name1);

    }
}
