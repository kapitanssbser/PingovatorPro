package ru.saikov.window.frame;

import java.io.*;

public class MyLogFile {
    String pathTologFile;
    FileWriter fileWriter;
    BufferedWriter writer;

    public MyLogFile(String a_pathToLogFile){ //Инициализация файла лога
        try {
            fileWriter = new FileWriter(new File(a_pathToLogFile));
            writer = new BufferedWriter(fileWriter); //Открыли только файл

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void closeMyLogFile(){ //Закрытие файла лога
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void setLogToFile(String logStr){ //Запись строки логирования в файл
        try {
            writer.write(logStr + "\n");
            //System.out.println("ЛОГГГГГГ");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
