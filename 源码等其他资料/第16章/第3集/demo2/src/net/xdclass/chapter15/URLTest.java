package net.xdclass.chapter15;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

    public static void main(String []args) throws Exception {

        URL url = new URL("http://api.xdclass.net:80/pub/api/v1/web/product/find_list_by_type?type=2&a=1&b=23");

        System.out.println("getHost="+url.getHost());
        System.out.println("getProtocol="+url.getProtocol());
        System.out.println("getPort="+url.getPort());
        System.out.println("getPath="+url.getPath());
        System.out.println("getQuery="+url.getQuery());
        //getPath和getQuery的组合
        System.out.println("getFile="+url.getFile());

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

       int responseCode = httpURLConnection.getResponseCode();
       if(200 <= responseCode && responseCode<=299){

           try(InputStream inputStream = httpURLConnection.getInputStream();
               BufferedReader in =  new BufferedReader(new InputStreamReader(inputStream))){

             StringBuilder response = new StringBuilder();

             String currentLine;

             while ( (currentLine =in.readLine())!=null ){
                 response.append(currentLine);
             }

            System.out.println(response.toString());

           }catch (Exception e){
               e.printStackTrace();
           }

       }



    }
}
