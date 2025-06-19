public class Logger {
    private static Logger instance;

    /*
    Declaring constructor as private will not allow other
    classes to create the new instance of
    this singleton class.
    */
    private Logger(){};


    // provding only way to access the instance through getters and setters methods.
    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }

        return instance;
    }
}
