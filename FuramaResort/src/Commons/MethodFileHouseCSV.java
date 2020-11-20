package Commons;

import Models.House;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MethodFileHouseCSV {
    private static final String COMMA_DELIMITER = "," ;
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String DATA_HOUSE_CSV = "src/Data/House.csv";
    private static List<House> houseArrayList = new ArrayList<>();
    //    Header file CSV Villa
    private static final String FILE_HEADER =  "nameService, usedArea, priceRent, numberPeople, rentType, id,standardsRoom,facilities,floor";
    //    Write file CSV
    public static void writeToCSV (List<House> list) {
        FileWriter fileWriter = null ;
        BufferedWriter bufferedWriter = null;
        try {
                fileWriter = new FileWriter(DATA_HOUSE_CSV,false);
                bufferedWriter = new BufferedWriter(fileWriter);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(FILE_HEADER).append(NEW_LINE_SEPARATOR);
                for (House house : list) {
                    stringBuilder.append(house.getNameService()).append(COMMA_DELIMITER);
                    stringBuilder.append(house.getUsedArea()).append(COMMA_DELIMITER);
                    stringBuilder.append(house.getPriceRent()).append(COMMA_DELIMITER);
                    stringBuilder.append(house.getNumberPeople()).append(COMMA_DELIMITER);
                    stringBuilder.append(house.getRentType()).append(COMMA_DELIMITER);
                    stringBuilder.append(house.getId()).append(COMMA_DELIMITER);
                    stringBuilder.append(house.getStandardsRoom()).append(COMMA_DELIMITER);
                    stringBuilder.append(house.getFacilities()).append(COMMA_DELIMITER);
                    stringBuilder.append(house.getFloor()).append(NEW_LINE_SEPARATOR);
            }
            bufferedWriter.write(String.valueOf(stringBuilder));
        }catch (Exception e) {
            System.out.println("error in CSV writter");
        }finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            }catch (Exception e) {
                System.out.println("error when flush or close");
            }
        }
    }
    //    Đọc file CSV
    public static List<House> getFileCSV() {
        BufferedReader bufferedReader = null ;
        Path path = Paths.get(DATA_HOUSE_CSV);
        if (!Files.exists(path)) {
            try{
                Writer writer = new FileWriter(DATA_HOUSE_CSV);
            }catch (Exception e){{
                System.out.println(e.getMessage());
            }
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(DATA_HOUSE_CSV));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if(split[0].equals("nameService")){
                    continue;
                }
                House house = new House(null,0,0,0,null,null);
                house.setNameService(split[0]);
                house.setUsedArea(Double.parseDouble(split[1]));
                house.setPriceRent(Double.parseDouble(split[2]));
                house.setNumberPeople(Integer.parseInt(split[3]));
                house.setRentType(split[4]);
                house.setId(split[5]);
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
