public class arrayApp {
    public static void main(String[] args) {
        int [][] array=new int[10][10];
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("输入行数：");
            int row = scanner.nextInt();
            System.out.println("输入列数:");
            int column = scanner.nextInt();
            System.out.println("请输入内容:");
            int value = scanner.nextInt();
            array[row][column]=value;
            for (int i = 0; i <array.length ; i++) {
                for (int j = 0; j <array[0].length ; j++) {

                    System.out.print(array[i][j]+"----");
                }
                System.out.println();
            }
        }
    }
}
