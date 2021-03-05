package controllers;

import Commons.FileUtils;
import Commons.exception.BirthdayException;
import models.SoTietKiemDaiHan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoTietKiemDaiHanController {
    public static List<SoTietKiemDaiHan> STKDH_List = new ArrayList<>();
    static String fileSTKDH = "src/data/STKDH.csv";
    static Scanner scanner= new Scanner(System.in);
    //Customer
    //Phương thức add customer
    public static void addNewSTKDH() {
        SoTietKiemDaiHan STKDN = new SoTietKiemDaiHan(MainController.getString(), MainController.getString(), BirthdayException.getBirthday(), BirthdayException.getBirthday(), MainController.getString(), MainController.getString(), MainController.getString(), MainController.getString());
        STKDH_List.add(STKDN);
        FileUtils.writeFile(fileSTKDH, STKDN.getId() + "," + STKDN.getIdCustomer()
                + "," + STKDN.getDateOpen() + "," + STKDN.getDateSend() + "," + STKDN.getMoney()
                + "," + STKDN.getLai_suat() + "," + STKDN.getUu_dai() + "," + STKDN.getKy_han());
    }

    //Phương thức hiện danh sách customer đã lưu
    public static List<SoTietKiemDaiHan> showInformationSTKDH() {
        List<String[]> listSTKDH = FileUtils.readFile(fileSTKDH);
        STKDH_List.clear();
        for (String[] stkdh : listSTKDH) {
            SoTietKiemDaiHan soTietKiemDaiHan = new SoTietKiemDaiHan(stkdh[0], stkdh[1], stkdh[2], stkdh[3], stkdh[4], stkdh[5], stkdh[6], stkdh[7]);
            STKDH_List.add(soTietKiemDaiHan);
        }
        for (SoTietKiemDaiHan stkdh : STKDH_List) {
            System.out.println(stkdh.toString());
        }
        return STKDH_List;
    }

    public static void deleteSTKDH() {
        STKDH_List = showInformationSTKDH();
        System.out.println("Input your id you want remove: ");
        String input = scanner.nextLine();
        FileUtils.removeFile(fileSTKDH);
        for (int i = 0; i < STKDH_List.size(); i++) {
            if (STKDH_List.get(i).getId().contains(input)) {
                STKDH_List.remove(i);
                i--;
            }
        }
        for (SoTietKiemDaiHan STKDH : STKDH_List) {
            FileUtils.writeFile(fileSTKDH, STKDH.getId() + "," + STKDH.getIdCustomer()
                    + "," + STKDH.getDateOpen() + "," + STKDH.getDateSend() + "," + STKDH.getMoney()
                    + "," + STKDH.getLai_suat() + "," + STKDH.getUu_dai() + "," + STKDH.getKy_han());
        }
    }
    public static void setSTKDH_List() {
        STKDH_List = showInformationSTKDH();
        System.out.println("Input your id you want search: ");
        String input = scanner.nextLine();
        for (int i = 0; i < STKDH_List.size(); i++) {
            if (STKDH_List.get(i).getId().contains(input)){
                System.out.println(STKDH_List.get(i));
            }
        }
    }
}
