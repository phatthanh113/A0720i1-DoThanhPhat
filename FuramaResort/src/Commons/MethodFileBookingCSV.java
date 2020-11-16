package Commons;

import Models.Customer;
import Models.Services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MethodFileBookingCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileCustomerBooking = "src/Data/Booking_1.csv";
    private static ArrayList<Customer> customerBookingList= new ArrayList<>();
    //    Header file CSV Booking
    private static final String FILE_HEADER = "name,Name service";
    //    Write file CSV
    public static void writeToCSV(ArrayList<Customer> list,Services service) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileCustomerBooking);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer : list) {
                if(customer.getName()=="name") {
                    continue;
                }
                fileWriter.append(customer.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.useServices(service).getNameService());
                fileWriter.append(NEW_LINE_SEPARATOR);
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
    public static ArrayList<Customer> getFileCSV(Services service) {
        BufferedReader bufferedReader = null;
        Path path = Paths.get(fileCustomerBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileCustomerBooking);
            } catch (Exception e) {
                {
                    System.out.println(e.getMessage());
                }
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileCustomerBooking));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if (split[0].equals("name")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setName(split[0]);
                customer.useServices(service).setNameService(split[1]);
                customerBookingList.add(customer);
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
        return customerBookingList;
    }
}
