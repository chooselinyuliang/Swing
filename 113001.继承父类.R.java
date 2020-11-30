public class R {
    static void sout(){
        String boy_filePath="img/boy.gif";
        String girl_filePath="img/girl.gif";
        int [][]array2d={{1,2,3},{4,5,6}};

        System.out.println(boy_filePath+"\n"+girl_filePath);

        int i,j;
        for (i=0; i<array2d.length; ++i)
        {
            for (j=0; j<array2d.length+1; ++j)
            {
                System.out.print(array2d[i][j]);
            }
        }


    }
}
