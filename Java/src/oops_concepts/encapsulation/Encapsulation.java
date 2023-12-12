package oops_concepts.encapsulation;

public class Encapsulation {

    private String bowler;

    private String batter;

    private int score;


    // Default Constructor: 
    Encapsulation() {
        System.out.println("Default Constructor");
    }


    // Parameterized Constructor: If we want to initialize the variables of the class with our own values then parameterized constructor comes into picture.
    public Encapsulation(String bowler, String batter, int score) {
        this.bowler = bowler;
        this.batter = batter;
        this.score = score;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        bowler = this.bowler;
    }


    public String getBatter() {
        return batter;
    }

    public void setBatter(String batter) {
        batter = this.batter;
    }

    public int getScore() {
        return score;
    }


    public void setScore(int score) {
        score = this.score;
    }


}
