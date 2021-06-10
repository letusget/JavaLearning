import java.util.concurrent.ForkJoinWorkerThread;

public class Greeter {

    private static void greet(int cols)
    {
        StringBuilder sb= new StringBuilder();  //导入默认包
        for (int i=0;i<cols;i++)
        {
            sb.append("*");

        }
        System.out.print(sb.toString());
        System.out.println("");
        /**
        for (int i=0;i<cols;i++)
        {
            System.out.print("*");
        }
        System.out.println("");
        */


    }

    private static void greet(int cols,String words)  //重载版本
    {
        /**int length=String.length(word1);
        for (int i=0;i<cols;i++)
        {
            System.out.print("*");
        }
        System.out.println("");
         */


        int margin=(cols- words.length())/2;
        StringBuilder sb =new StringBuilder();
        sb.append("*");
       // System.out.print("*");

        for (int i=0;i<margin-1;i++)
            sb.append(" ");
        //System.out.print(sb.toString());

        sb.append(words);
        //System.out.print(words);


        for (int i=0;i<margin-1;i++)
            sb.append(" ");
        //System.out.print(" ");
        sb.append("*");
        System.out.print(sb.toString());

        System.out.println(" ");

    }


    public static void main(String[] args) {
        String word1="Welcome to Java";
        String word2="Nanjing Forestry University";
        int cols1 =word1.length();
        int cols2=word2.length();
        int length=cols2+4;

        greet(length);
        //System.out.println(word1);
        greet(length, " ");
        greet(length,word1);
        greet(length, " ");
        greet(length,word2);
        greet(length, " ");
        greet(length);
    }
}
