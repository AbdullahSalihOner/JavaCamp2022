import com.sun.source.tree.WhileLoopTree;

public class Main {
    public static void main(String[] args) {
        //For Loop
        for (int i = 1 ; i< 10 ; i++){
            System.out.println(i);
        }
        System.out.println("For Loop Done\n");


        //While
        int i = 1;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While Loop Done\n");

        //DoWhile
        int j = 1;
        do {
            System.out.println(j);
            j++;
        }while (j<10);
        System.out.println("Do-While Loop Done\n");


    }
}
