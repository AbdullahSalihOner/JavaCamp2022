public class Main {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 32 ;
        int number3 = 5;
        int biggest = number1 ;


        if (biggest<number2){
            biggest = number2;
        }
        if (biggest < number3){
            biggest = number3;
        }

        System.out.println(" Biggest : " + biggest);
    }
}
