package Commons;

import Models.Villa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MethodFileVillaCSV {
    private static final String COMMA_DELIMITER = "," ;
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String DATA_VILLA_CSV = "src/Data/Villa.csv";
    //    Header file CSV Villa
    private static final String FILE_HEADER =  "nameService, usedArea, priceRent, numberPeople, rentType, id,standardsRoom,facilities,areaPool,floor";
    //    Write file CSV
    public static void writeToCSV (List<Villa> list) {
        File file = new File(DATA_VILLA_CSV);
        FileWriter fileWriter ;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FILE_HEADER).append(NEW_LINE_SEPARATOR);
            for (Villa villa : list) {
                stringBuilder.append(villa.getNameService()).append(COMMA_DELIMITER);
                stringBuilder.append(villa.getUsedArea()).append(COMMA_DELIMITER);
                stringBuilder.append(villa.getPriceRent()).append(COMMA_DELIMITER);
                stringBuilder.append(villa.getNumberPeople()).append(COMMA_DELIMITER);
                stringBuilder.append(villa.getRentType()).append(COMMA_DELIMITER);
                stringBuilder.append(villa.getId()).append(COMMA_DELIMITER);
                stringBuilder.append(villa.getStandardsRoom()).append(COMMA_DELIMITER);
                stringBuilder.append(villa.getFacilities()).append(COMMA_DELIMITER);
                stringBuilder.append(villa.getAreaPool()).append(COMMA_DELIMITER);
                stringBuilder.append(villa.getFloor()).append(NEW_LINE_SEPARATOR);
            }
            bufferedWriter.write(stringBuilder.toString());
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
    public static List<Villa> getFileCSV() {
        List<Villa> villaArrayList= new ArrayList<>();
        BufferedReader bufferedReader = null ;
        Path path = Paths.get(DATA_VILLA_CSV);
        if (!Files.exists(path)) {
            try{
                Writer writer = new FileWriter(DATA_VILLA_CSV);
            }catch (Exception e){{
                System.out.println(e.getMessage());
            }
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(new File(DATA_VILLA_CSV)));
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

    public static void main(String[] args) {
        List<Villa> villaList = new ArrayList<>();
        Villa villa = new Villa("12",12,12,12,12,12,"12","12",12,12);
        villaList.add(villa);
        villaList.add(villa);
        writeToCSV(villaList);
    }
}