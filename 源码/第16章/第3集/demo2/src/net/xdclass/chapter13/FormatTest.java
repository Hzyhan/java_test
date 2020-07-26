package net.xdclass.chapter13;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatTest  extends Object{

    public static void main(String [] args){
//        LocalDateTime ldt =   LocalDateTime.now();
//        System.out.println(ldt);
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
//       String ldtStr =  dtf.format(ldt);
//       System.out.println(ldtStr);

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime changeDate = LocalDateTime.of(2020,10,1,10,40,30);
        System.out.println(changeDate);

        //第二个参数减第一个参数
        Duration duration = Duration.between(today,changeDate);

        System.out.println(duration.toDays());//两个时间差的天数
        System.out.println(duration.toHours());//两个时间差的小时
        System.out.println(duration.toMinutes());//两个时间差的分钟
        System.out.println(duration.toMillis());//两个时间差的毫秒






    }
}
