import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        createFile();
        getFileInfo();
        readFile();
       // writeFile();
        readFile();
    }
    public  static void createFile(){
        File file= new File("C:\\Users\\Asus\\IdeaProjects\\javaCamp\\student.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File Created");
            }else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  static void getFileInfo(){
        File file= new File("C:\\Users\\Asus\\IdeaProjects\\javaCamp\\student.txt");
        if (file.exists()){
            System.out.println("File name:"+file.getName());
            System.out.println("File pathway:"+file.getAbsolutePath());
            System.out.println("Is file readable:"+file.canRead());
            System.out.println("Is the file writable?:"+file.canWrite());
            System.out.println("File size(bytes):"+file.length());
        }

    }
    public static void readFile(){
        File file= new File("C:\\Users\\Asus\\IdeaProjects\\javaCamp\\student.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line =reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Asus\\IdeaProjects\\javaCamp\\student.txt",true));
            writer.newLine();
            writer.write("Abdullah");
            System.out.println("File Wrote");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
