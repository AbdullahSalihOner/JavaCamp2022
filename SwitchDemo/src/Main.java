public class Main {
    public static void main(String[] args) {
        char grade = 'D';

        switch (grade){
            case 'A':
                System.out.println("Congratulations : Passed");
                break;
            case 'B':
                System.out.println("So Good : Passed");
                break;
            case 'C':
                System.out.println("Good : Passed");
                break;
            case 'D':
                System.out.println("Not Bad : Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid point");
        }
    }
}
