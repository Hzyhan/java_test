package net.xdclass.chapter12;

import java.io.*;

public class OutputStreamWriterTest {

    public static void main(String [] args)throws  Exception{

        test2("C:\\Users\\79466\\Desktop\\test\\9.txt");
    }



    public static  void test2(String path)throws Exception{
        //读取字节流
        InputStream in = new FileInputStream(path);

        InputStreamReader isr = new InputStreamReader(in,"GBK");
        //InputStreamReader isr = new InputStreamReader(in);

        BufferedReader reader = new BufferedReader(isr);
        String line;
        while ((line = reader.readLine())!= null){
            System.out.println(line);
        }
        isr.close();
        reader.close();

    }

    public static  void test1(String path)throws Exception{

        OutputStream out = new FileOutputStream(path);

        OutputStreamWriter osr = new OutputStreamWriter(out,"GBK");

        BufferedWriter bufw = new BufferedWriter(osr);

        String str = "欢迎来到小滴课堂xdclass.net";

        bufw.write(str);
        bufw.newLine();
        bufw.write("学习java课程");
        bufw.flush();
        bufw.close();




    }
}
