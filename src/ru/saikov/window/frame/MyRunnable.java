package ru.saikov.window.frame;

import java.util.Scanner;

public class MyRunnable implements Runnable{
    boolean t;
    Scanner scanner;
    int s;

    MyRunnable(){  //�����������
        super();
        scanner = new Scanner(System.in);
    }

    @Override
    public void run() {
        go();   //����� ����������
    }
    public void go(){
        while (!t)  //����������� ����
            try {
                s = scanner.nextInt();
            }catch (Exception e){   //�������. ������� �����, ��� ����� ������� ���������� ���� CATCH, � ��� �����
                System.out.println("����� �� ���������...");
                System.exit(-101);
            }
    }
}
