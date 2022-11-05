import java.util.stream.DoubleStream;

public class App {
    public static void main(String[] args) throws Exception {
        //Phần 1 : Khai báo biến
        int a = 5;
        //Phần 2 Khai báo mảng
        int[] arrNumbers;//Khai báo mảng và chưa sử dụng
        arrNumbers = new int[5];


        String arrNames[] = new String [9];
        String arrNames1[] = {"JAVA1","JAVA2","JAVA3"};//Khai báo không tường minh
        String arrNames2[] = new String [] {"JAVA1","JAVA2","JAVA3"};//Khai báo tường minh

        var arrTemp1 = new String[] {"JAVA1","JAVA2","JAVA3"};
        var arrTemp2 = new Double[] {5.6,7.2};
        int arrTemp3[],arrTemp4[] = new int[5];

        //Phần 3 : Gán giá trị thông qua index
        //arrNumbers = 5 ; Bên trái là kiểu dữ liệu mảng bên phải là giá trị đơn
        arrNumbers[0] = 9;//Gán giá trị vào index 0
        arrNumbers[1] = 91;
        arrNumbers[2] = 92;
        arrNumbers[3] = 93;
        arrNumbers[0] = 94;//Ghi đè giá trị vào index 0

        //Phần 4: Lấy giá trị -Ghi giá trị vào index nào thì lấy ra ở indẽ đó
        System.out.println((arrNumbers[2] + 1000));

        //In mảng 
        for (int i= 0; i< arrNumbers.length;i++){
            System.out.print(arrNumbers[i] + "");
        }
        System.out.println("");
        //foreach
        for(int x : arrNumbers){
            System.out.print(x + "");
        }
        System.out.println("");
        //In các phần tử lẻ 
        for(int x : arrNumbers){
            if(x % 2 !=0){
                continue;
            }
            System.out.print(x + "");
        }
        System.out.println("");
        for(int x : arrNumbers){
            System.out.print(((x % 2 != 0) ? x: "") + " ");
        }
    }
}
