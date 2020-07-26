package net.xdclass.chapter11;

import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {

        String dir = "C:\\Users\\79466\\Desktop";

        String name = "a.txt";

        String target = "b.txt";

        File file = new File(dir,name);

        InputStream inputStream = new FileInputStream(file);


        //会自动创建文件，但是不会创建多级目录下的文件
//        OutputStream outputStream =
//                new FileOutputStream(dir+File.separator+target);





        //不覆盖文件，追加数据
        OutputStream outputStream =
                new FileOutputStream(dir+File.separator+target,true);


        //testOut(inputStream,outputStream);
        testOutBuf(inputStream,outputStream);
    }



    public static void testOutBuf(InputStream inputStream,OutputStream outputStream)throws IOException {

        byte [] buf = new byte[1024];
        int length ;
        while (( length = inputStream.read(buf))!=-1){
            outputStream.write(buf,0,length);
        }
        //关闭流
        inputStream.close();
        outputStream.close();
    }


        //单个字节读取，中文会有问题
    public static void testOut(InputStream inputStream,OutputStream outputStream)throws IOException{

        int value = 0;
        while (value!=-1){
          value =  inputStream.read();
          outputStream.write(value);
        }
        //最后记得关闭流
        inputStream.close();
        outputStream.close();


    }













    public static void testReadByteArr(InputStream inputStream)throws IOException{

        //如果buf的长度为0，则不读取任何字节并返回0；每次读取的字节数最多等于buf的长度
        //byte[] buf = new byte[1024];
        byte[] buf = new byte[inputStream.available()];

        int length;

        //循环读取文件内容，输入流中将最多的buf.length
        // 个字节数据读入一个buf数组中，返回类型是读取到的字节数
        //如果这个缓冲区没有满的话，则返回真实的字节数
        while ((length = inputStream.read(buf))!=-1){


            //中文乱码问题，换成GBK,或者UTF-8
            //System.out.print(new String(buf,0,length));
            System.out.print(new String(buf,0,length,"UTF-8"));
            //System.out.println(new String(buf,0,length));
        }

        inputStream.close();

    }







    public static void testRead(InputStream inputStream)throws IOException{

        //对于汉字等 unicode中的字符不能正常读取，只能以乱码的形式显示
        int read = inputStream.read();
        System.out.println(read);
        System.out.println((char)read);
        inputStream.close();
    }


    public static void testSkip(InputStream inputStream)throws IOException{

        long skipSize = inputStream.skip(2);
        System.out.println(skipSize);

        int read = inputStream.read();
        System.out.println(read);
        System.out.println((char)read);


        inputStream.close();
    }


}
