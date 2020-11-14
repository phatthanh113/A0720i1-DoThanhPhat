package Commons;

import Models.Villa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MethodFileVillaCSV {
    private static final String COMMA_DELIMITER = "," ;
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileVilla = "src/Data/Villa.csv";
//    Header file CSV Villa
    private static final String FILE_HEADER =  "nameService, usedArea, priceRent, numberPeople, rentType, id,standardsRoom,facilities,areaPool,floor";
//    Write file CSV
    public static void writeToCSV (ArrayList<Villa> list) {
        FileWriter fileWriter = null ;
        try {
            fileWriter = new FileWriter(fileVilla);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa : list) {
                fileWriter.append(villa.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getUsedArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getPriceRent()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRentType()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getStandardsRoom());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getFacilities());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaPool()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getFloor()));
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
    public static ArrayList<Villa> getFileCSV() {
        BufferedReader bufferedReader = null ;
        ArrayList<Villa> villaArrayList= new ArrayList<>();
        Path path = Paths.get(fileVilla);
        if (!Files.exists(path)) {
            try{
                Writer writer = new FileWriter(fileVilla);
            }catch (Exception e){{
                System.out.println(e.getMessage());
            }
        }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileVilla));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if(split[0].equals("nameService")){
                    continue;
                }
                Villa villa = new Villa(null,0,0,0,0,0);
                villa.setNameService(split[0]);
                villa.setUsedArea(Double.parseDouble(split[1]));
                villa.setPriceRent(Double.parseDouble(split[2]));
                villa.setNumberPeople(Integer.parseInt(split[3]));
                villa.setRentType(Integer.parseInt(split[4]));
                villa.setId(Integer.parseInt(split[5]));
                villa.setStandardsRoom(split[6]);
                villa.setFacilities(split[7]);
                villa.setAreaPool(Double.parseDouble(split[8]));
                villa.setFloor(Integer.parseInt(split[9]));
                villaArrayList.add(villa);
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
        return villaArrayList;
    }
}
