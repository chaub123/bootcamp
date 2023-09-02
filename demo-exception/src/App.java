public class App {
    public static void main(String[] args) throws Exception {
        int i = 0;
        int n = 100;
        int result = 0;
        
        try{
            result = n / i;
        }catch(ArithmeticException | NullPointerException e){
            result = 0;
        }

        System.out.println(result);
    }
}
