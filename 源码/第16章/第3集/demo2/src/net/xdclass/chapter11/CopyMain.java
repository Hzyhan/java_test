package net.xdclass.chapter11;

import java.io.*;

public class CopyMain {

    public static void main(String [] args){

        String dir = "C:\\Users\\79466\\Desktop\\test";
        File file =new File(dir+"\\img1");
        File [] files = file.listFiles();

        for(File from : files){

            String fileName = from.getName();
            copy(from.getAbsolutePath(), dir+"\\img2\\"+fileName);

        }





    }


    public static void copy(String from, String to){


        try {

            File targetDir = new File( new File(to).getParent() );
            if(!targetDir.exists()){
                targetDir.mkdirs();
            }

            FileInputStream fis = new FileInputStream(from);
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream(to);
            BufferedOutputStream bos = new BufferedOutputStream( fos);

            int size;
            byte [] buf = new byte[1024];

            while ( (size = bis.read(buf))!= -1 ){
                bos.write(buf, 0, size);
            }
            //刷新此缓冲的输出流，才可以保证数据的全部输出
            //bos.flush();


            bis.close();
            bos.close();






        }catch (Exception e){
            e.printStackTrace();
        }




    }

}
