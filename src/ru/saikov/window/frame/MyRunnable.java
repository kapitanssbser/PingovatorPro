package ru.saikov.window.frame;

import java.util.Scanner;

public class MyRunnable implements Runnable{
    boolean t;
    Scanner scanner;
    int s;

    MyRunnable(){  //Конструктор
        super();
        scanner = new Scanner(System.in);
    }

    @Override
    public void run() {
        go();   //Метод выполнялка
    }
    public void go(){
        while (!t)  //Бесконечный цикл
            try {
                s = scanner.nextInt();
            }catch (Exception e){   //Костыль. Ожидаем число, при вводе символа исключение блок CATCH, а там выход
                System.out.println("Выход из программы...");
                System.exit(-101);
            }
    }
}
