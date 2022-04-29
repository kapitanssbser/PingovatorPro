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
                //System.out.println(line);
                if (line.equals("[ADRESS COUNT]")){
                    //String s = reader.readLine();
                    //System.out.println(s);
                    this.adresCount = Integer.parseInt(reader.readLine());
                }
                if (line.equals("[ADRESS]")){
                    //String s;
                    ArrayList<String> myList = new ArrayList<String>();
                    //System.out.println("Найдено");
                    for(int i = 0; i < this.adresCount; i++){
                        //s = reader.readLine();
                        //System.out.println(s);
                        //this.adress.add(s);
                        //myList = new ArrayList<String>();
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
