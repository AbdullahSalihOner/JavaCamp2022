import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        String message = "The weather is very nice today.";
        System.out.println(message);

        /*System.out.println("Number Of Elements : " + message.length());
        System.out.println("5.Element : "+ message.charAt(4));
        System.out.println(message.concat(" Yes!"));
        System.out.println(message.startsWith("b"));
        System.out.println(message.endsWith("."));
        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(c);
        System.out.println(message.indexOf("av"));
        System.out.println(message.lastIndexOf("a"));


*/


        String newMessage = message.replace(' ','-');
        System.out.println(newMessage);
        System.out.println(newMessage.substring(2,5));
        //System.out.println(message.trim());

        for (String word : message.split("")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }
}
