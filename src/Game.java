public class Game {

    // 4 downs is a turnover

    // 100 yards is 6 points

    // extra field kick is 1 point

    // random boolean for point conversion

    private int score, yards, downs;

    private Team teamWPossession;
    private HomeTeam home;
    private AwayTeam away;

    // if 4 downs, ball gets switched to the other class

    public Team queryPossession() {
        return teamWPossession;
    }

    public void switchPossession() {
        if (teamWPossession == home) {
            teamWPossession = away;
        } else {
            teamWPossession = home;
        }
    }

    public Game(HomeTeam homeTeam, AwayTeam visitorTeam) {
        this.home = homeTeam;
        this.away = visitorTeam;
        this.teamWPossession = home;
        System.out.println(home.toString() + " has possession");
    }

}