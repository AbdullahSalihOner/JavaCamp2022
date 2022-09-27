public class Main {
    public static void main(String[] args) {

        char letter = 'E';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Bold Vowel");
                break;
            default:
                System.out.println("Thin Vowel");

        }
    }
}
