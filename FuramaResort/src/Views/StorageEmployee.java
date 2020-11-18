package Views;

import Commons.MethodFileEmployeeCSV;
import Commons.MethodFileVillaCSV;
import Models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StorageEmployee {
    static Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = MethodFileEmployeeCSV.getFileCSV();
    public static Stack<Employee> storeEmployee() {
        Stack<Employee> employeeStack = new Stack<>();
        for (Employee employee : employeeList) {
            employeeStack.add(employee);
        }
        return employeeStack;
    }
    public static void searchEmployee() {
        System.out.println("Bạn muốn tìm nhân viên nào");
        int i = 1;
        for (Employee employee: storeEmployee()) {
            if(employee.getName().equals("name")) continue;
            System.out.println(i+ ". "+ employee.getName());
            i++;
        }
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println(storeEmployee().get(index).toString());
    }

    public static void main(String[] args) {
        searchEmployee();
    }
}
