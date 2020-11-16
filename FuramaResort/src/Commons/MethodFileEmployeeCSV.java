package Commons;

import Models.Employee;
import Models.House;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MethodFileEmployeeCSV {
    private static final String COMMA_DELIMITER = "," ;
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileEmployee = "src/Data/Employee.csv";
    private static ArrayList<Employee> employeeArrayList = new ArrayList<>();
    //    Header file CSV Villa
    private static final String FILE_HEADER =  "name,age,address";
    //    Write file CSV
    public static void writeToCSV (ArrayList<Employee> list) {
        FileWriter fileWriter = null ;
        try {
            fileWriter = new FileWriter(fileEmployee);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Employee employee : list) {
                fileWriter.append(employee.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getAge());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

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
    public static ArrayList<Employee> getFileCSV() {
        BufferedReader bufferedReader = null ;
        Path path = Paths.get(fileEmployee);
        if (!Files.exists(path)) {
            try{
                Writer writer = new FileWriter(fileEmployee);
            }catch (Exception e){{
                System.out.println(e.getMessage());
            }
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileEmployee));
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
