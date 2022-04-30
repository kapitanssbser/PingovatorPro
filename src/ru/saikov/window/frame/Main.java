package ru.saikov.window.frame;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Main {

//final static String PATHTOLOG = "C:\\Users\\user084\\SSP\\PINGOVATOR\\log.txt";

    public static void main(String[] args) {
        // write your code here
        if (args.length == 0){
            System.out.println("Не указан путь к файлу настроек!");
            System.exit(-100);
        }
        Runnable threadJob = new MyRunnable();
        Thread myThead = new Thread(threadJob);
        myThead.start();

        FileIni fileIni = new FileIni(args[0]); //Получаем полный путь к файлу настроек C:\SSPing\pingonator.txt
        MyLogFile log = new MyLogFile(fileIni.pathToFileLog);
        //log.closeMyLogFile();
        SaikovSoft saikovSoft = new SaikovSoft();
        saikovSoft.saikovPrint();
        for ( ; ; ) {     //Бесконечный цикл, выход только по костылю
            //myThead.start();
            try {
                for (String s : fileIni.adress) {
                    //Проходим по всем адресам
                    InetAddress address1 = InetAddress.getByName(s);
                    boolean reachableServer1 = address1.isReachable(fileIni.timeOut);
                    TimeUnit.SECONDS.sleep(fileIni.time);
                    if (reachableServer1) {
                        Date date = new Date();
                        //System.out.println(date.getDate());
                        //System.out.println(date.toString() + " " + s + " Пингуется");
                        log.setLogToFile(date.toString() + " " + s + " Пингуется"); //Пишем в лог файл
                    } else {
                        Date date = new Date();
                        //System.out.println(date.toString() + " " + s + " НЕ Пингуется!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        log.setLogToFile(date.toString() + " " + s + " НЕ Пингуется!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    }
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
