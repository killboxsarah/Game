import java.awt.*;

public class Team {

    public Color teamColor1, teamColor2;
    public String name;

    public Team(String teamName) {
        this.name = teamName;
        this.teamColor1 = teamColor1;
        this.teamColor2 = teamColor2;
    }

    public Color getTeamColor1() {
        return teamColor1;
    }

    public Color getTeamColor2() {
        return teamColor2;
    }

    public String toString(){
        return name;
    }
}



