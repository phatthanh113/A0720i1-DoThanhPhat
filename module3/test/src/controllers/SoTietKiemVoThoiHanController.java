package controllers;

import Commons.FileUtils;
import Commons.exception.BirthdayException;
import models.SoTietKiemCoThoiHan;
import models.SoTietKiemVoThoiHan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoTietKiemVoThoiHanController {
    public static List<SoTietKiemVoThoiHan> STKDH_List = new ArrayList<>();
    static String fileSTKDH = "src/data/STKVTH.csv";
    static Scanner scanner= new Scanner(System.in);
    public static final String REGEX_STK_NH = "^STKNH-\\d{4}$";
    public static final String REGEX_STK_DH = "^STKDH-\\d{4}$";
    public static final String REGEX_STK_VTH = "^STKVTH-\\d{4}$";
    //Customer
    //Phương thức add customer
    public static void addNewSTKVTH() {
        SoTietKiemVoThoiHan STKDN = new SoTietKiemVoThoiHan(MainController.getString(), MainController.getString(), BirthdayException.getBirthday(), BirthdayException.getBirthday(), MainController.getString(), MainController.getString());
        STKDH_List.add(STKDN);
        FileUtils.writeFile(fileSTKDH, STKDN.getId() + "," + STKDN.getIdCustomer()
                + "," + STKDN.getDateOpen() + "," + STKDN.getDateSend() + "," + STKDN.getMoney()
                + "," + STKDN.getLai_suat());
    }

    //Phương thức hiện danh sách customer đã lưu
    public static List<SoTietKiemVoThoiHan> showInformationSTKVTH() {
        List<String[]> listSTKDH = FileUtils.readFile(fileSTKDH);
        STKDH_List.clear();
        for (String[] stkdh : listSTKDH) {
            SoTietKiemVoThoiHan soTietKiemCoThoiHan = new SoTietKiemVoThoiHan(stkdh[0], stkdh[1], stkdh[2], stkdh[3], stkdh[4], stkdh[5]);
            STKDH_List.add(soTietKiemCoThoiHan);
        }
        for (SoTietKiemVoThoiHan stkdh : STKDH_List) {
            System.out.println(stkdh.toString());
        }
        return STKDH_List;
    }

    public static void deleteSTKCTH() {
        STKDH_List = showInformationSTKVTH();
        System.out.println("Input your id you want remove: ");
        String input = scanner.nextLine();
        FileUtils.removeFile(fileSTKDH);
        for (int i = 0; i < STKDH_List.size(); i++) {
            if (STKDH_List.get(i).getId().contains(input)) {
                STKDH_List.remove(i);
                i--;
            }
        }
        for (SoTietKiemVoThoiHan STKDH : STKDH_List) {
            FileUtils.writeFile(fileSTKDH, STKDH.getId() + "," + STKDH.getIdCustomer()
                    + "," + STKDH.getDateOpen() + "," + STKDH.getDateSend() + "," + STKDH.getMoney()
                    + "," + STKDH.getLai_suat());
        }
    }
    public static void setSTKVTH_List() {
        STKDH_List = showInformationSTKVTH();
        System.out.println("Input your id you want search: ");
        String input = scanner.nextLine();
        for (int i = 0; i < STKDH_List.size(); i++) {
            if (STKDH_List.get(i).getId().contains(input)) {
                System.out.println(STKDH_List.get(i));
            }
        }
    }
}
