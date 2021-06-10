import java.util.Scanner;

public class ConverterDriver {
  public static void main(String[] args) {
    //获取键盘输入的类
      Scanner scanner=new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("\t\t进制转换程序运行中");
        System.out.println("==========================================");

      System.out.print("请输入要进行进制转换的十进制数： ");
      int num=scanner.nextInt();  //读入数据
      Converter con=new Converter(num);
      System.out.println("要进行进制转换的十进制数的值为："+con.getValue());
      System.out.println();

        while (true)
        {
            System.out.println("==========================================");
            System.out.println("\t1. 转换为二进制");
            System.out.println("\t2. 转换为八进制");
            System.out.println("\t3. 转换为十六进制");
            System.out.println("\t4. 转换为任意进制");
            System.out.println("\t0. 退出");
            System.out.println("==========================================");

            System.out.println("请输入您的选择： ");
            int choice=scanner.nextInt();
            while (choice!=0&&choice!=1&&choice!=2&&choice!=3&&choice!=4)
            {
                System.out.print("输入错误，请重新输入：");
                choice=scanner.nextInt();
            }

            int base=3;  //任意进制的初始值
            switch (choice)
            {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    con.toBin();
                    break;
                case 2:
                    con.toOct();
                    break;
                case 3:
                    con.toHex();
                    break;
                case 4:
                    System.out.print("请输入您要转换的进制：");
                    base=scanner.nextInt();
                    con.toBase(base);
                    break;
                default:
                    System.out.println("Error!!");
                    break;
            }

         }


  }
}
