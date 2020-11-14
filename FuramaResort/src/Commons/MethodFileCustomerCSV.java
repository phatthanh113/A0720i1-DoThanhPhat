package Commons;

import Models.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MethodFileCustomerCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileCustomer = "src/Data/Customer.csv";
    //    Header file CSV Customer
    private static final String FILE_HEADER = "name,dayOfBirth,gender,idNumber,phoneNumber,customerType,address";

    //    Write file CSV
    public static void writeToCSV(ArrayList<Customer> list) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileCustomer);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer : list) {
                fileWriter.append(customer.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getDayOfBirth()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getGender()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getIdNumber()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getCustomerType()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getPhoneNumber()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getAddress()));
                fileWriter.append(COMMA_DELIMITER);
            }

        } catch (Exception e) {
            System.out.println("error in CSV writter");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("error when flush or close");
            }
        }
    }

    //    Đọc file CSV
    public static ArrayList<Customer> getFileCSV() {
        BufferedReader bufferedReader = null;
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        Path path = Paths.get(fileCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileCustomer);
            } catch (Exception e) {
                {
                    System.out.println(e.getMessage());
                }
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileCustomer));
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
