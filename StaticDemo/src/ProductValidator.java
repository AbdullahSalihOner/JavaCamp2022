public class ProductValidator {

    static {
        System.out.println("Static Constructor block worked");
    }
    public ProductValidator(){
        System.out.println("The constructor block worked");
    }
    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public void AThing(){

    }
    public static class AnotherClass{
        public static void delete(){

        }
    }
}
