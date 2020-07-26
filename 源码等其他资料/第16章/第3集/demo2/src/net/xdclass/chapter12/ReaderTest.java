package net.xdclass.chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderTest {

    public static  void main (String [] args) throws Exception {

       //test1();

        test2();

    }


    public static void test1()throws Exception {
        String dir = "C:\\Users\\79466\\Desktop\\test\\1.txt";

        File file = new File(dir);

        Reader input = new FileReader(file);

        int ch;
        while ( (ch = input.read())!=-1){

            System.out.print((char)ch);

        }
        input.close();
    }


    public static void test2()throws Exception {
        String dir = "C:\\Users\\79466\\Desktop\\test\\1.txt";

        File file = new File(dir);

        Reader input = new FileReader(file);

        char c[] = new char[1024];  //一次性读取

       int len =  input.read(c);

       System.out.println("内容为："+ new String(c,0,len));
       input.close();
    }






}
