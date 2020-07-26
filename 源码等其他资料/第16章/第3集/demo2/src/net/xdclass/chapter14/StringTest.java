package net.xdclass.chapter14;

public class StringTest {

    public static void main(String [] args){

//        String str1 = new String("xdclass.net");
//        String str2 ="xdclass.net";
//        String str3 ="xdclass.net";
//
//        System.out.println(str1==str2);
//        System.out.println(str3==str2);
//        System.out.println(str1.equals(str2));


//
//        String str1 = new String("   xdclass.net  ");
//        String str2 ="XDclass.net";
//        String str = "小滴课堂xdclass.net";
//        //获取字符串长度:
//        System.out.println(str.length());
//
//        //通过下标获取字符：
//        char ch = str.charAt(5);
//        System.out.println(ch);
//
//        //字符串比较：
//        boolean result1 = str1.equals(str2);
//        System.out.println(result1);
//
//        //字符串比较忽略大小写
//        boolean result2 = str1.equalsIgnoreCase(str2);
//        System.out.println(result2);
//
//        //查找字符串出现的位置
//        int index = str.indexOf(".");
//        System.out.println(index);
//
//        //字符串截取
//        String result3 = str.substring(index);
//        System.out.println(result3);
//        //左闭右开
//        String result4 = str.substring(1, 3);
//        System.out.println(result4);
//
//        //字符串拆分, 注意特殊字符
//        //String [] arr = str.split("\\.");
//        String [] arr = str.split("x");
//        System.out.println(arr.length);
//
//        //字符串替换
//        String tempDir = str.replace("x","a");
//        System.out.println(tempDir);
//
//        //字符串大小写转换
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//
//        //字符串去除空格
//        System.out.println(str1.length());
//        System.out.println(str1.trim().length());






        boolean bool = Boolean.getBoolean("false"); //字符串类型转换为布尔类型
       int integer = Integer.parseInt("20"); //字符串类型转换为整形
      long LongInt = Long.parseLong("1024"); //字符串类型转换为长整形
      float f = Float.parseFloat("1.521"); //字符串类型转换为单精度浮点型
      double d = Double.parseDouble("1.52123");//字符串类型转换为双精度浮点型


    }
}
