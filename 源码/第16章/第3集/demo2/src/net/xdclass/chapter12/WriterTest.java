package net.xdclass.chapter12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {

    public static  void  main(String [] ags)throws Exception{
        test2();

    }

    public static void test2() throws IOException {
        String dir = "C:\\Users\\79466\\Desktop\\test\\2.txt";
        FileWriter writer = new FileWriter(dir,false);
        writer.write(23567);
        writer.write(28404);
        writer.write(35838);
        writer.write(22530);
        writer.write("23567");
        writer.flush();
        writer.close();
    }


    public static void test1() throws IOException {
        String dir = "C:\\Users\\79466\\Desktop\\test\\2.txt";
        Writer writer = new FileWriter(dir);
        writer.write(23567);
        writer.write(28404);
        writer.write(35838);
        writer.write(22530);
        writer.write("23567");
        writer.flush();
        writer.close();
    }



}

