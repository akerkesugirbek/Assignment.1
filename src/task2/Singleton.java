package task2;

public class Singleton {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();


        logger1.log("This is the first log message");
        logger2.log("This is the second log message");


        System.out.println(logger1 == logger2);
    }
}
