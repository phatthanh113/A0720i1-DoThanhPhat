package controllers;

import Commons.FileUtils;
import models.SoTietKiemCoThoiHan;
import models.SoTietKiemDaiHan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SoTietKiemDaiHanController {
    public static List<SoTietKiemCoThoiHan> STKDH_List = new ArrayList<>();
    static String fileSTKDH = "src/data/STKDH.csv";
    static Scanner scanner= new Scanner(System.in);
    //Customer
    //Phương thức add customer
    public static void addNewSTKDH() {
        SoTietKiemCoThoiHan STKDN = new SoTietKiemCoThoiHan("1", "1", "1", "1", "1", "1", "1");
        STKDH_List.add(STKDN);
        FileUtils.writeFile(fileSTKDH, STKDN.getId() + "," + STKDN.getIdCustomer()
                + "," + STKDN.getDateOpen() + "," + STKDN.getDateSend() + "," + STKDN.getMoney()
                + "," + STKDN.getLai_suat() + "," + STKDN.getKy_han());
    }

    //Phương thức hiện danh sách customer đã lưu
    public static List<SoTietKiemCoThoiHan> showInformationSTKDH() {
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

        public static void deleteSTKDH() {
        STKDH_List = showInformationSTKDH();
        System.out.println("Input your name you want remove: ");
        String input = scanner.nextLine();
        FileUtils.removeFile(fileSTKDH);
        for (int i = 0; i < STKDH_List.size(); i++) {
            if (input.contains(STKDH_List.get(i).getId())) {
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

}
