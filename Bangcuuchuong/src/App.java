import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Mời nhập bảng cửu chương :");
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", n, i, n * i);
        }
 }
}

