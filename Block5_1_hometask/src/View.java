/**
 * A view generates an output presentation to the user based on changes in the model.
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 21.05.16)
 */
public class View {
    // Text's constants
    public static final String INPUT_INT_HOUR_DATA = "Input HOUR value in range [0-23]= ";
    public static final String INPUT_INT_MINUTE_DATA = "Input MINUTE value = ";
    public static final String INPUT_INT_SECOND_DATA = "Input SECOND value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String CHOOSE_OPERATION = "ENTER NUMBER 1-6 to choose operation:\n" +
            "0. add 1 hour\n" +
            "1. subtract 1 hour\n" +
            "2. add 1 minute\n" +
            "3. subtract 1 minute\n" +
            "4. add 1 second\n" +
            "5. subtract 1 second\n" +
            "6. break\n";
    public static final String BREAK = "BREAK!!! ";

    /**
     * prints the corresponding message
     *
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }


}
