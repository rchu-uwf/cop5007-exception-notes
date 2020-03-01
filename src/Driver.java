import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        int foo;
        Scanner keyboard = new Scanner(System.in);

        do {
            try {
                foo = Driver.getPositiveIntFromUser(keyboard);
            } catch (NegativeIntegerException e) {
                System.out.println("I said positive!!!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            } finally {
                System.out.println("---Finally---");
            }

        } while (true);

        System.out.println("Exiting!!!");
    }

    public static int getPositiveIntFromUser(Scanner keyboard) throws Exception {
        System.out.println("Enter a non-negative integer: ");
        int input = keyboard.nextInt();
        Driver.checkNonNegative(input);

        return input;

    }

    // TODO: 3/1/20 Ask about the exception class that should be thrown. 
    /* 
    public static void checkNonNegative(int input) throws NegativeIntegerException {
    When to throws Exception vs NegativeIntegerException ?
     */
    public static void checkNonNegative(int input) throws Exception {
        if (input < 0) {
            throw new NegativeIntegerException("Integer is less than zero.");
        }
    }
}
