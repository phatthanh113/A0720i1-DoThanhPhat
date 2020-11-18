package Commons;

import Models.Customer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MethodFileCustomerCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String DATA_CUSTOMER_CSV = "src/Data/Customer.csv";
    static List<Customer> customerArrayList= new ArrayList<>();
    //    Header file CSV Customer
    private static final String FILE_HEADER = "name,dayOfBirth,gender,idNumber,phoneNumber,customerType,address";

    //    Write file CSV
    public static void writeToCSV(List<Customer> list) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(DATA_CUSTOMER_CSV);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FILE_HEADER).append(NEW_LINE_SEPARATOR);
            for (Customer customer : list) {
                stringBuilder.append(customer.getName()).append(COMMA_DELIMITER);
                stringBuilder.append(customer.getDayOfBirth()).append(COMMA_DELIMITER);
                stringBuilder.append(customer.getGender()).append(COMMA_DELIMITER);
                stringBuilder.append(customer.getIdNumber()).append(COMMA_DELIMITER);
                stringBuilder.append(customer.getCustomerType()).append(COMMA_DELIMITER);
                stringBuilder.append(customer.getPhoneNumber()).append(COMMA_DELIMITER);
                stringBuilder.append(customer.getAddress()).append(COMMA_DELIMITER);
            }
            bufferedWriter.write(String.valueOf(stringBuilder));
        } catch (Exception e) {
            System.out.println("error in CSV writter");
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (Exception e) {
                System.out.println("error when flush or close");
            }
        }
    }

    //    Đọc file CSV
    public static List<Customer> getFileCSV() {
        BufferedReader bufferedReader = null;
        Path path = Paths.get(DATA_CUSTOMER_CSV);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(DATA_CUSTOMER_CSV);
            } catch (Exception e) {
                {
                    System.out.println(e.getMessage());
                }
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(DATA_CUSTOMER_CSV));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if (split[0].equals("nameService")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setName(split[0]);
                customer.setDayOfBirth(split[1]);
                customer.setGender(split[2]);
                customer.setIdNumber(split[3]);
                customer.setPhoneNumber(split[4]);
                customer.setCustomerType(split[5]);
                customer.setAddress(split[6]);
                customerArrayList.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return customerArrayList;
    }
}
