package Commons;

import Models.Customer;
import Models.Services;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MethodFileBookingCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String DATA_BOOKING_CSV = "src/Data/Booking.csv";
    private static List<Customer> customerBookingList= new ArrayList<>();
    //    Header file CSV Booking
    private static final String FILE_HEADER = "Name,Name service";
    //    Write file CSV
    public static void writeToCSV(List<Customer> list,Services service) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter= null;
        try {
            fileWriter = new FileWriter(DATA_BOOKING_CSV);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FILE_HEADER).append(NEW_LINE_SEPARATOR);
            for (Customer customer : list) {
                stringBuilder.append(customer.getName()).append(COMMA_DELIMITER);
                stringBuilder.append(customer.useServices(service).getNameService()).append(COMMA_DELIMITER);
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
    public static List<Customer> getFileCSV(Services service) {
        BufferedReader bufferedReader = null;
        Path path = Paths.get(DATA_BOOKING_CSV);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(DATA_BOOKING_CSV);
            } catch (Exception e) {
                {
                    System.out.println(e.getMessage());
                }
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(DATA_BOOKING_CSV));
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
