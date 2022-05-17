package ru.saikov.window.frame;

import java.io.*;
import java.util.ArrayList;

public class FileIni {
    ArrayList<String> adress;   //IP ����� ����
    int adresCount;  //���������� �������
    int timeOut;     //�������
    int time;        //�������� ������
    String pathToFileIni;  //���� � ��� ����� ��������
    String pathToFileLog; //���� � ���� ����

    public FileIni(String a_pathToFile){
        this.pathToFileIni = a_pathToFile;
        //��������� ������� ��� ����
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
                        //this.adress = myList; //� ����� �� ���� ������� �� ������� �����?
                    }
                    this.adress = myList; //� ����� �� ���� ������� �� ������� �����?
                }
                if (line.equals("[TIMEOUT]")){
                    this.timeOut = Integer.parseInt(reader.readLine());
                }
                if (line.equals("[TIME]")){
                    this.time = Integer.parseInt(reader.readLine());
                }
                if (line.equals("[LOG]")){
                    this.pathToFileLog = reader.readLine();
                }

            }
            reader.close();
            //����� ������� �������
        }catch (FileNotFoundException exception) {
            System.out.println("���� �������� �� ������!");
            System.exit(-100);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }


}
