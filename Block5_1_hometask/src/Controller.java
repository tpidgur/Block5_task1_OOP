import java.util.Scanner;

/**
 * Class controller checks that the input date parameters (hour,minute, second) are correctly entered and  sends to the model
 * additional operations with time are provided using the menu of options
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 21.05.16)
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * The method sends commands after the correct value has been entered by user.
     */
    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setAllparameters(inputIntValueWithScanner(sc, View.INPUT_INT_HOUR_DATA, GlobalConstants.PRIMARY_HOUR_MAX_BARRIER),// the correct input (hour,minute,second) is sent to the model
                inputIntValueWithScanner(sc, View.INPUT_INT_MINUTE_DATA, GlobalConstants.PRIMARY_MINUTE_MAX_BARRIER),
                inputIntValueWithScanner(sc, View.INPUT_INT_SECOND_DATA, GlobalConstants.PRIMARY_SECOND_MAX_BARRIER));
        int k = 0;
        do { //at least once the menu option is chosen (for option number 6 (break) for example)
            k = inputIntValueWithScanner(sc, View.CHOOSE_OPERATION, GlobalConstants.MENU_OPTION_MAX_VALUE);
            chooseOperation(k);
        } while (k != GlobalConstants.MENU_OPTION_MAX_VALUE); //menu loop  until break option isn't chosen

    }

    // The Utility methods

    /**
     * checks for validity of the entered in console data
     *
     * @param sc            - parses int data
     * @param enterConstant - the invitation fro entering data
     * @param maxBarrier    - the allowed maximum barriae for entered data
     * @return - the int value (hour,minute, number of menu etc.)
     */
    public int inputIntValueWithScanner(Scanner sc, String enterConstant, int maxBarrier) {
        int res = 0;
        view.printMessage(enterConstant);

        while (true) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA
                        + enterConstant);
                sc.next();
            }
            // check value in range
            if ((res = sc.nextInt()) < GlobalConstants.PRIMARY_MIN_BARRIER ||
                    res > maxBarrier) {
                view.printMessage(View.WRONG_INPUT_INT_DATA
                        + enterConstant);
                continue;
            }
            break;
        }
        return res;
    }

    /**
     * the menu that chooses the corresponding operation in the model depending on the enetered data
     *
     * @param i number of chosen operation
     */
    public void chooseOperation(int i) {

        switch (i) {
            case 0:
                model.increaseOneHour();
                break;
            case 1:
                model.decreaseOneHour();
                break;
            case 2:
                model.increaseOneMinute();
                break;
            case 3:
                model.decreaseOneMinute();
                break;
            case 4:
                model.increaseOneSecond();
                break;
            case 5:
                model.decreaseOneSecond();
                break;
            case 6:
                view.printMessage(View.BREAK);
                break;
        }
        view.printMessage(model.toString());
    }
}




