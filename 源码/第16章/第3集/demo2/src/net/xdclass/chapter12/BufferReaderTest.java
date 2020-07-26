package net.xdclass.chapter12;

import java.io.*;

public class BufferReaderTest {


    public static void  main(String [] args) throws Exception {


        test2("C:\\Users\\79466\\Desktop\\test\\1.txt");



    }


    public static void test1(String path) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader(path));

        if(!reader.ready()){

            System.out.println("文件流暂时无法读取");
            return;
        }

        int size;

        char[] cbuf = new char[1024];
        while ( (size = reader.read(cbuf,0,cbuf.length)) != -1){

            System.out.println(new String(cbuf,0,size));

        }
        reader.close();


    }


    public static void test2(String path) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        if(!reader.ready()){
            System.out.println("文件流暂时无法读取");
            return;
        }
        String str = "";
        while ( (str = reader.readLine()) !=null){
            System.out.println(str);
        }
        reader.close();

    }
}
