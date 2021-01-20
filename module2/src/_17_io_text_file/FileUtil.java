package _17_io_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static final String FILE_PATH = "src/_17_io_text_file/student.csv";
    public static final String COMMA = ",";

    public static void writeCSV(Student student) {
        File file = new File(FILE_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(student.getId()).append(COMMA).append(student.getName()).append("\n");

            bufferedWriter.write(stringBuilder.toString());

            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readCSV() {
        List<Student> studentList = new ArrayList<>();
        File file = new File(FILE_PATH);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buffRead = new BufferedReader(fileReader);

            String line;
            String[] temp;
            Student student;

            while ((line = buffRead.readLine()) != null) {
                temp = line.split(",");
                student = new Student(Integer.parseInt(temp[0]),temp[1]);
                studentList.add(student);
            }

            buffRead.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public static void main(String[] args) {
//        FileUtil.writeCSV(new Student(1, "Nam"));
//        FileUtil.writeCSV(new Student(2, "Vu"));
//        FileUtil.writeCSV(new Student(3, "Dat"));

        List<Student> studentList = FileUtil.readCSV();
        for(Student student: studentList){
            System.out.println(student);
        }
        studentList.remove(1);
        for(Student student: studentList){
            FileUtil.writeCSV(student);
            System.out.println(student);
        }
    }
}
