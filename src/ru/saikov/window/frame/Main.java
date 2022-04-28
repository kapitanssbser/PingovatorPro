package ru.saikov.window.frame;

import java.net.InetAddress;
import java.util.concurrent.TimeUnit;

public class Main {

    static final String SERVER1 = "192.168.209.1";
    static final String SERVER2 = "192.168.211.33";
    static final String SERVER3 = "192.168.211.34";
    static final String SERVER4 = "192.168.211.32";

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i < 100;i++) {
            try {
                InetAddress address1 = InetAddress.getByName(SERVER1); //IP который мне дал Василий
                boolean reachableServer1 = address1.isReachable(10000);
                InetAddress address2 = InetAddress.getByName(SERVER2); //IP который мне дал Василий
                boolean reachableServer2 = address2.isReachable(10000);
                InetAddress address3 = InetAddress.getByName(SERVER3); //IP который мне дал Василий
                boolean reachableServer3 = address3.isReachable(10000);
                InetAddress address4 = InetAddress.getByName(SERVER4); //IP который мне дал Василий
                boolean reachableServer4 = address4.isReachable(10000);

                if (reachableServer1) {
                    System.out.println("Запрос :" + i + " результат Server1 : Пингуется!");
                } else {
                    System.out.println("Запрос :" + i + "результат Server1 : Не пингуется!");
                }
                if (reachableServer2) {
                    System.out.println("Запрос :" + i + " результат Server2 : Пингуется!");
                } else {
                    System.out.println("Запрос :" + i + "результат Server2 : Не пингуется!");
                }
                if (reachableServer3) {
                    System.out.println("Запрос :" + i + " результат Server3 : Пингуется!");
                } else {
                    System.out.println("Запрос :" + i + "результат Server3 : Не пингуется!");
                }
                if (reachableServer4) {
                    System.out.println("Запрос :" + i + " результат Server4 : Пингуется!");
                } else {
                    System.out.println("Запрос :" + i + "результат Server4 : Не пингуется!");
                }

                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
