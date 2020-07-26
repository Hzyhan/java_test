package net.xdclass.chapter14;

public class MathTest {

    public static void main(String [] args){



        //计算平方根
//        System.out.println(Math.sqrt(16));
//
//        //计算立方根
//        System.out.println(Math.cbrt(8));
//
//
//        //两个数的最大，支持 int, long, float, double
//       System.out.println(Math.max(2.9,4.5));
//       System.out.println(Math.min(2.9,4.5));
//
//       //ceil向上取整，更大的值方向靠拢，中文是天花板
//        System.out.println(Math.ceil(19.7));
//        System.out.println(Math.ceil(-20.1));
//
//        //floor向下取整，更小的值方向靠拢，中文是地板
//        System.out.println(Math.floor(19.7));
//        System.out.println(Math.floor(-20.1));
//
//        //随机数, 小于1大于等于0的double类型的数
//        System.out.println(Math.random());

        //产生1到10的随机数，int方法进行转换会去掉小数点后的数字，只获得整数部分，不是四舍五入

        for(int i=0; i<50;i++){
            //int random = (int)(Math.random()*10+1);   //不加1的结果0,1,2,3,4,5,6,7,8,9
            int random = (int)(Math.random()*10+1);   //加1的结果1,2,3,4,5,6,7,8,9,10
            System.out.println(random);

        }




    }
}
