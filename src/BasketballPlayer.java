/**
 * This class is an abstract class with the two child classes NBAPlayer and
 * AverageNBAPlayer. This class creates common constructors and needed getter
 * methods for the ComparePlayers to use.
 * 
 * @author Ryan Van Witzenburg email: vanwitrf@miamioh.edu CSE 271-C
 *
 */
public abstract class BasketballPlayer extends ComparePlayers {

    // private variables that are set through the child classes
    private String name;
    private float pointsPG;
    private float reboundsPG;
    private float assistsPG;
    private float stealsPG;
    private float blocksPG;
    private float turnoversPG;
    private float hierarchyScore;

    /**
     * Constructor that sets various variables for both child classes and saves
     * them into this classes private variables.
     * 
     * @param name variable for the name of the player
     * @param ppg  variable for a player's points per game
     * @param rpg  variable for a player's rebounds per game
     * @param apg  variable for a player's assists per game
     * @param spg  variable for a player's steals per game
     * @param bpg  variable for a player's blocks per game
     * @param topg variable for a player's turnovers per game
     */
    public BasketballPlayer(String name, float ppg, float rpg, float apg,
            float spg, float bpg, float topg) {

        this.name = name;
        pointsPG = ppg;
        reboundsPG = rpg;
        assistsPG = apg;
        stealsPG = spg;
        blocksPG = bpg;
        turnoversPG = topg;

    }

    /**
     * Constructor for the hierarchy score of each NBAPlayer as well as an
     * AverageNBAPlayer.
     * 
     * @param hs   variable for a player's hierarchy score
     * @param name variable for a player's name
     */
    public BasketballPlayer(float hs, String name) {

        hierarchyScore = hs;
        this.name = name;

    }

    /**
     * This is a getter method that gets the name of a BasketballPlayer.
     * 
     * @return returns the name of a BasketballPlayer
     */
    public String getName() {
        return name;
    }

    /**
     * This is a getter method that gets the average points per game of a
     * BasketballPlayer.
     * 
     * @return returns the average points per game of a BasketballPlayer
     */
    public float getPointsPG() {
        return pointsPG;
    }

    /**
     * This is a getter method that gets the average rebounds per game of a
     * BasketballPlayer.
     * 
     * @return returns the average rebounds per game of a BasketballPlayer
     */
    public float getReboundsPG() {
        return reboundsPG;
    }

    /**
     * This is a getter method that gets the average assists per game of a
     * BasketballPlayer.
     * 
     * @return returns the average assists per game of a BasketballPlayer
     */
    public float getAssistsPG() {
        return assistsPG;
    }

    /**
     * This is a getter method that gets the average steals per game of a
     * BasketballPlayer.
     * 
     * @return returns the average steals per game of a BasketballPlayer
     */
    public float getStealsPG() {
        return stealsPG;
    }

    /**
     * This is a getter method that gets the average blocks per game of a
     * BasketballPlayer.
     * 
     * @return returns the average blocks per game of a BasketballPlayer
     */
    public float getBlocksPG() {
        return blocksPG;
    }

    /**
     * This is a getter method that gets the average turnovers per game of a
     * BasketballPlayer.
     * 
     * @return returns the average turnovers per game of a BasketballPlayer
     */
    public float getTurnoversPG() {
        return turnoversPG;
    }

    /**
     * This is a getter method that gets the hierarchy score of a
     * BasketballPlayer.
     * 
     * @return returns the hierarchy score of a BasketballPlayer
     */
    public float getHierarchyScore() {
        return hierarchyScore;
    }

    /**
     * This is an abstract method that will be defined in its child classes.
     */
    public abstract String toString();

}
