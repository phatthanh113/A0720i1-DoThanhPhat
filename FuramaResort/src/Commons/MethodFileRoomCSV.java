package Commons;

import Models.Room;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MethodFileRoomCSV {
    private static final String COMMA_DELIMITER = "," ;
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String DATA_ROOM_CSV = "src/Data/Room.csv";
    private static List<Room> roomArrayList= new ArrayList<>();
    //    Header file CSV Villa
    private static final String FILE_HEADER =  "nameService, usedArea, priceRent, numberPeople, rentType, id,freeServices";
    //    Write file CSV
    public static void writeToCSV (List<Room> list) {
        FileWriter fileWriter = null ;
        BufferedWriter bufferedWriter= null;
        try {
            fileWriter = new FileWriter(DATA_ROOM_CSV);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FILE_HEADER).append(NEW_LINE_SEPARATOR);
            for (Room room : list) {
                stringBuilder.append(room.getNameService()).append(COMMA_DELIMITER);
                stringBuilder.append(room.getUsedArea()).append(COMMA_DELIMITER);
                stringBuilder.append(room.getPriceRent()).append(COMMA_DELIMITER);
                stringBuilder.append(room.getNumberPeople()).append(COMMA_DELIMITER);
                stringBuilder.append(room.getRentType()).append(COMMA_DELIMITER);
                stringBuilder.append(room.getId()).append(COMMA_DELIMITER);
                stringBuilder.append(room.getFreeServices()).append(COMMA_DELIMITER);
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
    public static List<Room> getFileCSV() {
        BufferedReader bufferedReader = null ;
        Path path = Paths.get(DATA_ROOM_CSV);
        if (!Files.exists(path)) {
            try{
                Writer writer = new FileWriter(DATA_ROOM_CSV);
            }catch (Exception e){{
                System.out.println(e.getMessage());
            }
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(DATA_ROOM_CSV));
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
