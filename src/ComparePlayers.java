import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is a class that does most of the main operating. I attempted to disperse
 * the amount of classes more evenly, but the structure I used condensed most of
 * the methods to this class. This is the top, grandfather class.
 * 
 * @author Ryan Van Witzenburg email: vanwitrf@miamioh.edu CSE 271-C
 *
 */
public class ComparePlayers {

    // Two protected lists that hold information about the NBAPlayers
    protected ArrayList<NBAPlayer> list;
    protected ArrayList<NBAPlayer> hierarchyList;

    /**
     * This is a constructor that initializes the two Array Lists when a
     * ComaprePlayers object is created.
     */
    public ComparePlayers() {
        list = new ArrayList<>();
        hierarchyList = new ArrayList<>();
    }

    /**
     * This is a method that aids in adding the information from the user given
     * text file to the Array List "list".
     * 
     * @param fileName variable name for the text file's name
     * @throws FileNotFoundException method throws exception if no file is given
     */
    public void addItemsFromFile(String fileName) throws FileNotFoundException {
        // Created scanner to traverse the given file
        Scanner fileReader = new Scanner(new File(fileName));
        String addLine = "";
        // While loop that loops through file until there is no next line.
        while (fileReader.hasNextLine()) {
            addLine = fileReader.nextLine();
            addToArray(addLine);
        }
    }

    /**
     * This is a method that takes all the information from the text file and
     * clashes them together to create new Basketball Players
     * 
     * @param file variable name for the text file's name
     */
    public void addToArray(String file) {
        Scanner sc = new Scanner(file);
        // While loop that loops through file until all elements are added.
        while (sc.hasNext()) {
            // First and last name's are combined into one String "name"
            String firstName = sc.next();
            String lastName = sc.next();
            String name = firstName + " " + lastName;
            addPlayer(name, sc.nextFloat(), sc.nextFloat(), sc.nextFloat(),
                    sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        }
    }

    /**
     * This method is the finally creates the player from the text file
     * information and simultaneously adds it to the Array List "list".
     * 
     * @param name        variable for the name of the player
     * @param pointsPG    variable for a player's points per game
     * @param reboundsPG  variable for a player's rebounds per game
     * @param assistsPG   variable for a player's assists per game
     * @param stealsPG    variable for a player's steals per game
     * @param blocksPG    variable for a player's blocks per game
     * @param turnoversPG variable for a player's turnovers per game
     */
    public void addPlayer(String name, float pointsPG, float reboundsPG,
            float assistsPG, float stealsPG, float blocksPG,
            float turnoversPG) {
        list.add(new NBAPlayer(name, pointsPG, reboundsPG, assistsPG, stealsPG,
                blocksPG, turnoversPG));
    }

    /**
     * This method prints out all the players in the list in order of the player
     * with the most points scored per game on average.
     */
    public void printAllPlayers() {
        System.out.println("List of all items:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    /**
     * This method creates an object from the AverageNBAPLayer grand-child class
     * and prints it using its toString method.
     */
    public void displayAveragePlayer() {
        // creates an AveragePlayer object with the methods beneath
        AverageNBAPlayer av = new AverageNBAPlayer("Average Player:",
                findAveragePointsPG(), findAverageReboundsPG(),
                findAverageAssistsPG(), findAverageStealsPG(),
                findAverageBlocksPG(), findAverageTurnoversPG());
        System.out.println(av.toString());
    }

    /**
     * This is a method that determines the average number of average points per
     * game of every player in the NBA.
     * 
     * @return returns the average number of average points per game of every
     *         player in the NBA
     */
    public float findAveragePointsPG() {
        float average = 0.0f;
        // goes through list to add together all average points
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i).getPointsPG();
        }
        return average / list.size();
    }

    /**
     * This is a method that determines the average number of average rebounds
     * per game of every player in the NBA.
     * 
     * @return returns the average number of average rebounds per game of every
     *         player in the NBA
     */
    public float findAverageReboundsPG() {
        float average = 0.0f;
        // goes through list to add together all average rebounds
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i).getReboundsPG();
        }
        return average / list.size();
    }

    /**
     * This is a method that determines the average number of average assists
     * per game of every player in the NBA.
     * 
     * @return returns the average number of average assists per game of every
     *         player in the NBA
     */
    public float findAverageAssistsPG() {
        float average = 0.0f;
        // goes through list to add together all average assists
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i).getAssistsPG();
        }
        return average / list.size();
    }

    /**
     * This is a method that determines the average number of average steals per
     * game of every player in the NBA.
     * 
     * @return returns the average number of average steals per game of every
     *         player in the NBA
     */
    public float findAverageStealsPG() {
        float average = 0.0f;
        // goes through list to add together all average steals
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i).getStealsPG();
        }
        return average / list.size();
    }

    /**
     * This is a method that determines the average number of average blocks per
     * game of every player in the NBA.
     * 
     * @return returns the average number of average blocks per game of every
     *         player in the NBA
     */
    public float findAverageBlocksPG() {
        float average = 0.0f;
        // goes through list to add together all average blocks
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i).getBlocksPG();
        }
        return average / list.size();
    }

    /**
     * This is a method that determines the average number of average turnovers
     * per game of every player in the NBA.
     * 
     * @return returns the average number of average turnovers per game of every
     *         player in the NBA
     */
    public float findAverageTurnoversPG() {
        float average = 0.0f;
        // goes through list to add together all average turnovers
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i).getTurnoversPG();
        }
        return average / list.size();
    }

    /**
     * This method determines the hierarchy score of each player in the NBA.
     */
    public void findHierarchyScore() {
        float hierarchyScore = 0.0f;
        for (int i = 0; i < list.size(); i++) {
            hierarchyScore = 0.0f;
            // To determine the hierarchy score, we add the average per game of
            // points, rebounds, assists, steals, and blocks
            hierarchyScore += list.get(i).getPointsPG()
                    + list.get(i).getReboundsPG() + list.get(i).getAssistsPG()
                    + list.get(i).getStealsPG() + list.get(i).getBlocksPG();
            // Then that is subtracted by a bad statistic, average turnovers per
            // game.
            hierarchyScore -= list.get(i).getTurnoversPG();
            addToHierarchyArray(hierarchyScore, list.get(i).getName());
        }

        // calls method to sort the hierarchy list
        sortHierarchyList();

        // Prints out hierarchy score list in order: highest to lowest
        printHierarchyList();

    }

    /**
     * This method adds a NBA Player to a new ArrayList with only their name and
     * their deserving hierarchy score.
     * 
     * @param hierarchyScore variable that holds a player's hierarchy score
     * @param name           variable that holds a player's name.
     */
    public void addToHierarchyArray(float hierarchyScore, String name) {
        hierarchyList.add(new NBAPlayer(hierarchyScore, name));
    }

    /**
     * This method prints out hierarchy score list in order: highest to lowest
     */
    public void printHierarchyList() {
        System.out.println("Hierarchy list of 2021-2022 NBA players:");
        for (int i = 0; i < hierarchyList.size(); i++) {
            System.out.println(hierarchyList.get(i).toStringHierarchy());
        }
    }

    /**
     * This method sorts the NBA Players by hierarchy score from highest to
     * lowest.
     */
    public void sortHierarchyList() {
        int count = 0;
        // while loop to make sure the list is sorted until every element is
        // complete.
        while (count < hierarchyList.size()) {
            // boolean variable to cut off loop early to save time complexity
            // when
            // loop is fully sorted.
            boolean end = true;
            for (int i = 0; i < hierarchyList.size() - 1; i++) {
                // swaps indices next to each other if one is larger than the
                // other
                if (hierarchyList.get(i).getHierarchyScore() < hierarchyList
                        .get(i + 1).getHierarchyScore()) {
                    NBAPlayer temp = hierarchyList.get(i);
                    hierarchyList.set(i, hierarchyList.get(i + 1));
                    hierarchyList.set(i + 1, temp);
                    end = false;
                }
            }
            // ends loops if loop is completely sorted.
            if (end) {
                break;
            }
            count++;
        }
    }

}
