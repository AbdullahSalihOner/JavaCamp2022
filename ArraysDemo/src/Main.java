public class Main {
    public static void main(String[] args) {
        String student1 = "Salih";
        String student2 = "Ahmet";
        String student3 = "Engin";
        String student4 = "Zeynep";

        String[] students = new String[4];
        students[0] = "Salih";
        students[1] = "Ahmet";
        students[2] = "Engin";
        students[3] = "Zeynep";

        for (int i = 0; i< students.length;i++){
            System.out.println(students[i]);
        }
        System.out.println("----------------------\n");

        for (String student:students){
            System.out.println(student);
        }

    }
}
