package Commons;

import Models.Employee;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MethodFileEmployeeCSV {
    private static final String COMMA_DELIMITER = "," ;
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String EMPLOYEE_CSV = "src/Data/Employee.csv";
    private static List<Employee> employeeArrayList = new ArrayList<>();
    //    Header file CSV Villa
    private static final String FILE_HEADER =  "name,age,address";
    //    Write file CSV
    public static void writeToCSV (List<Employee> list) {
        FileWriter fileWriter = null ;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(EMPLOYEE_CSV);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FILE_HEADER).append(NEW_LINE_SEPARATOR);
            for (Employee employee : list) {
                stringBuilder.append(employee.getName()).append(COMMA_DELIMITER);
                stringBuilder.append(employee.getAge()).append(COMMA_DELIMITER);
                stringBuilder.append(employee.getAddress()).append(COMMA_DELIMITER);
            }
            bufferedWriter.write(String.valueOf(stringBuilder));
        }catch (Exception e) {
            System.out.println("error in CSV writter");
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception e) {
                System.out.println("error when flush or close");
            }
        }
    }
    //    Đọc file CSV
    public static List<Employee> getFileCSV() {
        BufferedReader bufferedReader = null ;
        Path path = Paths.get(EMPLOYEE_CSV);
        if (!Files.exists(path)) {
            try{
                Writer writer = new FileWriter(EMPLOYEE_CSV);
            }catch (Exception e){{
                System.out.println(e.getMessage());
            }
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(EMPLOYEE_CSV));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if(split[0].equals("nameService")){
                    continue;
                }
                Employee employee = new Employee();
                employee.setName(split[0]);
                employee.setAge(split[1]);
                employee.setAddress(split[2]);
                employeeArrayList.add(employee);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try{
                bufferedReader.close();
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return employeeArrayList;
    }
}
