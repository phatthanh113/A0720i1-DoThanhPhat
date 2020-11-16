package Commons;

import Models.Room;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MethodFileRoomCSV {
    private static final String COMMA_DELIMITER = "," ;
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileRoom = "src/Data/Room.csv";
    private static ArrayList<Room> roomArrayList= new ArrayList<>();
    //    Header file CSV Villa
    private static final String FILE_HEADER =  "nameService, usedArea, priceRent, numberPeople, rentType, id,freeServices";
    //    Write file CSV
    public static void writeToCSV (ArrayList<Room> list) {
        FileWriter fileWriter = null ;
        try {
            fileWriter = new FileWriter(fileRoom);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room : list) {
                fileWriter.append(room.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getUsedArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getPriceRent()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getNumberPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getRentType()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getFreeServices()));
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
    public static ArrayList<Room> getFileCSV() {
        BufferedReader bufferedReader = null ;
        Path path = Paths.get(fileRoom);
        if (!Files.exists(path)) {
            try{
                Writer writer = new FileWriter(fileRoom);
            }catch (Exception e){{
                System.out.println(e.getMessage());
            }
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileRoom));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if(split[0].equals("nameService")){
                    continue;
                }
                Room room = new Room(null,0,0,0,0,0);
                room.setNameService(split[0]);
                room.setUsedArea(Double.parseDouble(split[1]));
                room.setPriceRent(Double.parseDouble(split[2]));
                room.setNumberPeople(Integer.parseInt(split[3]));
                room.setRentType(Integer.parseInt(split[4]));
                room.setId(Integer.parseInt(split[5]));
                room.setFreeServices(split[6]);
                roomArrayList.add(room);
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
        return roomArrayList;
    }
}
