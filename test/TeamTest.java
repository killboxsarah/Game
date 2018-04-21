import org.junit.Test;

import java.awt.*;

import static org.junit.Assexrt.assertEquals;

public class TeamTest {

    @Test
    public void testExtendsTeam() {
        assertEquals(Team.class, HomeTeam.class.getSuperclass());
    }

    @Test
    public void testAssociatesColor() {
        HomeTeam homeTeam = new HomeTeam();

        assertEquals(Color.BLUE, homeTeam.getTeamColor1());
        assertEquals(Color.WHITE, homeTeam.getTeamColor2());
        System.out.println(homeTeam.getTeamColor1().toString() + homeTeam.getTeamColor2().toString());
    }

}

