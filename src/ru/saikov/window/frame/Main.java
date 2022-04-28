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
                InetAddress address1 = InetAddress.getByName(SERVER1); //IP ������� ��� ��� �������
                boolean reachableServer1 = address1.isReachable(10000);
                InetAddress address2 = InetAddress.getByName(SERVER2); //IP ������� ��� ��� �������
                boolean reachableServer2 = address2.isReachable(10000);
                InetAddress address3 = InetAddress.getByName(SERVER3); //IP ������� ��� ��� �������
                boolean reachableServer3 = address3.isReachable(10000);
                InetAddress address4 = InetAddress.getByName(SERVER4); //IP ������� ��� ��� �������
                boolean reachableServer4 = address4.isReachable(10000);

                if (reachableServer1) {
                    System.out.println("������ :" + i + " ��������� Server1 : ���������!");
                } else {
                    System.out.println("������ :" + i + "��������� Server1 : �� ���������!");
                }
                if (reachableServer2) {
                    System.out.println("������ :" + i + " ��������� Server2 : ���������!");
                } else {
                    System.out.println("������ :" + i + "��������� Server2 : �� ���������!");
                }
                if (reachableServer3) {
                    System.out.println("������ :" + i + " ��������� Server3 : ���������!");
                } else {
                    System.out.println("������ :" + i + "��������� Server3 : �� ���������!");
                }
                if (reachableServer4) {
                    System.out.println("������ :" + i + " ��������� Server4 : ���������!");
                } else {
                    System.out.println("������ :" + i + "��������� Server4 : �� ���������!");
                }

                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
