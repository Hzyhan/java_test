package net.xdclass.chapter11;

import java.io.*;

public class BufferMain {


    public static void main(String [] args){

        try{

            FileInputStream fis = new FileInputStream("C:\\Users\\79466\\Desktop\\test\\xdclass.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream("C:\\Users\\79466\\Desktop\\test\\copy.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);


            int size;
            byte [] buf = new byte[1024];

            while ( (size =bis.read(buf))!=-1){
                bos.write(buf,0,size);
            }

            //刷新此缓冲区的输出流，才可以保证数据全部输出完成，
            bos.flush();

            bis.close();
            bos.close();


        }catch (Exception e){

        }



    }

}
