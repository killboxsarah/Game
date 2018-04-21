import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Random;

import static org.junit.Assert.*;

public class GameTest {

    private static HomeTeam team1;
    private static AwayTeam team2;
    private static Game testGame;

    @BeforeClass
    public static void setUp() {
        team1 = new HomeTeam();
        team2 = new AwayTeam();
        testGame = new Game(team1, team2);

    }

    @Test
    public void testSwitchPossession() {
        Team currentTeamWPossession = testGame.queryPossession();
        assertEquals(team1, currentTeamWPossession);
        testGame.switchPossession();
        currentTeamWPossession = testGame.queryPossession();
        assertEquals(team2, currentTeamWPossession);
    }

    @Test
    public void coingFlipTest() {
        testGame.homeTeamWinsCoinFlip();
    }

    @Test
    public void testFourDowns() {
        fail("Not implemented yet.");
    }

}