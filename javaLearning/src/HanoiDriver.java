public class HanoiDriver {
    public static void main(String[] args) {
        Hanoi Han=Hanoi.getHan();
        Han.move(5,'A','B','C');

    }

}

class Hanoi
{
    private Hanoi(){}  //私有化构造器

    private static Hanoi Han=new Hanoi();
    //提供属性变量用来初始化类
    public static Hanoi getHan()
    {
        return Han;
        //提供实现方法
    }

    public void move(int n,char source,char station,char target)
    {
        if (n==1)
        {
            show(1,source,target);
        }
        else
        {
            move(n-1,source,target,station);
            show(n,source,target);
            move(n-1,station,source,target);
        }
    }
    private void show(int n,char source,char target)
    {
        System.out.println("#" + n +" : "+source+"->"+target);
    }

}
