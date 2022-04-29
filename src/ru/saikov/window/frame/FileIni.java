package ru.saikov.window.frame;

import java.io.*;
import java.util.ArrayList;

public class FileIni {
    ArrayList<String> adress;   //IP ����� ����
    int adresCount;  //���������� �������
    int timeOut;     //�������
    int time;        //�������� ������
    String pathToFileIni;  //���� � ��� ����� ��������

    public FileIni(String a_pathToFile){
        this.pathToFileIni = a_pathToFile;
        //��������� ������� ��� ����
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
                    //System.out.println("�������");
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
            //����� ������� �������
        }catch (FileNotFoundException exception) {
            System.out.println("���� �������� �� ������!");
            System.exit(-100);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }


}
