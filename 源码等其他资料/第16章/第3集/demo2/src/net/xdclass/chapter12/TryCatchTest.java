package net.xdclass.chapter12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TryCatchTest {

    public static void main(String [] args){

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\79466\\Desktop\\test\\1.txt");
            bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream("C:\\Users\\79466\\Desktop\\test\\1111.txt");
            bos = new BufferedOutputStream(fos);

            int size;
            byte [] buf =new byte[1024];
            while ((size = bis.read(buf))!= -1){
                bos.write(buf,0,size);
            }



        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bis != null){
                try {
                    bis.close();
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    if(bos!=null){
                        try{
                            bos.close();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }



    }



    public static void test1(){

        try( FileInputStream fis = new FileInputStream("C:\\Users\\79466\\Desktop\\test\\1.txt");
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream("C:\\Users\\79466\\Desktop\\test\\1111.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
        ){
            int size;
            byte [] buf =new byte[1024];
            while ((size = bis.read(buf))!= -1){
                bos.write(buf,0,size);
            }
        }catch (Exception e){
            e.printStackTrace();
        }





    }


}
