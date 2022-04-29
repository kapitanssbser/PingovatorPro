package ru.saikov.window.frame;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        // write your code here
        if (args.length == 0){
            System.out.println("Не указан путь к файлу настроек!");
            System.exit(-100);
        }
        FileIni fileIni = new FileIni(args[0]); //Получаем полный путь к файлу настроек C:\SSPing\pingonator.txt
        for (int i = 0; i < 100; i++) {
            try {
                for (String s : fileIni.adress) {
                    //Проходим по всем адресам
                    InetAddress address1 = InetAddress.getByName(s);
                    boolean reachableServer1 = address1.isReachable(fileIni.timeOut);
                    TimeUnit.SECONDS.sleep(fileIni.time);
                    if (reachableServer1) {
                        Date date = new Date();
                        System.out.println(date.toString() + " " + s + " Пингуется");
                    } else {
                        Date date = new Date();
                        System.out.println(date.toString() + " " + s + " НЕ Пингуется!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    }
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
