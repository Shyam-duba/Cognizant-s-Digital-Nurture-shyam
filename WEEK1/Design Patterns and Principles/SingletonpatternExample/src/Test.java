public class Test {
    public void test(){
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        /*
         Both logger1 and logger2 must have same reference to
         the object so there hashcodes must be same.


         the .equals() method compares the hashcodes of the objects
         */


        if (logger1.equals(logger2)){
            System.out.println("Singleton pattern works successfully!");
        }

        System.out.println("Singleton pattern not implemented correctly!");
    }
}
