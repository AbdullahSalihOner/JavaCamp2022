public class Main {

    public static void main(String[] args) {
        numberFind();
        numberFind();
        numberFind();
        numberFind();
    }

    public static void numberFind(){
        int[] numbers = new int[]{1,2,5,7,9,0};
        int wanted = 5;
        boolean isThere = false;

        for (int number : numbers){
            if (number == wanted){
                isThere = true;
                break;
            }
        }
        if (isThere){
            getMessage("Number is Available "+wanted);
        }else{
            getMessage("Number is not Available: "+wanted);
        }
    }
    public static void getMessage(String message){
        System.out.println(message);
    }
}
