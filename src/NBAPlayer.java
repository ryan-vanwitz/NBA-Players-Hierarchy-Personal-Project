/**
 * This class is a child to BasketballPlayer class. This class allows this
 * program to make an object for every NBA Player efficiently and effectively.
 * 
 * @author Ryan Van Witzenburg email: vanwitrf@miamioh.edu CSE 271-C
 *
 */
public class NBAPlayer extends BasketballPlayer {

    /**
     * This is a constructor that makes an NBA Player with all their average
     * season statistics from their real actual statistics from a text file.
     * 
     * @param name variable for the name of the player
     * @param ppg  variable for a player's points per game
     * @param rpg  variable for a player's rebounds per game
     * @param apg  variable for a player's assists per game
     * @param spg  variable for a player's steals per game
     * @param bpg  variable for a player's blocks per game
     * @param topg variable for a player's turnovers per game
     */
    public NBAPlayer(String name, float ppg, float rpg, float apg,
            float spg, float bpg, float topg) {

        super(name, ppg, rpg, apg, spg, bpg, topg);

    }

    /**
     * This is a constructor that makes an NBAPLayer object based on their name
     * and their corresponding hierarchy score.
     * 
     * @param hs   variable for a player's hierarchy score
     * @param name variable for a player's name
     */
    public NBAPlayer(float hs, String name) {
        super(hs, name);
    }

    /**
     * This method correctly formats the information of the NBAPlayer class when
     * printing their season average statistics.
     */
    public String toString() {
        return String.format(
                "%s\tPoints: %.1f\t Rebounds: %.1f\tAssists: %.1f\tSteals: %.1f\tBlocks: %.1f\tTurnovers: %.1f",
                getName(), getPointsPG(), getReboundsPG(), getAssistsPG(),
                getStealsPG(), getBlocksPG(), getTurnoversPG());
    }

    /**
     * This method correctly formats the information of the NBAPlayer class when
     * printing their hierarchy score.
     * 
     * @return returns formatted hierarchy score
     */
    public String toStringHierarchy() {
        return String.format("%s\tHiearchy Score: %.1f", getName(),
                getHierarchyScore());
    }

}
