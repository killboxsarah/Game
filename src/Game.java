import java.util.Random;

public class Game {

    // 4 downs is a turnover
    // 100 yards is 6 points
    // extra field kick is 1 point
    // random boolean for point conversion

    private int score, yards, downs;

    private Team teamWPossession;
    private HomeTeam home;
    private AwayTeam away;


    public boolean homeTeamWinsCoinFlip(){

    Random ranNumGen = new Random();
    int result = ranNumGen.nextInt(2);
            if(result == 0){

                System.out.println("Home team won coin flip“);
                return true;
            }else{
                
                System.out.println(“You flipped Tails!“);
            }
        }

    public Team queryPossession() {
        return teamWPossession;
    }

    public void switchPossession() {
        if (teamWPossession == home ) {
        } { teamWPossession = away;
            }
            System.out.println(home.toString());
        }

    public Game(HomeTeam homeTeam, AwayTeam visitorTeam) {
        this.home = homeTeam;
        this.away = visitorTeam;
        this.teamWPossession = home;
        System.out.println(home.toString() + " is playing the " + away.toString() + " at Ford Field today.");
        System.out.println(home.toString() + " has possession");

    }

}