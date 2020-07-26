package net.xdclass.chapter10;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException {

        String path = "C:\\Users\\79466\\Desktop";
        createDir(path);
    }


    public static void createDir(String path)throws IOException {

        String root = path+File.separator+"test";

        File rootDir = new File(root);

        if(!rootDir.exists()){
            rootDir.mkdirs();
        }

        for(int i=0; i<10; i++){

            String dirPath = root+File.separator+(i+1);
            File dirFile = new File(dirPath);
            if(!dirFile.exists()){
                dirFile.mkdir();

                String txtPath = dirPath+File.separator+(i+1)+".txt";
                System.out.println(txtPath);
                File txtFile = new File(txtPath);
                if(!txtFile.exists()){
                    txtFile.createNewFile();
                }

            }


        }


    }

}
