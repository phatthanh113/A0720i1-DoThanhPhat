package Controllers;

import Commons.MethodFileEmployeeCSV;
import Models.Employee;

import java.util.*;

public class EmployeeController {
    static Scanner scanner = new Scanner(System.in);
    private static List<Employee> listEmployee = MethodFileEmployeeCSV.getFileCSV();
    public static void showInformationEmployee() {
        if(listEmployee.get(0).getName().equals("name")) listEmployee.remove(0);
        Map<String,Employee> listMapEmployee = new LinkedHashMap<>();
        String codeNumber = "00";
        int count = 0;
//        Thêm phần tử vào listMap
        for (Employee employee: listEmployee) {
            listMapEmployee.put(codeNumber+count,employee);
            count++;
        }
//        Duyệt các phần tử trong list map
        Set<String> set = listMapEmployee.keySet();
        for (String key : set) {
            System.out.println("Mã số : "+ key + "- " + listMapEmployee.get(key));
        }
    }
}
