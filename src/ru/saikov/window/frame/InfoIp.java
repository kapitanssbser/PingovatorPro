package ru.saikov.window.frame;

public class InfoIp { //Класс предоставляющий информацию об IP
    private String nameOfMachine;
    private String naznachenie;

    InfoIp(String ip){
        if (ip.equals("192.168.209.4")) {
            this.nameOfMachine = "1С5";
            this.naznachenie = "1С:Бухгалтерия, 1С:ЗУП 2.5, 1С:ЗУП 3.1";
            return;
        }
        if (ip.equals("192.168.20.21")) {
            this.nameOfMachine = "Supermicro";
            this.naznachenie = "VM server";
            return;
        }
        if (ip.equals("192.168.209.250")) {
            this.nameOfMachine = "centos1_mail_samba";
            this.naznachenie = "Public";
            return;
        }
        if (ip.equals("192.168.209.10")) {
            this.nameOfMachine = "mail-skt";
            this.naznachenie = "Почтовый сервер";
            return;
        }
        if (ip.equals("192.168.209.133")) {
            this.nameOfMachine = "mint";
            this.naznachenie = "VM server";
            return;
        }
        if (ip.equals("192.168.211.82")) {
            this.nameOfMachine = "немец";
            this.naznachenie = "1С:ERP, 1С:Документооборот";
            return;
        }
        if (ip.equals("192.168.211.8")) {
            this.nameOfMachine = "Kasper";
            this.naznachenie = "Касперский антивирус";
            return;
        }
        if (ip.equals("192.168.209.239")) {
            this.nameOfMachine = "win1";
            this.naznachenie = "Консультант +";
            return;
        }
        if (ip.equals("192.168.211.60")) {
            this.nameOfMachine = "debian 9";
            this.naznachenie = "VM server";
            return;
        }
        if (ip.equals("192.168.209.178")) {
            this.nameOfMachine = "TNI";
            this.naznachenie = "TNI агент, TFTP server";
            return;
        }
//8888888888888888888888
        if (ip.equals("192.168.209.9")) {
            this.nameOfMachine = "QNAP";
            this.naznachenie = "Файловый сервер";
            return;
        }
        if (ip.equals("192.168.211.89")) {
            this.nameOfMachine = "Solar-kip";
            this.naznachenie = "КИПиА";
            return;
        }
        if (ip.equals("192.168.211.32")) {
            this.nameOfMachine = "видеорегистраторы";
            this.naznachenie = "energoceh";
            return;
        }
        if (ip.equals("192.168.211.33")) {
            this.nameOfMachine = "видеорегистраторы";
            this.naznachenie = "ceh 4";
            return;
        }
        if (ip.equals("192.168.211.34")) {
            this.nameOfMachine = "видеорегистраторы";
            this.naznachenie = "perimetr";
            return;
        }
        if (ip.equals("192.168.20.22")) {
            this.nameOfMachine = "Коммутаторы d-link";
            this.naznachenie = "Solar2floor1210";
            return;
        }
        if (ip.equals("192.168.20.23")) {
            this.nameOfMachine = "Коммутаторы d-link";
            this.naznachenie = "Solar3floor1210";
            return;
        }
        if (ip.equals("192.168.20.25")) {
            this.nameOfMachine = "Коммутаторы d-link";
            this.naznachenie = "Solar4ceh1210";
            return;
        }
        if (ip.equals("192.168.20.26")) {
            this.nameOfMachine = "Коммутаторы d-link";
            this.naznachenie = "Solar4ceh3000";
            return;
        }
        if (ip.equals("192.168.20.27")) {
            this.nameOfMachine = "Коммутаторы d-link";
            this.naznachenie = "SolarABKCentral3000";
            return;
        }
//8888888888888888888888888888888888
        if (ip.equals("192.168.209.241")) {
            this.nameOfMachine = "Коммутаторы Mikrotik";
            this.naznachenie = "MikroTik41";
            return;
        }
        if (ip.equals("192.168.210.51")) {
            this.nameOfMachine = "Коммутаторы Mikrotik";
            this.naznachenie = "Solar_O";
            return;
        }
        if (ip.equals("192.168.209.1")) {
            this.nameOfMachine = "Коммутаторы Mikrotik";
            this.naznachenie = "SCT_CCR";
            return;
        }
        if (ip.equals("192.168.211.254")) {
            this.nameOfMachine = "Коммутаторы прочее";
            this.naznachenie = "AUSUS RT-AX58U";
            return;
        }
        if (ip.equals("192.168.20.28")) {
            this.nameOfMachine = "Коммутаторы прочее";
            this.naznachenie = "Zuxel GS1900";
            return;
        }
        if (ip.equals("192.168.2.1")) {
            this.nameOfMachine = "Коммутаторы прочее";
            this.naznachenie = "tp-link balance";
            return;
        }else {
            this.nameOfMachine = "Неизвестное имя машины";
            this.naznachenie = "Неизвестное назначение";
        }

    }
    public String getNameOfMachine() {
        return nameOfMachine;
    }

    public String getNaznachenie() {
        return naznachenie;
    }

}
