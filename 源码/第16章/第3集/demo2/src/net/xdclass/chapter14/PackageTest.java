package net.xdclass.chapter14;

import java.util.ArrayList;
import java.util.List;

public class PackageTest {

    private static  Float f4;
    private static  float f5;

    public static void main(String [] args){

//        List<Integer> list = new ArrayList<>();

        int i1 = 0;
        Integer integer1 = new Integer(i1);
        Integer integer2 = new Integer(0);
        int a = integer1.intValue();


        Boolean booleanObj1 = new Boolean(false);

        boolean b = booleanObj1.booleanValue();

        Float f = new Float(1.2);
        float f1 = f.floatValue();

        Double d = new Double(1.03);
        double d1 =d.doubleValue();


        System.out.println(f4);
        System.out.println(f5);


    }

}
