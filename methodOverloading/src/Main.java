public class Main {
    public static void main(String[] args) {
        FourTransaction fourTransaction = new FourTransaction();
        System.out.println(fourTransaction.collect(2,3));
        System.out.println(fourTransaction.collect(2,3,5));
    }
}
