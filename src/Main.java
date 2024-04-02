import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        //xTODO: Make a Computer object, using the default constructor
        //xTODO: Make an array list of Computer objects to represent the shopping cart

        int option;
        double capacity, speed, price;
        String manufacturer, core, maxRes, type;

        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print(
                    "\n********************************************************************\n"
                            + "**                                                                **\n"
                            + "**                  BUILD YOUR OWN COMPUTER!                      **\n"
                            + "**                                                                **\n"
                            + "********************************************************************\n"
                            + "** Please select from the following options:                      **\n"
                            + "** 1) Configure CPU                                               **\n"
                            + "** 2) Configure RAM                                               **\n"
                            + "** 3) Configure Storage                                           **\n"
                            + "** 4) Configure Video Card                                        **\n"
                            + "** 5) Display Computer Configuration                              **\n"
                            + "** 6) Add Computer to Shopping Cart                               **\n"
                            + "** 7) Display Entire Shopping Cart                                **\n"
                            + "** 8) Checkout                                                    **\n"
                            + "********************************************************************\n"
                            + ">> ");

            option = keyboard.nextInt();
            keyboard.nextLine();

            switch (option) {
                case 1: // CPU
                    System.out.println("~~~CPU~~~");
                    System.out.print("Enter manufacturer: ");
                    manufacturer = keyboard.nextLine();
                    System.out.print("Enter core: ");
                    core = keyboard.nextLine();
                    System.out.print("Enter speed (GHz): ");
                    speed = keyboard.nextDouble();
                    System.out.print("Enter price $ ");
                    price = keyboard.nextDouble();
                    //tDO: Instantiate new CPU object
                    break;
                case 2: // RAM
                    System.out.println("~~~RAM~~~");
                    System.out.print("Enter manufacturer: ");
                    manufacturer = keyboard.nextLine();
                    System.out.print("Enter capacity (GB): ");
                    capacity = keyboard.nextDouble();
                    System.out.print("Enter speed (MHz): ");
                    speed = keyboard.nextDouble();
                    System.out.print("Enter price $ ");
                    price = keyboard.nextDouble();
                    //DO: Instantiate new RAM object
                    break;
                case 3: // Storage
                    System.out.println("~~~Storage~~~");
                    System.out.print("Enter manufacturer: ");
                    manufacturer = keyboard.nextLine();
                    System.out.print("Enter capacity (TB): ");
                    capacity = keyboard.nextDouble();
                    keyboard.nextLine();
                    System.out.print("Enter type: ");
                    type = keyboard.nextLine();
                    System.out.print("Enter price $ ");
                    price = keyboard.nextDouble();
                    //DO: Instantiate new Storage object
                    break;
                case 4: // Video Card
                    System.out.println("~~~Video Card~~~");
                    System.out.print("Enter manufacturer: ");
                    manufacturer = keyboard.nextLine();
                    System.out.print("Enter capacity: ");
                    capacity = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.print("Enter maximum resolution: ");
                    maxRes = keyboard.nextLine();
                    System.out.print("Enter price $ ");
                    price = keyboard.nextDouble();
                    //DO: Instantiate new VideoCard object
                    break;
                case 5: // Display Computer Configuration
                    //ODO: Print the Computer object to the screen

                    break;
                case 6: // Add Computer to Shopping Cart
                    // ODO: If any of the components (CPU, RAM, Storage or VideoCard) is null,
                    // ODO: display error message.
                    // ODO: Otherwise, add the Computer to the shopping cart (array list)
                    System.err.println("Configure CPU before adding to cart");
                    System.err.println("Configure RAM before adding to cart");
                    System.err.println("Configure Storage before adding to cart");
                    System.err.println("Configure VideoCard before adding to cart");
                    System.out.println("Computer added to cart successfully.");
                    break;
                case 7: // Display Entire Shopping Cart
                    // TDO: If shopping cart is empty, please display the error message below,
                    // Otherwise, loop through the cart and print out each Computer object.
                    System.err.println("No computers added to cart...yet");
                    break;
                case 8: // Checkout
                    // TDO: If shopping cart is empty, please display the error message below,
                    System.err.println("No computers added to cart...yet");
                    // TOO: Otherwise, implement a method that calculates the entire cost of the order by summing the total cost of
                    // TOO: each Computer object in the shopping cart.
                    System.out.println("Please pay " + " to checkout.");
                    System.out.println("Thanks for your business!  Happy Computing!");
                    break;
                default:
                    System.err.println("Enter valid option between 1-7.");
                    Thread.sleep(5);

            }
        } while (option != 8);

        keyboard.close();
    }

    // TOO: Implement a method named totalCost, which takes an ArrayList as its parameter, loops through each Computer object
    // TOO: and sums all prices of the computers in the shopping cart.
}