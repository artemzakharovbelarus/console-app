package by.javatr.library.util.generator;

public class IdGenerator {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 1_000_000;
    private static int counter;

    private IdGenerator(){}

    public static int generate(){
        int id = 0;
        ++counter;
        if (MIN_VALUE + counter >= MAX_VALUE){
            counter = 0;
        }
        id = counter;

        return id;
    }
}
