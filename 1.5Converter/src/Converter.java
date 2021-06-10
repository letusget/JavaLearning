public class Converter {
    public Converter()
    {//默认构造器

    }
    public Converter(int value)
    {
        this.value=value;
    }

    public int getValue()  //访问器，获得value的值
    {
        return value;

    }



    public String toBase(int base)
    {//将当前缓存的值转换为参数base所指定的进制数的字符并返回
        //输出base进制数
        String str = "";
        //逆序取余法
        int n=getValue();
        while(n!=0)
        {
            str = n%base+str;  //使用字符串拼接实现逆序取余
            n = n/base;
        }

        System.out.print("Base = "+base+","+value+" => ");
        for (int i=0;i<str.length();i++)
        {//按照字符串单个字符输出
            System.out.print(str.charAt(i));  //输出字符串中的单个字符
            if (i==str.length()-1)
            {
                break;
            }
            System.out.print("_");
        }
        System.out.println();

        return str;


    }


     public String toBin()
    {//将当前缓存值转换为二进制字符串返回
        String str = "";
        //逆序取余法
        int n=getValue();
        while(n!=0)
        {
            str = n%2+str;  //使用字符串拼接实现逆序取余
            n = n/2;
        }
        //参考：https://www.cnblogs.com/vsign/p/7290594.html
          //System.out.println(str);
        System.out.print("Base = 2,"+value+" => ");
        for (int i=0;i<str.length();i++)
        {//按照字符串单个字符输出
            System.out.print(str.charAt(i));  //输出字符串中的单个字符
            if (i==str.length()-1)
            {//因为要保证_ 的个数要比字符的个数少，所以就在输出完最后一个数字之和，就可以结束循环了
                break;
            }
            System.out.print("_");
        }
        System.out.println();

        return str;
     }


     public String toOct()
    {//将当前缓存值转换为八进制字符串返回
        String str = "";
        //逆序取余法
        int n=getValue();
        while(n!=0)
        {
            str = n%8+str;  //使用字符串拼接实现逆序取余
            n = n/8;
        }

        System.out.print("Base = 8,"+value+" => ");
        for (int i=0;i<str.length();i++)
        {//按照字符串单个字符输出
            System.out.print(str.charAt(i));  //输出字符串中的单个字符
            if (i==str.length()-1)
            {
                break;
            }
            System.out.print("_");
        }
        System.out.println();

        return str;

    }

     public String toHex()
    {//将当前缓存值转换为十六进制字符串返回
        /**
        String str = "";

        //逆序取余法
        int n=getValue();
        while(n!=0)
        {
            str = n%16+str;  //使用字符串拼接实现逆序取余
            n = n/16;
        }
         //这里十六进制实现有个很大的问题，由于是字符串，它无法识别十六进制中的两位数，没办法正确输出
*/
        String str= Integer.toHexString(getValue());
        //这里使用默认的转换函数，就可以将十六进制中的两位数转换为一位的字母，可以很方便的按字符输出
        System.out.print("Base = 16,"+value+" => ");
        for (int i=0;i<str.length();i++)
        {//安装字符串单个字符输出
            System.out.print(str.charAt(i));  //输出字符串中的单个字符
            if (i==str.length()-1)
            {
                break;
            }
            System.out.print("_");

        }
        System.out.println();

        return str;
    }






    private int value;  //缓存从构造方法得到的整数参数

}
