package net.xdclass.chapter12;

import java.io.*;

public class InputStreamReaderTest {


    public static void main(String [] args)throws  Exception{

        test1("C:\\Users\\79466\\Desktop\\test\\8.txt");
    }


    public static  void test1(String path)throws Exception{
        //读取字节流
        InputStream in = new FileInputStream(path);

        //InputStreamReader isr = new InputStreamReader(in,"GBK");
        InputStreamReader isr = new InputStreamReader(in);

        BufferedReader reader = new BufferedReader(isr);
        String line;
        while ((line = reader.readLine())!= null){
            System.out.println(line);
        }
        isr.close();
        reader.close();

    }

}
