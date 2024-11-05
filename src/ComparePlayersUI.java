import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class is used strictly for its main method. This class runs the program
 * displays a menu for a good UI.
 * 
 * @author Ryan Van Witzenburg email: vanwitrf@miamioh.edu CSE 271-C
 *
 */
public class ComparePlayersUI {

    // Private String variable that aids in condensing the main method.
    private static final String INPUT_PROMPT = "Welcome to NBA Player "
            + "comparisons.\n\tWhat would you like to do [0 for menu]: ";

    // Private String variable that aids in condensing the main method.
    private static final String LIST_INTRO = "This is the final season "
            + "average's from each player in the NBA.\n"
            + "The list is currently sorted by points per game.\n";

    // Private String variable that aids in condensing the main method.
    private static final String MENU = "    0. Show this menu\n"
            + "    1. Add the current seasons stats from a text file to a list\n"
            + "    2. Prints all players and their final regular season stats\n"
            + "    3. Finds the average stats for each category from all players\n"
            + "    4. Shows entire list of hierarchy ratings in order\n"
            + "   -1. Quit\n";

    /**
     * This is a method that aids the program in adding the items from a user
     * input text file into a list
     * 
     * @param sc
     * @param cp
     */
    private static void addItems(Scanner sc, ComparePlayers cp) {
        System.out.print("Enter file name to add the season stats: ");
        final String fileName = sc.next();
        try {
            cp.addItemsFromFile(fileName);
        } catch (FileNotFoundException e) {
            // ^^throws exception if the file entered by user doesn't exist
            e.printStackTrace();
        }
    }

    /**
     * This is the main method which runs the program. It includes a switch case
     * method that acts as a menu for the program.
     * 
     * @param args variable for a standard main method
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ComparePlayers cp = new ComparePlayers();
            do {
                System.out.printf(INPUT_PROMPT);
                final int choice = sc.nextInt();

                // Switch-case loop that acts as a menu when users give a number
                // which corresponds to their desired option.
                switch (choice) {
                case 0:
                    System.out.println(MENU);
                    break;
                case 1:
                    addItems(sc, cp);
                    System.out.printf("Season Stats saved to program!%n%n");
                    break;
                case 2:
                    System.out.printf(LIST_INTRO);
                    cp.printAllPlayers();
                    break;
                case 3:
                    cp.displayAveragePlayer();
                    break;
                case 4:
                    cp.findHierarchyScore();
                    break;
                case -1:
                    return;
                default:
                    System.out.println("Invalid option.");
                }
            } while (true);
        }
    }
}
