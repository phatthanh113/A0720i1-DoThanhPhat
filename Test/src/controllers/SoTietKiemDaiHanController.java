package controllers;

import Commons.FileUtils;
import models.SoTietKiemDaiHan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoTietKiemCoThoiHanController {
    public static List<SoTietKiemDaiHan> STKDH_List = new ArrayList<>();
    static String fileSTKDH = "src/data/STKCTH.csv";
    static Scanner scanner= new Scanner(System.in);
    //Customer
    //Phương thức add customer
    public static void addNewSTKCTH() {
        SoTietKiemDaiHan STKDN = new SoTietKiemDaiHan("1", "1", "1", "1", "1", "1", "1", "1");
        STKDH_List.add(STKDN);
        FileUtils.writeFile(fileSTKDH, STKDN.getId() + "," + STKDN.getIdCustomer()
                + "," + STKDN.getDateOpen() + "," + STKDN.getDateSend() + "," + STKDN.getMoney()
                + "," + STKDN.getLai_suat() + "," + STKDN.getUu_dai() + "," + STKDN.getKy_han());
    }

    //Phương thức hiện danh sách customer đã lưu
    public static List<SoTietKiemDaiHan> showInformationSTKCTH() {
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

    public static void deleteSTKCTH() {
        STKDH_List = showInformationSTKCTH();
        System.out.println("Input your name you want remove: ");
        String input = scanner.nextLine();
        FileUtils.removeFile(fileSTKDH);
        for (int i = 0; i < STKDH_List.size(); i++) {
            if (input.contains(STKDH_List.get(i).getId())) {
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
}
