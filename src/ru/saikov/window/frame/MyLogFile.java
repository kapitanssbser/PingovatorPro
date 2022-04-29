package ru.saikov.window.frame;

import java.io.*;

public class MyLogFile {
    String pathTologFile;
    FileWriter fileWriter;
    BufferedWriter writer;

    public MyLogFile(String a_pathToLogFile){ //������������� ����� ����
        try {
            fileWriter = new FileWriter(new File(a_pathToLogFile));
            writer = new BufferedWriter(fileWriter); //������� ������ ����

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void closeMyLogFile(){ //�������� ����� ����
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void setLogToFile(String logStr){ //������ ������ ����������� � ����
        try {
            writer.write(logStr + "\n");
            //System.out.println("��������");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
