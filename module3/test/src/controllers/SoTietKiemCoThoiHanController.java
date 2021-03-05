package controllers;

import Commons.FileUtils;
import Commons.exception.BirthdayException;
import models.SoTietKiemCoThoiHan;
import models.SoTietKiemDaiHan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SoTietKiemCoThoiHanController {
    public static List<SoTietKiemCoThoiHan> STKDH_List = new ArrayList<>();
    static String fileSTKDH = "src/data/STKCTH.csv";
    static Scanner scanner= new Scanner(System.in);
    //Customer
    //Phương thức add customer
    public static void addNewSTKCTH() {
        SoTietKiemCoThoiHan STKDN = new SoTietKiemCoThoiHan(MainController.getString(), MainController.getString(), BirthdayException.getBirthday(), BirthdayException.getBirthday(), MainController.getString(), MainController.getString(), MainController.getString());
        STKDH_List.add(STKDN);
        FileUtils.writeFile(fileSTKDH, STKDN.getId() + "," + STKDN.getIdCustomer()
                + "," + STKDN.getDateOpen() + "," + STKDN.getDateSend() + "," + STKDN.getMoney()
                + "," + STKDN.getLai_suat() + "," + STKDN.getKy_han());
    }

    //Phương thức hiện danh sách customer đã lưu
    public static List<SoTietKiemCoThoiHan> showInformationSTKCTH() {
        List<String[]> listSTKDH = FileUtils.readFile(fileSTKDH);
        STKDH_List.clear();
        for (String[] stkdh : listSTKDH) {
            SoTietKiemCoThoiHan soTietKiemCoThoiHan = new SoTietKiemCoThoiHan(stkdh[0], stkdh[1], stkdh[2], stkdh[3], stkdh[4], stkdh[5], stkdh[6]);
            STKDH_List.add(soTietKiemCoThoiHan);
        }
        for (SoTietKiemCoThoiHan stkdh : STKDH_List) {
            System.out.println(stkdh.toString());
        }
        return STKDH_List;
    }

        public static void deleteSTKCTH() {
        STKDH_List = showInformationSTKCTH();
        System.out.println("Input your id you want remove: ");
        String input = scanner.nextLine();
        FileUtils.removeFile(fileSTKDH);
        for (int i = 0; i < STKDH_List.size(); i++) {
            if (STKDH_List.get(i).getId().contains(input)) {
                STKDH_List.remove(i);
                i--;
            }
        }
        for (SoTietKiemCoThoiHan STKDH : STKDH_List) {
            FileUtils.writeFile(fileSTKDH, STKDH.getId() + "," + STKDH.getIdCustomer()
                    + "," + STKDH.getDateOpen() + "," + STKDH.getDateSend() + "," + STKDH.getMoney()
                    + "," + STKDH.getLai_suat() +  "," + STKDH.getKy_han());
        }
    }
    public static void setSTCTH_List() {
        STKDH_List = showInformationSTKCTH();
        System.out.println("Input your id you want search: ");
        String input = scanner.nextLine();
        for (int i = 0; i < STKDH_List.size(); i++) {
            if (STKDH_List.get(i).getId().contains(input)){
                System.out.println(STKDH_List.get(i));
            }
        }
    }
}
