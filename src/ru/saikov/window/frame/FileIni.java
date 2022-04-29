package ru.saikov.window.frame;

import java.io.*;
import java.util.ArrayList;

public class FileIni {
    ArrayList<String> adress;   //IP адрес лист
    int adresCount;  //Количество адресов
    int timeOut;     //Таймаут
    int time;        //Задержка опроса
    String pathToFileIni;  //Путь и имя файла настроек

    public FileIni(String a_pathToFile){
        this.pathToFileIni = a_pathToFile;
        //Заполняем данными все поля
        try {
            FileReader fileReader = new FileReader(new File(a_pathToFile));
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null){
                if (line.equals("[ADRESS COUNT]")){
                    this.adresCount = Integer.parseInt(reader.readLine());
                }
                if (line.equals("[ADRESS]")){
                    ArrayList<String> myList = new ArrayList<String>();
                    for(int i = 0; i < this.adresCount; i++){
                        myList.add(reader.readLine());
                        this.adress = myList;
                    }
                }
                if (line.equals("[TIMEOUT]")){
                    this.timeOut = Integer.parseInt(reader.readLine());
                }
                if (line.equals("[TIME]")){
                    this.time = Integer.parseInt(reader.readLine());
                }

            }
            reader.close();
            //Знаем сколько адресов
        }catch (FileNotFoundException exception) {
            System.out.println("Файл настроек не найден!");
            System.exit(-100);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }


}
