/**
 * This class is a child to BasketballPlayer class. This class allows this
 * program to examine all the player's season statistics in each category and
 * create an average baseline player.
 * 
 * @author Ryan Van Witzenburg email: vanwitrf@miamioh.edu CSE 271-C
 *
 */
public class AverageNBAPlayer extends BasketballPlayer {

    /**
     * This is a constructor that makes an Average NBA Player with all their
     * combined average season statistics from their real actual statistics from
     * a text file.
     * 
     * @param name variable for the name of the player
     * @param ppg  variable for a player's points per game
     * @param rpg  variable for a player's rebounds per game
     * @param apg  variable for a player's assists per game
     * @param spg  variable for a player's steals per game
     * @param bpg  variable for a player's blocks per game
     * @param topg variable for a player's turnovers per game
     */
    public AverageNBAPlayer(String name, float ppg, float rpg, float apg,
            float spg, float bpg, float topg) {

        super(name, ppg, rpg, apg, spg, bpg, topg);        

    }

    /**
     * This method correctly formats the information of the AverageNBAPlayer
     * class when printing the league's combined season average statistics.
     */
    public String toString() {
        return String.format(
                "%n%s\tPoints: %.1f\t Rebounds: %.1f\tAssists: %.1f\tSteals: %.1f\tBlocks: %.1f\tTurnovers: %.1f%n",
                getName(), getPointsPG(), getReboundsPG(), getAssistsPG(),
                getStealsPG(), getBlocksPG(), getTurnoversPG());
    }
    
    

}
