package Commons;

import Models.House;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MethodFileHouseCSV {
    private static final String COMMA_DELIMITER = "," ;
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileHouse = "src/Data/House.csv";
    //    Header file CSV Villa
    private static final String FILE_HEADER =  "nameService, usedArea, priceRent, numberPeople, rentType, id,standardsRoom,facilities,floor";
    //    Write file CSV
    public static void writeToCSV (ArrayList<House> list) {
        FileWriter fileWriter = null ;
        try {
            fileWriter = new FileWriter(fileHouse);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house : list) {
                fileWriter.append(house.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getUsedArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getPriceRent()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getNumberPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getRentType()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getStandardsRoom());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getFacilities());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getFloor()));
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
    public static ArrayList<House> getFileCSV() {
        BufferedReader bufferedReader = null ;
        ArrayList<House> houseArrayList= new ArrayList<>();
        Path path = Paths.get(fileHouse);
        if (!Files.exists(path)) {
            try{
                Writer writer = new FileWriter(fileHouse);
            }catch (Exception e){{
                System.out.println(e.getMessage());
            }
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileHouse));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if(split[0].equals("nameService")){
                    continue;
                }
                House house = new House(null,0,0,0,0,0);
                house.setNameService(split[0]);
                house.setUsedArea(Double.parseDouble(split[1]));
                house.setPriceRent(Double.parseDouble(split[2]));
                house.setNumberPeople(Integer.parseInt(split[3]));
                house.setRentType(Integer.parseInt(split[4]));
                house.setId(Integer.parseInt(split[5]));
                house.setStandardsRoom(split[6]);
                house.setFacilities(split[7]);
                house.setFloor(Integer.parseInt(split[8]));
                houseArrayList.add(house);
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
        return houseArrayList;
    }
}
