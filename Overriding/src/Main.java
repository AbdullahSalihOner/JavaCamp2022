public class Main {
    public static void main(String[] args) {

        BaseCreditManager[] baseCreditManager = new BaseCreditManager[]{new AgriculturalCreditManager(),
                new TeacherCreditManager(),new StudentCreditManager()};

        for (BaseCreditManager creditManager :baseCreditManager){
            System.out.println(creditManager.calculate(1000));
        }
    }
}
