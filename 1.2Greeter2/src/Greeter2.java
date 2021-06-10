public class Greeter2 {
    private static void greet(int cols)
    {


         for (int i=0;i<=cols+1;i++)
         {
         System.out.print("*");
         }
         System.out.println("");

    }
    private static void greet(int cols,String words)  //重载版本
    {
        int margin=(cols- words.length())/2;
        System.out.print("*");
         for (int i=0;i<margin;i++)
         {
         System.out.print(" ");
         }
         System.out.print(words);
        for (int i=0;i<margin;i++)
        {
            System.out.print(" ");
        }
         System.out.println("*");

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
