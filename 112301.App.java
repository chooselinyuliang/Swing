import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while(true){
            Scanner scanner =new Scanner(System.in);
            int userNum=scanner.nextInt();
            int x,y;
            if (userNum==1){
                x=(int)(Math.random()*100);
                y=(int)(Math.random()*100);
                System.out.println("坐标("+x+"，"+y+")");
             }else {
                 System.out.println("错误:请输入数字1！");
            }
        }
    }
}
