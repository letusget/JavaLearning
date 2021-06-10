public class FactDriver {
  public static void main(String[] args) {
    //单例模式实现
    Factorial Fact=Factorial.getInstance();
    Fact.calculate(5);
    Fact.getFact();
  }
}

class Factorial {
  private static Factorial instance;
  private Factorial() {}  //内部不要放任何东西
      /**
       * 以单例模式实现类，以惰性方式创建类
       */
     private long pri;  //存放要计算初始值的数字
      private long temp;  //存放计算完成后的结果

  public static synchronized Factorial getInstance()
  {
      if (instance==null)
      {
          instance=new Factorial();
      }
      return instance;
  }

   public long calculate(int n)
  {
      pri=n;
     long result=1;
      if (n==0||n==1)
      {
          result=1;
      }
      else
      {
          for (int i=n;i>=2;i--)
          {
              result=result*i;
          }
      }
       temp = result;
      return result;
  }

  public void getFact()
  {
      System.out.println(pri+"! = "+temp);
        //输出计算结果
  }


}
